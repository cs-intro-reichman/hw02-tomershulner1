/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		String perfect_output = num + " is a perfect number since " + num + " = 1";
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
				perfect_output += " + " + i;
			}
		}
		if (sum == num) {
			System.out.println(perfect_output);
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
