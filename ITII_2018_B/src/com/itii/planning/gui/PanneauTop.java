package com.itii.planning.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanneauTop extends JPanel 
{
	private JComboBox comboBox= null;

	//constructeur
	public PanneauTop()
	{
		String[] selectChoice = { "Liste", "Semaine", "Mois" };
		this.setLayout(new BorderLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		comboBox = new JComboBox(selectChoice);
		JLabel label = new JLabel("Vue : ");
		
		add(label, BorderLayout.WEST);
		this.add(comboBox, BorderLayout.CENTER);
	}
}
