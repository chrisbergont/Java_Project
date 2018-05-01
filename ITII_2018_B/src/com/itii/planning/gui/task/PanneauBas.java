package com.itii.planning.gui.task;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.itii.planning.gui.MainWindow;

public class PanneauBas extends JPanel implements ActionListener//nouvelle fenetre pour création de tâche
{
	private static final long serialVersionUID = 1L;
	private JButton Annuler = new JButton("Annuler"); //Bouton annulé
	private JButton OK = new JButton("OK"); //Bouton Ok
	private JLabel labelInvisible = new JLabel("            "); //Bouton Vide pour décaler le bordel
	
    public PanneauBas() //constructeur
    {
        // Ajout des boutons en bas de la fenêtre
        GridLayout grilleButton = new GridLayout(1, 5, 20, 100); //on lui crée une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        setLayout(grilleButton); //on met la grille
        
        //Création de 3 boutons
        
        
        //on les ajoute
        add(labelInvisible); 
        add(Annuler);
        add(OK);
        
        //on set la couleur
        setBackground(Color.WHITE);
        Annuler.addActionListener(this); // on écoute si y'a une action
    }

	public JPanel getPanneauBas() //accesseur
	{ 
		return this;
	}
	
	public void actionPerformed(ActionEvent e) // si on a cliqué sur boutonCreer
	{	
		JButton b = (JButton ) e.getSource();	// on regarde quel bouton a été appuyé
	    if (b == Annuler) {
	    	//TaskDialog.dispose();  // on ferme la TaskDialog si bouton Annuler appuyer
	    }
		
	}
}
