package com.itii.planning.gui.task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;

public class PanneauBas extends JPanel //nouvelle fenetre pour cr�ation de t�che
{

    public PanneauBas() //constructeur
    {
        // Ajout des boutons en bas de la fen�tre
        GridLayout grilleButton = new GridLayout(1, 5, 20, 100); //on lui cr�e une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        setLayout(grilleButton); //on met la grille
        
      //Cr�ation de 3 boutons
        JButton Annuler = new JButton("Annuler"); //Bouton annul�
        JButton OK = new JButton("OK"); //Bouton Ok
        JLabel labelInvisible = new JLabel("            "); //Bouton Vide pour d�caler le bordel
        
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
