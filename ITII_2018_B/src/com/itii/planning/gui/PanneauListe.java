package com.itii.planning.gui;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanneauListe extends PanneauTache // Quand on est en mode liste
{
	private static final long serialVersionUID = 1L;

	// constructeur
	public PanneauListe() {
		setLayout(new BorderLayout()); // on est en mode BorderLayout

		String title[] = { "Nom de la tache", "Date", "Details" }; // on a une liste de string

		DefaultTableModel tableModel = new DefaultTableModel(title, 0); // on d�clare un tableau qvec lq liste comme nom
		JTable planningList = new JTable(tableModel); // on cr�e un tableau

		((DefaultTableModel) planningList.getModel()).addRow(new Object[] { // on ajoute une ligne au tableau
				"Terminer le TP", "05/05/2018 20:20", "Pour avoir une super note!" });

		planningList.setFillsViewportHeight(true);

		JScrollPane scp = new JScrollPane(planningList); // on cr�e un JscrollPane si ca d�passe
		add(scp, BorderLayout.CENTER); // on l'ajoute
		
		
	}
	
}
