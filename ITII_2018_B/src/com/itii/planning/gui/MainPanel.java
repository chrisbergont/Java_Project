package com.itii.planning.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{ // classe MainPanel dérivée d'un Jpanel

	private static final long serialVersionUID = 1L;
	
	// creation des pannels du mainpannel
	private PanneauTop pTop = new PanneauTop();
	private PanneauBouton pBtn = new PanneauBouton();
	//dont 3 panneau supperpositionnée
	private PanneauListe pListe = new PanneauListe();
	//private PanneauMois pMois = new PanneauMois();
	//private PanneauSemaine pSemaine = new PanneauSemaine();	
	
	public MainPanel() // constructeur
	{
		setBackground(Color.gray); // on met une couleur au fond
		//setVisible(true);

		setLayout(new BorderLayout()); // on crée un borderLayout

		// positionnement des 4 pannels dans le borderLayout
		add(pTop, BorderLayout.NORTH);
		add(pBtn, BorderLayout.EAST);
		
		pTop.add(pTop.comboBox, BorderLayout.CENTER); // on met la combobox au milieu
		
		add(pListe, BorderLayout.CENTER);
		pListe.setVisible(true); // on la met visible
				
	}

	public JPanel getMainPanel() // accesseur
	{
		return this;
	}
		
}