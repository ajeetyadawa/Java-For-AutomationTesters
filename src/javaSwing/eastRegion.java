package javaSwing;
import javax.swing.*;
import java.awt.*;

public class eastRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
eastRegion gui = new eastRegion();
gui.go();
	}
public void go() {
	JFrame frame = new JFrame();
	JButton button = new JButton("click me");
	frame.getContentPane().add(BorderLayout.EAST,button);
	frame.setSize(200,200);
	frame.setVisible(true);
}
}
