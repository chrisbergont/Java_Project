package com.itii.planning.gui.task;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauBas extends JPanel {	//nouvelle fenetre pour creation de tache

	private static final long serialVersionUID = 1L;
	public JButton Annuler = new JButton("Annuler"); //Bouton annuler
	public JButton OK = new JButton("OK"); //Bouton Ok
	private JLabel labelInvisible = new JLabel("            "); //Bouton Vide pour decaler le tout
	
    public PanneauBas( TaskDialog td) { //constructeur
    
        // Ajout des boutons en bas de la fenetre
        GridLayout grilleButton = new GridLayout(1, 5, 20, 100); //on lui cree une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        setLayout(grilleButton); //on met la grille
        
        //Creation de 3 boutons
        
        
        //on les ajoute
        add(labelInvisible); 
        add(Annuler);
        add(OK);
        
        //on set la couleur
        setBackground(Color.WHITE);
        Annuler.addActionListener(td); // on ecoute si y'a une action
        OK.addActionListener(td);
    }

	public JPanel getPanneauBas() { //accesseur 
		return this;
	}
}
