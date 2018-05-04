package com.itii.planning.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JComboBox;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.itii.planning.gui.task.PanneauPrincipalTask;
import com.itii.planning.gui.task.TaskDialog;
import com.itii.planning.gui.version.WindowVersion;
import com.itii.planning.gui.aide.WindowAide;

public class PMenuBar extends JMenuBar implements ActionListener // classe de la barre de Menu
{
	private static final long serialVersionUID = 1L;

	// on cree tous les objets necessaires pour construire les menu deroulants
	private JMenu fichier = new JMenu("Fichier");
	private JMenu edition = new JMenu("Edition");
	private JMenu vue = new JMenu("Vue");
	private JMenu help = new JMenu("?");

	// fichier
	private JMenuItem quitter = new JMenuItem("Quitter");

	// edition
	private JMenuItem creer = new JMenuItem("Creer");
	private JMenuItem editer = new JMenuItem("Editer");
	private JMenuItem marquer = new JMenuItem("Marquer");
	private JMenuItem dupliquer = new JMenuItem("Dupliquer");
	private JMenuItem supprimer = new JMenuItem("Supprimer");

	// vue
	private JMenuItem liste = new JMenuItem("Liste");
	private JMenuItem semaine = new JMenuItem("Semaine");
	private JMenuItem mois = new JMenuItem("Mois");

	// aide
	private JMenuItem aide = new JMenuItem("Aide");
	private JMenuItem version = new JMenuItem("Version");

	public PMenuBar() {
		// on ajoute a la fenetre tous les objets crees
		add(fichier);
		add(edition);
		add(vue);
		add(help);

		// ajout des objets qui appartiennent a l objet fichier
		fichier.add(quitter);

		// ajout des objets qui appartiennent a l objet edition
		edition.add(creer);
		edition.add(editer);
		edition.add(marquer);
		edition.add(dupliquer);
		edition.add(supprimer);

		// ajout des objets qui appartiennent a l objet vue
		vue.add(liste);
		vue.add(semaine);
		vue.add(mois);

		// ajout des objets qui appartiennent a l objet aide
		help.add(aide);
		help.add(version);
		
		creer.addActionListener(this); // on �coute si y'a une action
		quitter.addActionListener(this); // on �coute si y'a une action
		aide.addActionListener(this); // on �coute si y'a une action
		version.addActionListener(this); // on �coute si y'a une action	
	}


	public static PMenuBar getMyMenuBar() // accesseur Barre de menu
	{
		return new PMenuBar();
	}
	
	public void actionPerformed(ActionEvent e) // si on a cliqu� sur boutonCreer
	{	
		JMenuItem b = (JMenuItem ) e.getSource();	// on regarde quel bouton a �t� appuy�
	    if (b == creer) {
	    	TaskDialog creation = new TaskDialog(); // on ouvre une TaskDialog si bouton c'est le bouton cr�er
	    } 
	    if (b == quitter) { 
	    	MainWindow.getInstance().dispose();  // on ferme la Jrame si bouton c'est le bouton quitter
	    }
	    if (b == aide) {
	    	WindowAide aide = new WindowAide(); //on ouvre une f�netre avec les instructions d'aide
	    }
	    if (b == version) {
	    	WindowVersion version = new WindowVersion(); //on ouvre une fenetre d'information sur le numero de version
	    }
		
	}
}
