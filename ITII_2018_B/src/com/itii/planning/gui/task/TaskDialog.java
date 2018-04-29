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

public class TaskDialog extends JDialog //nouvelle fenetre pour cr�ation de t�che
{

    public TaskDialog() //on cr�e la fen�tre
    {
        initialize();
    }

    private void initialize()
    {
        setSize(600, 400); //taille
        setVisible(true); //visible
        setTitle("Ajout d'une date"); //titre

        PanneauTexte LeftBorder = new PanneauTexte(); //on d�clare le panneau de gaucge avec le text
        PanneauBas BotBorder = new PanneauBas(); //on d�clare le panneau du bas avec les boutons
        PanneauPrincipalTask MainPanel = new PanneauPrincipalTask(); //On d�clare le panneau central
        
        //on positionne les panels
        setLayout(new BorderLayout()); //on positionne en BorderLayout
        add(LeftBorder, BorderLayout.WEST); //gauche
        add(BotBorder, BorderLayout.SOUTH); //bas
        add(MainPanel, BorderLayout.CENTER); //centre
       
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        validate();
        repaint();
    }
}
