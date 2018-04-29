package com.itii.planning.gui.task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;


public class PanneauPrincipalTask extends JPanel //nouvelle fenetre pour création de tâche
{
	private static final long serialVersionUID = 1L;
	
	public JDatePicker calendar = getCalendar(); //on déclare le JdatePicker

    public JDatePicker getCalendar() //accesseur calendrier
    {
        if (calendar == null) //si y'a pas de calendrier
        {
            UtilDateModel model = new UtilDateModel(); //on déclare un model
            Calendar cal = Calendar.getInstance(); //on crée le calendrier
            model.setDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_WEEK)); //on récupère la bonne période
            calendar = new JDatePicker(model, "dd-MM-yyyy");
        }
        return calendar;
    }

	public PanneauPrincipalTask() //constructeur
	{
		JPanel NamePanel = new JPanel(); //On crée un pannel
		JTextField nameBox = new JTextField(40); //On crée une zone de text
		NamePanel.add(nameBox); //on ajoute la zone de texte au pannel
		
		//Idem pour le DatePanel
		JPanel DatePanel = new JPanel();
		JTextField dateBox = new JTextField(25);
		dateBox.setSize(20, 20); //on met une taille
		DatePanel.add(calendar); //on ajoute en plus le calendrier
		
		//Idem pour le CommentPanel
		JPanel CommentPanel = new JPanel();
		JTextField commentBox = new JTextField(25);
		commentBox.setSize(20, 40);
		CommentPanel.add(dateBox);
		CommentPanel.add(commentBox);
		
        GridLayout grille = new GridLayout(2, 0, 10, 10); //on lui crée une grille (nb lignes, nb colonnes, horizontal gap, vertical gap)
        CommentPanel.setLayout(grille); //on ajoute la grille

        //on dispose les panels en border layout
        setLayout(new BorderLayout());
        add(NamePanel, BorderLayout.NORTH); //on met le NamePanel en haut
        add(CommentPanel, BorderLayout.WEST); //on met le CommentPanel a gauche
        add(DatePanel, BorderLayout.CENTER); //on met le Date Panel au centre

        //On met les couleurs
        NamePanel.setBackground(Color.WHITE);
        DatePanel.setBackground(Color.WHITE);
        CommentPanel.setBackground(Color.WHITE);
	}

	public JPanel getPanneauPrincipalTask() //accesseur
	{ 
		return this;
	}
}
