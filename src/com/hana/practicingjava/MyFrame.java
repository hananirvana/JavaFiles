package com.hana.practicingjava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox comboBox;
	 
	 MyFrame(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLayout(new FlowLayout()); 
	  
	  String[] currency = {"USD","IND","EUR"};
	  
	  comboBox = new JComboBox(currency);
	  comboBox.addActionListener(this);
	  
	  //comboBox.setEditable(true);
	  //System.out.println(comboBox.getItemCount());
	  //comboBox.addItem("horse");
	  //comboBox.insertItemAt("pig", 0);
	  //comboBox.setSelectedIndex(0);
	  //comboBox.removeItem("cat");
	  //comboBox.removeItemAt(0);
	  //comboBox.removeAllItems();
	  
	  this.add(comboBox);
	  this.pack();
	  this.setVisible(true);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==comboBox) {
	   JOptionPane.showMessageDialog(null, "You chose ___");
	  }
	 }
	}


