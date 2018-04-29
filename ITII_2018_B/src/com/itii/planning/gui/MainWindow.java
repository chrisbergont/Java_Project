package com.itii.planning.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import sun.security.jca.GetInstance.Instance;

public class MainWindow extends JFrame { //class MainWindow qui est de type JFrame

	private PMenuBar menuBar; //on déclare une barre de menu
	
	private MainWindow() //constructeur
	{
		initialize();
	}

	private void initialize() //Fonction appelée part le constructeur
	{
		setSize(500, 500); //taille
		setTitle("Mon Planning"); //titre du haut de page
		setVisible(true); //on la met en visible
		MainPanel myMainPanel = new MainPanel();
		menuBar = new PMenuBar(); //on crée une barre de menu
		getContentPane().add(myMainPanel); //on met un Pannel
        setJMenuBar(PMenuBar.getMyMenuBar()); //on met ce qui va bien dans la barre 
		this.validate();
		this.repaint();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); //si on clique sur la croix on quitte
	}

	private static MainWindow instance;

	public static MainWindow getInstance() //singleton MainWindows
	{
		if (instance == null) 
		{
			instance = new MainWindow();
		}
		return instance;
	}
}
