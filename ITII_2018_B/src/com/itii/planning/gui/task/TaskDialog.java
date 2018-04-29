package com.itii.planning.gui.task;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class TaskDialog extends JDialog {
	public TaskDialog(){
		setVisible(true);
		setSize(200, 200);
		JLabel info = new JLabel("infos");
		add(info);
	}

}
