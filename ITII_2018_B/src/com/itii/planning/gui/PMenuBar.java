package com.itii.planning.gui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PMenuBar extends JMenuBar //classe de la barre de Menu
{
	private static final long serialVersionUID = 1L;
	
	//on cree tous les objets necessaires pour construire les menu deroulants
    private JMenu fichier = new JMenu("Fichier");
    private JMenu edition = new JMenu("Edition");
    private JMenu vue = new JMenu("Vue");
    private JMenu help = new JMenu("?");
    
    //fichier
    private JMenuItem quitter = new JMenuItem("Quitter");
    
    //edition
    private JMenuItem creer = new JMenuItem("Créer");
    private JMenuItem editer = new JMenuItem("Editer");
    private JMenuItem marquer = new JMenuItem("Marquer");
    private JMenuItem dupliquer = new JMenuItem("Dupliquer");
    private JMenuItem supprimer = new JMenuItem("Supprimer");
    
    //vue
    private JMenuItem liste = new JMenuItem("Liste");
    private JMenuItem semaine = new JMenuItem("Semaine");
    private JMenuItem mois = new JMenuItem("Mois");
    
    //aide
    private JMenuItem aide = new JMenuItem("Aide");
    private JMenuItem version = new JMenuItem("Version");
    
    public PMenuBar()
    {
    	//on ajoute a la fenetre tous les objets crees
        add(fichier);
        add(edition);
        add(vue);
        add(help);
        
        //ajout des objets qui appartiennent a l objet fichier
        fichier.add(quitter);
        
        //ajout des objets qui appartiennent a l objet edition
        edition.add(creer);
        edition.add(editer);
        edition.add(marquer);
        edition.add(dupliquer);
        edition.add(supprimer);
        
        //ajout des objets qui appartiennent a l objet vue
        vue.add(liste);
        vue.add(semaine);
        vue.add(mois);
        
        //ajout des objets qui appartiennent a l objet aide
        help.add(aide);
        help.add(version);
    }
    
	private JComboBox<?> combo = new JComboBox<Object>();
	
	private JLabel label = new JLabel("Liste");

	public static PMenuBar getMyMenuBar() //accesseur Barre de menu
	{
		return new PMenuBar();
	}
}
