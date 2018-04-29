package com.itii.planning.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel { //classe MainPanel dérivée d'un Jpanel

	private static final long serialVersionUID = 1L;

	public MainPanel() //constructeur
	{
		setBackground(Color.gray); //on met une couleur au fond
		// setVisible(true);

		this.setLayout(new BorderLayout()); //on crée un borderLayout

		// creation des 3 pannels
		PanneauTop pTop = new PanneauTop();
		PanneauListe pListe = new PanneauListe();
		PanneauBouton pBtn = new PanneauBouton();

		// positionnement des 3 pannels dans le borderLayout
		add(pTop, BorderLayout.NORTH);
		add(pListe, BorderLayout.CENTER);
		add(pBtn, BorderLayout.EAST);
	}

	public JPanel getMainPanel() //accesseur
	{ 
		return this;
	}
}