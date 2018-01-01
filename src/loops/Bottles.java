package loops;

public class Bottles {
	public static void main(String[] args) {
		for (int i = 99; i > -1; i--) {
			System.out.println(i + " bottles of beer on the wall, " + i
					+ " bottles of beer. You take one down and pass it around, " + i + " bottles of beer on the wall.");
		}
		System.out.println("Yay!");
	}
}
