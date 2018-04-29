package com.itii.planning.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.itii.planning.gui.task.TaskDialog;

public class PanneauBouton extends JPanel implements ActionListener //classe du panneau de droite avec les boutons
{
	
	//on crée tout les boutons
    JLabel  spaceup = new JLabel (" "); //on fait un bouton vide pour laisser un espace en haut
    JButton boutonCreer = new JButton("Créer");
    JButton boutonEditer = new JButton("Editer");
    JButton boutonMarquer = new JButton("Marquer");
    JButton boutonDupliquer = new JButton("Dupliquer");
    JButton boutonSupprimer = new JButton("Supprimer");
    JLabel  space = new JLabel (" "); //on fait un bouton vide pour laisser un espace en bas
    JLabel  space1 = new JLabel (" "); //on fait un bouton vide pour laisser un espace en bas
    JLabel  space2 = new JLabel (" "); //on fait un bouton vide pour laisser un espace en bas
    String format = "dd/MM/yyyy"; //on crée un format de date
    java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
    java.util.Date date = new java.util.Date(); // on recupère la date
    JLabel dateJour = new JLabel(formater.format(date)); //on affiche la date

    
    public PanneauBouton() //constructeur
    {
    	setBackground(Color.white); //couleur de fond
        this.add(spaceup);
        GridLayout grille = new GridLayout(15,1,0,10); //on lui crée une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        setLayout(grille); //on integre la grille
        
        //on ajoute tout les bouutons et la date
        this.add(space);
        this.add(space1);
        this.add(space2);
        this.add(boutonCreer);
        this.add(boutonEditer);
        this.add(boutonMarquer);
        this.add(new JButton("Dupliquer"));
        this.add(new JButton("Supprimer"));
        this.add(dateJour);
        
        boutonCreer.addActionListener(this); //on écoute si y'a une action
    }
    
    public void actionPerformed(ActionEvent e) //si on a cliqué sur boutonCreer
    {
    	TaskDialog creation = new TaskDialog(); //on ouvre une TaskDialog
    }
}
