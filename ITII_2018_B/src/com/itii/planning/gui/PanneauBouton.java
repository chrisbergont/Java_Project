package com.itii.planning.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.itii.planning.gui.task.TaskDialog;

public class PanneauBouton extends JPanel implements ActionListener // classe du panneau de droite avec les boutons
{
	private static final long serialVersionUID = 1L;

	// on cr�e tout les boutons
	JLabel spaceup = new JLabel(" "); // on fait un bouton vide pour laisser un espace en haut
	JButton boutonCreer = new JButton("Creer");
	JButton boutonEditer = new JButton("Editer");
	JButton boutonMarquer = new JButton("Marquer");
	JButton boutonDupliquer = new JButton("Dupliquer");
	JButton boutonSupprimer = new JButton("Supprimer");
	JLabel space = new JLabel(" "); // on fait un bouton vide pour laisser un espace en bas
	JLabel space1 = new JLabel(" "); // on fait un bouton vide pour laisser un espace en bas
	JLabel space2 = new JLabel(" "); // on fait un bouton vide pour laisser un espace en bas
	String format = "dd/MM/yyyy"; // on cr�e un format de date
	java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
	java.util.Date date = new java.util.Date(); // on recup�re la date
	JLabel dateJour = new JLabel(formater.format(date)); // on affiche la date
	public PanneauBouton() // constructeur
	{
		setBackground(Color.white); // couleur de fond
		add(spaceup);
		GridLayout grille = new GridLayout(15, 1, 0, 10); // on lui cr�e une grille (nb lignes, nb colonnes, horizontal
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

		boutonCreer.addActionListener(this); // on �coute si y'a une action
		boutonDupliquer.addActionListener(this);
		boutonEditer.addActionListener(this);
		boutonMarquer.addActionListener(this);
		boutonSupprimer.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) // si on a cliqu� sur boutonCreer
	{
		JButton b = (JButton ) e.getSource();	// on regarde quel bouton a �t� appuy�
	    if (b == boutonCreer) {
	    	System.out.println("btn creer cliquer");
	    	TaskDialog creation = new TaskDialog(MainWindow.getInstance().getMyMainPanel().getpListe()); // on ouvre une TaskDialog
	    }
	    if(b == boutonEditer){
	    	System.out.println("btn editer cliquer");
	    }
	    if(b == boutonDupliquer){
	    	System.out.println("btn dupliquer cliquer");
	    }
	    if(b == boutonMarquer){
	    	System.out.println("btn marquer cliquer");
	    }
	    if(b == boutonSupprimer){
	    	System.out.println("btn supprimer cliquer");
	    	System.out.println("row number : " + MainWindow.getInstance().getMyMainPanel().getpListe().getPlanningList().getSelectedRow());
	    	if(MainWindow.getInstance().getMyMainPanel().getpListe().getPlanningList().getSelectedRow() >= 0)
	    	{
	    		MainWindow.getInstance().getMyMainPanel().getpListe().removeTask(
	    				MainWindow.getInstance().getMyMainPanel().getpListe().getPlanningList().getSelectedRow());
	    	}
	    }
		
	}
	
}
