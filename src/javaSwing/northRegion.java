package javaSwing;
import javax.swing.*;
import java.awt.*;

public class northRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
northRegion gui = new northRegion();
gui.go();
	}
public void go() {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click me");
	frame.getContentPane().add(BorderLayout.NORTH,button);
	Font bigFont = new Font("serif",Font.BOLD,35);
	button.setSize(350,350);
	frame.setSize(200,200);
	frame.setVisible(true);
}
}
