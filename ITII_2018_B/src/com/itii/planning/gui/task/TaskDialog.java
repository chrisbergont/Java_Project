package com.itii.planning.gui.task;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class TaskDialog extends JDialog //nouvelle fenetre pour cr�ation de t�che
{
	public TaskDialog()
	{
		setVisible(true); //on la met visible
		setSize(200, 200); //taille
		JLabel info = new JLabel("infos");
		add(info);
	}

}
