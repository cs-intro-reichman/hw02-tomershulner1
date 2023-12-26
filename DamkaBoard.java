/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num_of_lines = Integer.parseInt(args[0]);
		for (int i = 0; i < num_of_lines; i++) {
			for (int j = 0; j < num_of_lines; j++) {
				if (i % 2 != 0) {
					System.out.print(" *");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
}
