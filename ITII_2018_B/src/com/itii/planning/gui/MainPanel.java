package com.itii.planning.gui;

import javax.swing.*;

import java.awt.*;

public class MainPanel extends JPanel {


	public MainPanel() {
		setBackground(Color.gray);
		// setVisible(true);
		// mainPanel = new JPanel();

		this.setLayout(new BorderLayout());

		// creation
		PanneauTop pTop = new PanneauTop();
		PanneauListe pListe = new PanneauListe();
		PanneauBouton pBtn = new PanneauBouton();

		add(pTop, BorderLayout.NORTH);
		add(pListe, BorderLayout.CENTER);
		add(pBtn, BorderLayout.EAST);

	}

	public JPanel getMainPanel() {
		return this;
	}
}