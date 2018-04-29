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

public class PanneauBouton extends JPanel implements ActionListener
{
	
    JLabel  spaceup = new JLabel (" ");
    JButton boutonCreer = new JButton("Creer");
    JButton boutonEditer = new JButton("Editer");
    JButton boutonMarquer = new JButton("Marquer");
    JButton boutonDupliquer = new JButton("Dupliquer");
    JButton boutonSupprimer = new JButton("Supprimer");
    JLabel  space = new JLabel (" ");
    JLabel  space1 = new JLabel (" ");
    JLabel  space2 = new JLabel (" ");
    String format = "dd/MM/yyyy";
    java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
    java.util.Date date = new java.util.Date();
    JLabel dateJour = new JLabel(formater.format(date));

    
    public PanneauBouton()
    {
    	setBackground(Color.white);
        this.add(spaceup);
        GridLayout grille = new GridLayout(15,1,0,10);

        setLayout(grille);
        this.add(space);
        this.add(space1);
        this.add(space2);

        this.add(boutonCreer);
        this.add(boutonEditer);
        this.add(boutonMarquer);
        this.add(new JButton("Dupliquer"));
        this.add(new JButton("Supprimer"));
        this.add(dateJour);
        
        boutonCreer.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
    	TaskDialog creation = new TaskDialog();
    }
}
