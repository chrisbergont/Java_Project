package com.itii.planning.gui.task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

import com.itii.planning.gui.PanneauListe;

public class TaskDialog extends JDialog implements ActionListener // nouvelle fenetre pour creation de tache
{
	
	public String tache;
	private static final long serialVersionUID = 1L;
	PanneauTexte LeftBorder = new PanneauTexte(); // on declare le panneau de gaucge avec le text
	PanneauBas BotBorder = new PanneauBas(this); // on declare le panneau du bas avec les boutons
	public PanneauPrincipalTask MainPanel = new PanneauPrincipalTask(); // On declare le panneau central
	PanneauListe pl;
	
	public TaskDialog( PanneauListe panneauList ) // on cree la fenetre
	{
		initialize();
		pl = panneauList;
	}

	private void initialize() {
		setSize(600, 400); // taille
		setVisible(true); // visible
		setTitle("Ajout d'une date"); // titre
		
		tache = "";

		// on positionne les panels
		setLayout(new BorderLayout()); // on positionne en BorderLayout
		add(LeftBorder, BorderLayout.WEST); // gauche
		add(BotBorder, BorderLayout.SOUTH); // bas
		add(MainPanel, BorderLayout.CENTER); // centre

		// on set la couleur
		setBackground(Color.WHITE);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		validate();
		repaint();
	}
	public void actionPerformed(ActionEvent e) // si on a clique sur boutonCreer
	{	
		tache = "";
		JButton b = (JButton ) e.getSource();	// on regarde quel bouton a ete appuye
	    if (b == BotBorder.Annuler) {
	    	this.dispose();  // on ferme la TaskDialog si bouton Annuler appuyer
	    }
	    if(b == BotBorder.OK){
	    	tache = MainPanel.getLabel();
	    	System.out.println(tache=="");
	    	if(!";;".equals(tache)){
	    		pl.addTask(tache);
	    	}
	    	this.dispose();
	    }
	}
}
