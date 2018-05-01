package com.itii.planning.gui.version;

import javax.swing.JOptionPane;

public class WindowVersion extends JOptionPane //nouvelle fenetre pour la version
{
	private static final long serialVersionUID = 1L;

	public WindowVersion() // on crée la fenêtre version
	{
		showMessageDialog(null, "Version Beta\n Licence : Sébastien MARTAGEX", "Version", JOptionPane.INFORMATION_MESSAGE); //on affiche un message d'information
	}
}
