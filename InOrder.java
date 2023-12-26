/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int first_num = (int)(Math.random() * 10);
		System.out.print(first_num + " ");
		int second_num = (int)(Math.random() * 10);
		if (second_num >= first_num) {
			do {
				System.out.print(second_num + " ");
				first_num = second_num;
				second_num = (int)(Math.random() * 10);
			}
			while (second_num >= first_num);
		}
	}
}
