package com.itii.planning.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import com.itii.db.Database;
import com.itii.planning.gui.task.TaskDialog;

public class PanneauBouton extends JPanel implements ActionListener // classe du panneau de droite avec les boutons
{
	private static final long serialVersionUID = 1L;

	// on creer tous les boutons
	JLabel spaceup = new JLabel(" "); // on fait un bouton vide pour laisser un espace en haut
	JButton boutonCreer = new JButton("Creer");
	JButton boutonEditer = new JButton("Editer");
	JButton boutonMarquer = new JButton("Marquer");
	JButton boutonDupliquer = new JButton("Dupliquer");
	JButton boutonSupprimer = new JButton("Supprimer");
	JLabel space = new JLabel(" "); // on fait un bouton vide pour laisser un espace en bas
	JLabel space1 = new JLabel(" "); // on fait un bouton vide pour laisser un espace en bas
	JLabel space2 = new JLabel(" "); // on fait un bouton vide pour laisser un espace en bas
	String format = "dd/MM/yyyy"; // on cree un format de date
	java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
	java.util.Date date = new java.util.Date(); // on recupere la date
	JLabel dateJour = new JLabel(formater.format(date)); // on affiche la date
	public PanneauBouton() // constructeur
	{
		setBackground(Color.white); // couleur de fond
		add(spaceup);
		GridLayout grille = new GridLayout(15, 1, 0, 10); // on lui cree une grille (nb lignes, nb colonnes, horizontal
															// gap, vertical gap)
		setLayout(grille); // on integre la grille

		// on ajoute tout les bouutons et la date
		add(space);
		add(space1);
		add(space2);
		add(boutonCreer);
		add(boutonEditer);
		add(boutonMarquer);
		add(boutonSupprimer);
		add(boutonDupliquer);
		add(dateJour);

		boutonCreer.addActionListener(this); // on ecoute si y'a une action sur le bouton creer
		boutonDupliquer.addActionListener(this);
		boutonEditer.addActionListener(this);
		boutonMarquer.addActionListener(this);
		boutonSupprimer.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) // si on a clique sur boutonCreer
	{
		JButton b = (JButton ) e.getSource();	// on regarde quel bouton a ete appuye
	    if (b == boutonCreer) {
	    	System.out.println("btn creer clique");
	    	new TaskDialog(MainWindow.getInstance().getMyMainPanel().getpListe()); // on ouvre une TaskDialog
	    }
	    if(b == boutonEditer){
	    	System.out.println("btn editer clique");
	    	
	    	int[] selection = PanneauListe.planningList.getSelectedRows();
            TaskDialog dialog = new TaskDialog(MainWindow.getInstance().getMyMainPanel().getpListe());
            dialog.MainPanel.nameBox.setText((String) PanneauListe.planningList.getValueAt(selection[0], 0));
            dialog.MainPanel.calendar.setToolTipText((String) PanneauListe.planningList.getValueAt(selection[0], 1));
            dialog.MainPanel.commentBox.setText((String) PanneauListe.planningList.getValueAt(selection[0], 2));
            if(Database.createTable()) {
                Database.deleteTask(PanneauListe.planningList.getModel().getValueAt(selection[0], 0).toString());
            }
            ((DefaultTableModel) PanneauListe.planningList.getModel()).removeRow(selection[0]);
	    }
	    if(b == boutonDupliquer){
	    	System.out.println("btn dupliquer clique");
	    	
            int[] selection = PanneauListe.planningList.getSelectedRows();
            for (int i = 0; i < selection.length; i++)
            {
                ((DefaultTableModel) PanneauListe.planningList.getModel())
                        .addRow(new Object[] {PanneauListe.planningList.getValueAt(selection[i],0),
                        		PanneauListe.planningList.getValueAt(selection[i],1),
                        		PanneauListe.planningList.getValueAt(selection[i],2) });
                if (Database.createTable())
                {
                    Database.addTask(PanneauListe.planningList.getValueAt(selection[i], 0).toString(),
                                    PanneauListe.planningList.getValueAt(selection[i], 1).toString(),
                                    PanneauListe.planningList.getValueAt(selection[i], 2).toString(),false);
                }
            }
	    }
            
	    if(b == boutonMarquer){
	    	System.out.println("btn marquer clique");
	    }
	    
	    if(b == boutonSupprimer){
	    	System.out.println("btn supprimer clique");
            int[] selection = PanneauListe.planningList.getSelectedRows();

            for (int i = selection.length - 1; i >= 0; i--)
            {
                if (Database.createTable())
                {
                    Database.deleteTask(PanneauListe.planningList.getModel().getValueAt(i, 0).toString());
                    ((DefaultTableModel) PanneauListe.planningList.getModel()).removeRow(selection[i]);
                }
	    	}
	    }
		
	}
	
}
