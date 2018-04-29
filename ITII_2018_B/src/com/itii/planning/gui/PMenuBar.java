package com.itii.planning.gui;

import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PMenuBar extends JMenuBar 
{
	//on cree tous les objets necessaires pour construire les menu deroulants
    private JMenu fichier = new JMenu("Fichier");
    private JMenu edition = new JMenu("Edition");
    private JMenu vue = new JMenu("Vue");
    private JMenu help = new JMenu("?");
    
    //fichier
    private JMenuItem quitter = new JMenuItem("Quitter");
    
    //edition
    private JMenuItem creer = new JMenuItem("Creer");
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
        this.add(fichier);
        this.add(edition);
        this.add(vue);
        this.add(help);
        
        //ajout des objets qui appartiennent a l objet fichier
        this.fichier.add(quitter);
        
        //ajout des objets qui appartiennent a l objet edition
        this.edition.add(creer);
        this.edition.add(editer);
        this.edition.add(marquer);
        this.edition.add(dupliquer);
        this.edition.add(supprimer);
        
        //ajout des objets qui appartiennent a l objet vue
        this.vue.add(liste);
        this.vue.add(semaine);
        this.vue.add(mois);
        
        //ajout des objets qui appartiennent a l objet aide
        this.help.add(aide);
        this.help.add(version);
        

    }
    
	private JComboBox combo = new JComboBox();
	private JLabel label = new JLabel("Liste");

	public static PMenuBar getMyMenuBar(){
		
		return new PMenuBar();
	}
}
