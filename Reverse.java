/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input = args[0];
		int input_len = input.length();
		String reveresed = "";
		for (int i = input_len - 1; i >= 0; i--) {
			reveresed += input.charAt(i);
		}
		System.out.println(reveresed);
		System.out.println("The middle character in is " + input.charAt((input_len - 1) / 2));
	}
}
