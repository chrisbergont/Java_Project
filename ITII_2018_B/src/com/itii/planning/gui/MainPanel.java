package com.itii.planning.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{ // classe MainPanel dérivée d'un Jpanel

	private static final long serialVersionUID = 1L;

	
	public MainPanel() // constructeur
	{
		setBackground(Color.gray); // on met une couleur au fond
		//setVisible(true);

		setLayout(new BorderLayout()); // on crée un borderLayout

		// creation des 4 pannels du mainpannel
		PanneauTop pTop = new PanneauTop();
		PanneauListe pListe = new PanneauListe();
		PanneauMois pMois = new PanneauMois();
		PanneauSemaine pSemaine = new PanneauSemaine();	
		
		PanneauBouton pBtn = new PanneauBouton();
		
		// positionnement des 4 pannels dans le borderLayout
		add(pTop, BorderLayout.NORTH);
		add(pBtn, BorderLayout.EAST);
		
		pTop.add(pTop.comboBox, BorderLayout.CENTER); // on met la combobox au milieu
		
		add(pListe, BorderLayout.CENTER);
		add(pMois, BorderLayout.CENTER);
		add(pSemaine, BorderLayout.CENTER);
		
		pListe.setVisible(true); // on la met visible
		pMois.setVisible(false); // on la met visible
		pSemaine.setVisible(true); // on la met visible
		
		
		
	}

	public JPanel getMainPanel() // accesseur
	{
		return this;
	}
		
}