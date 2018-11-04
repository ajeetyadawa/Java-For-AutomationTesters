package javaSwing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class layoutmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		layoutmanager gui = new layoutmanager();
gui.go();
	}
public void go() {
	JFrame frame = new JFrame();
	JButton east = new JButton("East");
	JButton west = new JButton("West");
	JButton north = new JButton("North");
	JButton center = new JButton("Center");
	JButton south = new JButton("South");
	
	frame.getContentPane().add(BorderLayout.EAST,east);
	frame.getContentPane().add(BorderLayout.NORTH,north);
	frame.getContentPane().add(BorderLayout.SOUTH,south);
	frame.getContentPane().add(BorderLayout.CENTER,center);
	frame.getContentPane().add(BorderLayout.WEST,west);
	frame.setSize(450, 356);
	frame.setVisible(true);
	
	}
}
