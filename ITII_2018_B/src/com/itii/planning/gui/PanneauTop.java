package com.itii.planning.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanneauTop extends JPanel //panneau de barre du haut
{
	private JComboBox comboBox= null;

	//constructeur
	public PanneauTop()
	{
		String[] selectChoice = { "Liste", "Semaine", "Mois" }; //on crée un string qu'on va passer dans la combobox
		this.setLayout(new BorderLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		comboBox = new JComboBox(selectChoice); //on passe la liste de string dans la combo
		JLabel label = new JLabel("Vue : "); //on crée une zone de texte
		
		add(label, BorderLayout.WEST); //on met la zone de texte devant la combobox
		this.add(comboBox, BorderLayout.CENTER); //on met la combobox au milieu
	}
}
