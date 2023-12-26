import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		int times = Integer.parseInt(args[0]);
		int all_kids = 0;
		int families_with_2 = 0;
		int families_with_3 = 0;
		int families_with_4_or_more = 0;
		for (int i = 0; i < times; i++) {
			Boolean have_boy = false;
			Boolean have_girl = false;
			int family_kids = 0;
			while (!have_boy || !have_girl) {
				double chance = generator.nextDouble();
				if (chance > 0.5) {
					have_girl = true;
				}
				else {
					have_boy = true;
				}
				family_kids += 1;
				all_kids += 1;
			}
			switch (family_kids) {
				case 2: families_with_2 += 1;
						break;
				case 3: families_with_3 += 1;
						break;
				default: families_with_4_or_more += 1;
						 break;

			}	
		}
		double average = all_kids / (double) times;
		System.out.println("\nAverage: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + families_with_2);
		System.out.println("Number of families with 3 children: " + families_with_3);
		System.out.println("Number of families with 4 or more children: " + families_with_4_or_more);
		
		int max = Math.max(families_with_2, Math.max(families_with_3, families_with_4_or_more));
		String max_to_print;
		if (max == families_with_2) {
			max_to_print = "2";
		}
		else {
			if (max == families_with_3) {
				max_to_print = "3";
			}
			else {
				max_to_print = "4 or more";
			}
		}
		System.out.println("The most common number of children is " + max_to_print + ".");
		    
	}
}
