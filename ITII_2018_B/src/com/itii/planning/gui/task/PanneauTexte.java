package com.itii.planning.gui.task;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauTexte extends JPanel //nouvelle fenetre pour création de tâche
{

    public PanneauTexte() //constructeur
    {
        // Ajout des Labels a gauche de la fenêtre
        GridLayout grilleName = new GridLayout(8, 1, 0, 10); //on lui crée une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        setLayout(grilleName); //on met la grille
        
        //On crée tout les labels
        JLabel labelTask = new JLabel("Nom de la tâche : ");
        JLabel labelDate = new JLabel("Date dûe : ");
        JLabel labelDetails = new JLabel("Détails : ");
        JLabel  space = new JLabel (" ");
        JLabel  space1 = new JLabel (" ");
        JLabel  space2 = new JLabel (" ");

        //On ajoute tout les labels
        add(labelTask);
        add(space);
        add(labelDate);
        add(space1);
        add(space2);
        add(labelDetails);
    }

	public JPanel getPanneauTexte() //accesseur
	{ 
		return this;
	}
}
