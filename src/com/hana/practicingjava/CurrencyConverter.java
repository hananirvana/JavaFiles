package com.hana.practicingjava;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.*;  
import javax.swing.*;

public class CurrencyConverter extends JFrame implements ActionListener{

	static JComboBox comboBox;
	public static void main(String[] args) {
		
		// JFrame = a GUI window to add components to a window
		ImageIcon image = new ImageIcon("icon.png"); // create an ImageIcon
		ImageIcon labelim = new ImageIcon("background.jpg");
		
		
		JLabel label = new JLabel();
		/* label.setIcon(labelim); */
		/*
		 * label.setText("Currency Converter");
		 * label.setHorizontalTextPosition(JLabel.CENTER);
		 * label.setVerticalTextPosition(JLabel.TOP); label.setForeground(new
		 * Color(0xFFFFFF)); label.setFont(new Font("Century Schoolbook", Font.BOLD,
		 * 50));
		 */
		/* label.setIconTextGap(-100); */
		
		JFrame frame = new JFrame(); // creates a frame
		frame.setTitle("Currency Converter"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit from application
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(800, 500); // sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); // make frame visible
		frame.add(label);
		
		  frame.setLayout(new FlowLayout()); 
		  
		  String[] currency = {"USD","IND","EUR"};
		  
		  comboBox = new JComboBox(currency);
		  comboBox.setBounds(0,0,90,20);    
		  
		  
		  frame.add(comboBox);
		  frame.setVisible(true);
		
		frame.setIconImage(image.getImage()); // change icon of frame
		frame.getContentPane().setBackground(new Color(0xCFCFCF)); // change color of
		// background
		
		 	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			   JOptionPane.showMessageDialog(null, comboBox.getSelectedItem());
			  }
	}

}
