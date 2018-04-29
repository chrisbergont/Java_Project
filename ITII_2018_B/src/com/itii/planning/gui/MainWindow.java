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

public class MainWindow extends JFrame {

	private PMenuBar menuBar;
	private MainWindow() 
	{
		initialize();
	}

	private void initialize() 
	{
		setSize(500, 500);
		setTitle("Mon Planning");
		setVisible(true);
		MainPanel myMainPanel = new MainPanel();
		menuBar = new PMenuBar();  
		getContentPane().add(myMainPanel);
        setJMenuBar(PMenuBar.getMyMenuBar());
		this.validate();
		this.repaint();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}

	private static MainWindow instance;

	public static MainWindow getInstance() 
	{
		if (instance == null) 
		{
			instance = new MainWindow();
		}
		return instance;
	}
}
