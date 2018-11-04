package javaSwing;
import java.awt.*;
import javax.swing.*;
public class twobutton {

	public static void main(String[] args) {
		twobutton gui = new twobutton();
		gui.go();
	}
public void go() {
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Click me");
	JButton button2 = new JButton("Click me");
	frame.getContentPane().add(BorderLayout.NORTH,button1);
	frame.getContentPane().add(BorderLayout.SOUTH,button2);
	frame.setSize(450, 450);
	frame.setVisible(true);
}
}
