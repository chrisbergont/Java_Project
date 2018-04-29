package com.itii.planning.gui;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanneauListe extends PanneauTache {
	// constructeur
	public PanneauListe() {
		this.setLayout(new BorderLayout());

		String title[] = { "Nom de la tâche", "Date dûe", "Détails" };

		DefaultTableModel tableModel = new DefaultTableModel(title, 0);
		JTable planningList = new JTable(tableModel);
		((DefaultTableModel) planningList.getModel()).addRow(new Object[] {
				"Terminer le TP", "2018/05/05 20:20",
				"Pour avoir une super note!" });
		planningList.setFillsViewportHeight(true);
		
		JScrollPane scp = new JScrollPane(planningList);
		this.add(scp, BorderLayout.CENTER);

	}
}
