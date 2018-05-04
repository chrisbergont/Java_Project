package com.itii.planning.gui.aide;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
 
public class WindowAide extends JDialog{
 
	private static final long serialVersionUID = 1L;
 
	public WindowAide(){
		setVisible(true); // on la met en visible
		setTitle("Aide"); //On donne un titre � l'application
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
		setSize(400,200); //On donne une taille � notre fen�tre
		setResizable(false); //On interdit la redimensionnement de la fen�tre
		setContentPane(buildContentPane());
	}
 
	private JPanel buildContentPane(){
		JPanel panel = new JPanel(); //on construit un panel
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE); //on lui passe un fond blanc
		JLabel label = new JLabel("Blablabla"); //on met le contenu qu'on veut
		panel.add(label);
		
		return panel;
	}
}