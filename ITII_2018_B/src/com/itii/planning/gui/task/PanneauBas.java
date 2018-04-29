package com.itii.planning.gui.task;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauBas extends JPanel //nouvelle fenetre pour création de tâche
{
	private static final long serialVersionUID = 1L;

    public PanneauBas() //constructeur
    {
        // Ajout des boutons en bas de la fenêtre
        GridLayout grilleButton = new GridLayout(1, 5, 20, 100); //on lui crée une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        setLayout(grilleButton); //on met la grille
        
      //Création de 3 boutons
        JButton Annuler = new JButton("Annuler"); //Bouton annulé
        JButton OK = new JButton("OK"); //Bouton Ok
        JLabel labelInvisible = new JLabel("            "); //Bouton Vide pour décaler le bordel
        
        //on les ajoute
        add(labelInvisible); 
        add(Annuler);
        add(OK);
    }

	public JPanel getPanneauBas() //accesseur
	{ 
		return this;
	}
}
