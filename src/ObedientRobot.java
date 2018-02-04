import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot dog = new Robot();

	public static void main(String[] args) {
		dog.penDown();
		dog.setSpeed(10);
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		if (color.equalsIgnoreCase("Red")) {
			dog.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("Blue")) {
			dog.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("orange")) {
			dog.setPenColor(Color.ORANGE);
		} else if (color.equalsIgnoreCase("green")) {
			dog.setPenColor(Color.green);
		} else if (color.equals("Yellow")) {
			dog.setPenColor(Color.YELLOW);
		} else {
			dog.setRandomPenColor();
		}
		String shape = JOptionPane.showInputDialog("Which shape do you want: circle, square, or triangle?");
		if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		} else if (shape.equalsIgnoreCase("Circle")) {
			drawCircle();
		} else if (shape.equalsIgnoreCase("Square")) {
			drawSquare();
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			dog.move(100);
			dog.turn(90);
		}
	}

	static void drawTriangle() {
		for (int c = 0; c < 3; c++) {
			dog.move(100);
			dog.turn(120);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			dog.move(1);
			dog.turn(1);
		}
	}

}
