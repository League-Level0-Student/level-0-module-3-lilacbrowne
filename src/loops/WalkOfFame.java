
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot dog = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		dog.setX(100);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
int starsize = 30;
		dog.penDown();
dog.setPenColor(Color.black);
dog.setSpeed(12);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */
for(int i = 0; i < 5; i++) {
dog.penUp();
dog.turn(20);
dog.move(100);
dog.turn(-90);
dog.penDown();
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
dog.turn(-72);
dog.move(starsize);
dog.turn(144);
dog.move(starsize);
	}}

}
