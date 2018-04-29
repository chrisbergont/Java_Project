package com.itii.planning.gui;

import javax.swing.JFrame;

public class MainWindow extends JFrame { // class MainWindow qui est de type JFrame

	private static final long serialVersionUID = 1L;

	private MainWindow() // constructeur
	{
		initialize();
	}

	private void initialize() // Fonction appelée part le constructeur
	{
		setSize(500, 500); // taille
		setTitle("Mon Planning"); // titre du haut de page
		setVisible(true); // on la met en visible
		MainPanel myMainPanel = new MainPanel();
		PMenuBar menuBar = new PMenuBar(); // on crée une barre de menu
		getContentPane().add(myMainPanel); // on met un Pannel
		setJMenuBar(PMenuBar.getMyMenuBar()); // on met ce qui va bien dans la barre
		validate();
		repaint();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // si on clique sur la croix on quitte
	}

	private static MainWindow instance;

	public static MainWindow getInstance() // singleton MainWindows
	{
		if (instance == null) {
			instance = new MainWindow();
		}
		return instance;
	}
}
