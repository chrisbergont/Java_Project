package com.itii.planning.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauTop extends JPanel implements ActionListener// panneau de barre du haut
{
	private static final long serialVersionUID = 1L;
	
	//combobox public car selon l action ecoutee dessus il faudra soit un panneau liste, soit un panneau mois, soit un panneau semaine
	public JComboBox<Object> comboBox = null;

	public JLabel lblText = new JLabel();	
	
	// constructeur
	public PanneauTop() {
		String[] selectChoice = { "Liste", "Mois", "Semaine" }; // on cr�e un string qu'on va passer dans la combobox
		setLayout(new BorderLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		comboBox = new JComboBox<Object>(selectChoice); // on passe la liste de string dans la combo
				
		JLabel label = new JLabel("Vue : "); // on cr�e une zone de texte
					
		add(label, BorderLayout.WEST); // on met la zone de texte devant la combobox
		add(comboBox, BorderLayout.CENTER); // on met la combobox au milieu
		
		add(lblText, BorderLayout.EAST);	//c'est un Label pour tester le foncionnement de la combobox, 
		//une fois son fonctionnement valid� il faudra supprimer lblText
		
		comboBox.setSelectedIndex(0);		//Dans la combobox on affiche "Liste par d�faut"
											//on aura 0 pour panneau Liste, 1 pour panneauMois et 2 pour panneauSemaine
		comboBox.addActionListener(this); 	//on ajoute un actionListenr � cette combobox
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			
			JComboBox<Object> cb = (JComboBox<Object>)e.getSource(); 	//pour lire l element selectionn�
			String msg = cb.getSelectedItem().toString();				//pour convertir l element en text
			
			switch (msg) {
				case "Liste" : 
					///ICI on devrait mettre le panneau liste setVisible(true)
				/*	MainWindow.getInstance().getMainPanel().add(MainPanel.pListe, BorderLayout.CENTER);
					MainPanel.add(MainPanel.pMois, BorderLayout.CENTER);
					MainPanel.add(MainPanel.pSemaine, BorderLayout.CENTER);
					
					pListe.setVisible(true); // on la met visible
					pMois.setVisible(false); // on la met visible
					pSemaine.setVisible(false); // on la met visible
							
				*/
					lblText.setText("Yous selected LISTE msg 1"); 		//label de test pour voir le fonctionnement de l action listener sur la comobox
					break;
					
				case "Mois" : 
					///ICI on devrait mettre le panneauMois avec setVisible(true) et les autres � "false"
					lblText.setText("Yous selected MOIS msg 2");
					break;
					
				case "Semaine" :
					///ICI on devrait mettre le panneauSemaine avec setVisible(true) et les autres � "false"
					lblText.setText("Yous selected SEMAINE msg 3");
					break;
			}
		}
		
	}
	
	
	

	
}
