package com.itii.planning;

import com.itii.db.Database;
import com.itii.planning.gui.MainWindow;

public class Launcher {

	public static void main(String[] args) { // Point d'entree du programme
		Database.createTable();
		MainWindow.getInstance(); // On lance la MainWindow
	}
}
