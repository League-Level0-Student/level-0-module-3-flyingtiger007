
package _01_else_if._3_high_low;
import javax.swing.JOptionPane;
import java.util.Random;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		int i = 0;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		while (i < 10) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String num = JOptionPane.showInputDialog("guess a number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int numint = Integer.parseInt(num);
			// 5. if the guess is correct
			if (numint==random) {

				JOptionPane.showMessageDialog(null, "you won");
				System.exit(0);
			}
			// 6. Win
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if (numint>random) {

				JOptionPane.showMessageDialog(null, "too high");

			}
			// 8. Tell them it's too high
			// 9. if the guess is low
			if (numint<random) {

				JOptionPane.showMessageDialog(null, "too low");

			}
			// 10. Tell them it's too low

			// 13. Tell them they lose
			i++;
			if (i==10) {
				
				JOptionPane.showMessageDialog(null, "you lose");
				System.exit(0);
				
			}
		}


	}
}




