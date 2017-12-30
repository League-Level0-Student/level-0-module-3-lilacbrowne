
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot cat = new Robot();
for(int i = 0; i < 10; i++)	{	
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw with?");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("Purple")) {
	cat.setPenColor(127, 0, 255);
} else if (color.equalsIgnoreCase("Orange")) {
	cat.setPenColor(255, 128, 0);
} else if (color.equalsIgnoreCase("Green")) {
	cat.setPenColor(Color.green);
} else if (color.equalsIgnoreCase("Blue")) {
	cat.setPenColor(Color.blue); 
} else if (color.equalsIgnoreCase("Red")) {
	cat.setPenColor(Color.red);
} else if (color.equalsIgnoreCase("Cyan")) {
	cat.setPenColor(Color.cyan);
} else if (color.equalsIgnoreCase("Gray")) {
	cat.setPenColor(Color.GRAY);
} else if (color.equalsIgnoreCase("Black")) {
	cat.setPenColor(Color.black);
} else if (color.equalsIgnoreCase("Pink")) {
	cat.setPenColor(Color.pink);
} else {
	cat.setRandomPenColor();
}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		cat.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		cat.penDown();
		cat.setSpeed(10);
		cat.move(100);
		cat.turn(90);
		cat.move(100);
		cat.turn(90);
		cat.move(100);
		cat.turn(90);
		cat.move(100);


	}
}}
