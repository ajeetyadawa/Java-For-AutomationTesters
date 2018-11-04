package javaSwing;
import javax.swing.*;
import java.awt.*;


public class panelShade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panelShade panel1 = new panelShade();
		panel1.go();
	}
public void go() {
	JFrame frame = new JFrame();
	JButton button= new JButton("click me");
	JPanel panel = new JPanel();
	panel.setBackground(Color.CYAN);
	frame.getContentPane().add(BorderLayout.EAST,panel);
	frame.getContentPane().add(BorderLayout.WEST, button);
	frame.setSize(450, 450);
	frame.setVisible(true);
}
}
