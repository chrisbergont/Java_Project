package com.itii.planning.gui.task;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauTexte extends JPanel // nouvelle fenetre pour cr�ation de t�che
{
	private static final long serialVersionUID = 1L;

	public PanneauTexte() // constructeur
	{
		// Ajout des Labels a gauche de la fen�tre
		GridLayout grilleName = new GridLayout(8, 1, 0, 10); // on lui cr�e une grille (nb lignes, nb colonnes,
																// horizontal gap, vertical gap)
		setLayout(grilleName); // on met la grille

		// On cr�e tout les labels
		JLabel labelTask = new JLabel("Nom de la tache : ");
		JLabel labelDate = new JLabel("Date due : ");
		JLabel labelDetails = new JLabel("Details : ");
		JLabel space = new JLabel(" ");
		JLabel space1 = new JLabel(" ");
		JLabel space2 = new JLabel(" ");

		// On ajoute tout les labels
		add(labelTask);
		add(space);
		add(labelDate);
		add(space1);
		add(space2);
		add(labelDetails);

		// on set la couleur
		setBackground(Color.WHITE);
	}

	public JPanel getPanneauTexte() // accesseur
	{
		return this;
	}
}
