//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String numberoftimes = JOptionPane.showInputDialog("How many times do you want the robot to spin from 1-10?");
int x = Integer.parseInt(numberoftimes);
 // 1. Use the dance method to make the robot spin.
robot.setSpeed(20);
if (x < 10) {
dance(x);
} else if (x > 10){
	JOptionPane.showMessageDialog(null, "It needs to be a number from 1-10");
} else {
	
}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

