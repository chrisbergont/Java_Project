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
		add(new JButton("Dupliquer"));
		add(new JButton("Supprimer"));
		add(dateJour);

		boutonCreer.addActionListener(this); // on �coute si y'a une action
		
	}

	public void actionPerformed(ActionEvent e) // si on a cliqu� sur boutonCreer
	{
		TaskDialog creation = new TaskDialog(); // on ouvre une TaskDialog
	}
}
