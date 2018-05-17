package com.itii.planning.gui;

import com.itii.db.Database;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanneauListe extends PanneauTache // Quand on est en mode liste
{
	private static final long serialVersionUID = 1L;
	JTable planningList;
	
	// constructeur
	public PanneauListe() {
		setLayout(new BorderLayout()); // on est en mode BorderLayout

		String title[] = { "Nom de la tache", "Date", "Details" }; // on a une liste de string

		DefaultTableModel tableModel = new DefaultTableModel(title, 0); // on d�clare un tableau qvec lq liste comme nom
		planningList = new JTable(tableModel); // on cr�e un tableau

		planningList.setFillsViewportHeight(true);

		for(String t : Database.getAllTasks())//On charger la BDD
		{
			addTaskInView(t);
		}

		JScrollPane scp = new JScrollPane(planningList); // on cr�e un JscrollPane si ca d�passe
		add(scp, BorderLayout.CENTER);// on l'ajoute
	}
	
	
	public void addTask(String tache){
		String[] task;
		task = tache.split(";");
		System.out.println(tache);
		addTaskInView(tache);
		Database.addTask(task[0],task[1],task[2],false);

	}

	public void addTaskInView(String tache){
		String[] task;
		task = tache.split(";");
		((DefaultTableModel) planningList.getModel()).addRow(new Object[] { // on ajoute une ligne au tableau
				task[0], task[1], task[2] });

	}
	
	public void removeTask(int romNumber){
		((DefaultTableModel) planningList.getModel()).removeRow(romNumber); // on supprime une ligne au tableau
	}
	
	public JTable getPlanningList() {
		return planningList;
	}
}
