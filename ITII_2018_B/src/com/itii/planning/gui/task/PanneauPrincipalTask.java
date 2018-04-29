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
		JPanel mainNorth = new JPanel();
		JPanel mainCenter = new JPanel();
		JPanel mainWest = new JPanel();
        
        // Ajout des zones de textes
        JTextField nameBox = new JTextField(40);
        JTextField dateBox = new JTextField(25);
        JTextField commentBox = new JTextField(25);
        
        add(mainNorth);
        add(mainCenter);
        add(mainWest);

        mainNorth.add(nameBox);
        mainWest.add(dateBox);
        mainWest.add(commentBox);
        mainCenter.add(calendar);
        
        dateBox.setSize(20, 20);
        commentBox.setSize(20, 40);
        
        GridLayout grilleMainWest = new GridLayout(2, 0, 10, 10);
        mainWest.setLayout(grilleMainWest);

        setLayout(new BorderLayout());
        add(mainNorth, BorderLayout.NORTH);
        add(mainWest, BorderLayout.WEST);
        add(mainCenter, BorderLayout.CENTER);

        mainNorth.setBackground(Color.RED);
        mainCenter.setBackground(Color.BLUE);
        mainWest.setBackground(Color.BLACK);
	}

	public JPanel getPanneauPrincipalTask() //accesseur
	{ 
		return this;
	}
}
