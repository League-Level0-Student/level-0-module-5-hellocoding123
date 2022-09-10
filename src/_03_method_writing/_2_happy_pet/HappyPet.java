package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Which pet do you want?", "Choose your pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Dog", "Cat", "Fish" }, null);
			int x = 0;
			while(x < 4) {
				JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Choose one of the answers below", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Pet", "Cuddle", "Food", "Water", "Talk a walk", "Groom", "clean up poop" }, null);
				if (task == 1) {
					cat();
				}
				if (task == 0) {
					dog();
				}
				if (task == 2) {
					fish();
				}
				System.out.println(task);
				happinessLevel++;
				x++;
			}
			JOptionPane.showMessageDialog(null, "Your pet is happy!");
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	private static void cat() {
		JOptionPane.showMessageDialog(null, "Meowwwww");
	}
	private static void dog() {
		JOptionPane.showMessageDialog(null, "Woooooof");
	}
	private static void fish() {
		JOptionPane.showMessageDialog(null, "*bubble*  *bubble*");
	}
}