package com.itii.planning.gui.task;

import java.awt.BorderLayout;
import javax.swing.JDialog;

public class TaskDialog extends JDialog //nouvelle fenetre pour création de tâche
{
	private static final long serialVersionUID = 1L;
	
    public TaskDialog() //on crée la fenêtre
    {
        initialize();
    }

    private void initialize()
    {
        setSize(600, 400); //taille
        setVisible(true); //visible
        setTitle("Ajout d'une date"); //titre

        PanneauTexte LeftBorder = new PanneauTexte(); //on déclare le panneau de gaucge avec le text
        PanneauBas BotBorder = new PanneauBas(); //on déclare le panneau du bas avec les boutons
        PanneauPrincipalTask MainPanel = new PanneauPrincipalTask(); //On déclare le panneau central
        
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
