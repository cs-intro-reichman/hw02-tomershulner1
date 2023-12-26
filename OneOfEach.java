
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		Boolean have_boy = false;
		Boolean have_girl = false;
		int all_kids = 0;
		while (!have_boy || !have_girl) {
			double chance = Math.random();
			if (chance > 0.5) {
				System.out.print("g ");
				have_girl = true;
			}
			else {
				System.out.print("b ");
				have_boy = true;
			}
			all_kids += 1;
		}
		System.out.println("\nYou made it... and you now have " + all_kids + " children.");
	}
}
