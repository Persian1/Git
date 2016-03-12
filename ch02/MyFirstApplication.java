package ch02;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

public class MyFirstApplication {
	public static void main(String[] args) {

		// Övning 1
		System.out.println("I've coded, compiled, and run my first Java program!");

		// Övning 3
		//Toolkit.getDefaultToolkit(7).beep();
		 
		// Övning 4a
		JOptionPane.showMessageDialog(
				null,
				"Hej " + System.getProperty("user.name") + ", du kör "
						+ System.getProperty("os.name"));
	}  // Slut på main
}
