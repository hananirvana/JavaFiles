package com.hana.apps;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Hana  {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		  JLabel label = new JLabel();
		  frame.add(label);
		  frame.setDefaultCloseOperation
		         (JFrame.EXIT_ON_CLOSE);
		  frame.pack();
		  frame.setVisible(true);
	}
}
