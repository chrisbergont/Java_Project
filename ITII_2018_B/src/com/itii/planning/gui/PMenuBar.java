package com.itii.planning.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;

import com.itii.planning.gui.task.TaskDialog;
import com.itii.planning.gui.version.WindowVersion;
import com.itii.db.Database;
import com.itii.planning.gui.aide.WindowAide;

public class PMenuBar extends JMenuBar implements ActionListener // classe de la barre de Menu
{
	private static final long serialVersionUID = 1L;

	// on cree tous les objets necessaires pour construire les menu deroulants
	private JMenu fichier = new JMenu("Fichier");
	private JMenu edition = new JMenu("Edition");
	private JMenu vue = new JMenu("Vue");
	private JMenu help = new JMenu("?");

	// fichier
	private JMenuItem quitter = new JMenuItem("Quitter");

	// edition
	private JMenuItem creer = new JMenuItem("Creer");
	private JMenuItem editer = new JMenuItem("Editer");
	private JMenuItem marquer = new JMenuItem("Marquer");
	private JMenuItem dupliquer = new JMenuItem("Dupliquer");
	private JMenuItem supprimer = new JMenuItem("Supprimer");

	// vue
	private JMenuItem liste = new JMenuItem("Liste");
	private JMenuItem semaine = new JMenuItem("Semaine");
	private JMenuItem mois = new JMenuItem("Mois");

	// aide
	private JMenuItem aide = new JMenuItem("Aide");
	private JMenuItem version = new JMenuItem("Version");

	public PMenuBar() {
		// on ajoute a la fenetre tous les objets crees
		add(fichier);
		add(edition);
		add(vue);
		add(help);

		// ajout des objets qui appartiennent a l objet fichier
		fichier.add(quitter);

		// ajout des objets qui appartiennent a l objet edition
		edition.add(creer);
		edition.add(editer);
		edition.add(marquer);
		edition.add(dupliquer);
		edition.add(supprimer);

		// ajout des objets qui appartiennent a l objet vue
		vue.add(liste);
		vue.add(semaine);
		vue.add(mois);

		// ajout des objets qui appartiennent a l objet aide
		help.add(aide);
		help.add(version);
		
		creer.addActionListener(this); // on ecoute si y'a une action
		editer.addActionListener(this); // on ecoute si y'a une action
		marquer.addActionListener(this); // on ecoute si y'a une action
		dupliquer.addActionListener(this); // on ecoute si y'a une action
		supprimer.addActionListener(this); // on ecoute si y'a une action
		quitter.addActionListener(this); // on ecoute si y'a une action
		aide.addActionListener(this); // on ecoute si y'a une action
		version.addActionListener(this); // on ecoute si y'a une action	
	}

	// accesseur Barre de menu
	public static PMenuBar getMyMenuBar() { 
	
		return new PMenuBar();
	}
	
	public void actionPerformed(ActionEvent e) // si on a clique sur boutonCreer
	{	
		JMenuItem b = (JMenuItem ) e.getSource();	// on regarde quel bouton a ete appuye
	    if (b == creer) {
	    	System.out.println("btn creer clique");
	    	new TaskDialog(MainWindow.getInstance().getMyMainPanel().getpListe()); // on ouvre une TaskDialog	    
	    } 
	    if (b == editer) {
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
	    if (b == dupliquer) {
	    	System.out.println("btn dupliquer clique");
	    	
            int[] selection = PanneauListe.planningList.getSelectedRows();
            for (int i = 0; i < selection.length; i++) {
                ((DefaultTableModel) PanneauListe.planningList.getModel())
                        .addRow(new Object[] {PanneauListe.planningList.getValueAt(selection[i],0),
                        		PanneauListe.planningList.getValueAt(selection[i],1),
                        		PanneauListe.planningList.getValueAt(selection[i],2) });
                if (Database.createTable()){
                    Database.addTask(PanneauListe.planningList.getValueAt(selection[i], 0).toString(),
                                    PanneauListe.planningList.getValueAt(selection[i], 1).toString(),
                                    PanneauListe.planningList.getValueAt(selection[i], 2).toString(), false);
                }
            }
	    } 
	    if (b == marquer) {
	    	System.out.println("btn marquer clique");
	    } 
	    if (b == supprimer) {
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
	    if (b == quitter) { 
	    	MainWindow.getInstance().dispose();  // on ferme la Jrame si bouton c'est le bouton quitter
	    }
	    if (b == aide) {
	    	WindowAide aide = new WindowAide(); //on ouvre une fenetre avec les instructions d'aide
	    }
	    if (b == version) {
	    	WindowVersion version = new WindowVersion(); //on ouvre une fenetre d'information sur le numero de version
	    }
		
	}
}
