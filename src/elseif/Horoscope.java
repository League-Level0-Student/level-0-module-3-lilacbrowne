package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	for(int i = 0; i < 10; i++) {
	String starsign = JOptionPane.showInputDialog("What is your Zodiac sign?");
	if (starsign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "You will make a lot of money");
	} else if (starsign.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "You will find something important to you");
	} else if (starsign.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "You will achieve a goal");
	} else if (starsign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "You will learn something new");
	} else if (starsign.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "You will help others");
	} else if (starsign.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "You will have excellent luck");
	} else if (starsign.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Your family will be healthy");
	} else if (starsign.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "You will be very lucky");
	} else if (starsign.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "You will find your dreams");
	} else if (starsign.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Something great will happen to you");
	} else if (starsign.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Happy almost birthday!");
	} else if (starsign.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "You will get something new");
	} else {
		JOptionPane.showMessageDialog(null, "That's not a sign!");
	}
	
}}
}
