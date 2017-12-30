
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 27th";
		String dadsBirthday = "December 20th";
		String myBirthday = "September 10th";
		String iansBirthday = "November 13th";
		String elisBirthday = "November 9th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Which birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
	if (birthday.equals("Mom")) {
		System.out.println(momsBirthday);
	} else if (birthday.equals("Dad")) {
		System.out.println(dadsBirthday);
	} else if (birthday.equals("Me")) {
		System.out.println(myBirthday);
	} else if (birthday.equals("Ian")) {
		System.out.println(iansBirthday);
	} else if (birthday.equals("Eli")) {
		System.out.println(elisBirthday);
	} else {
		System.out.println("Sorry, I don't know that person's birthday!");
	}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
