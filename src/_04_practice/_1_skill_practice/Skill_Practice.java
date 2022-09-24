package _04_practice._1_skill_practice;
import javax.swing.JOptionPane;

public class Skill_Practice {
public static void main(String[] args) {

Skill_Practice skills = new Skill_Practice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
	String answer = JOptionPane.showInputDialog(null, "How many dimes do you have?");
	int response = Integer.parseInt(answer);


// Tell them how many cents they have (hint multiply by 10)
	response = response * 10;
	JOptionPane.showMessageDialog(null, "You have " + response + " cents.");


// Ask the user how tall they are (inches)
	answer = JOptionPane.showInputDialog(null, "How tall are you? (inches)");
	response = Integer.parseInt(answer);


// If they are shorter than 36 inches, tell them to eat their Wheaties
	if (response < 36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties.");
	}
	else {
		JOptionPane.showMessageDialog(null, "You are pretty tall.");
	}
}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console

	for (int i = 1; i < 31; i++) {
		
		if (i % 3 == 0) {
			System.out.println(i);
		}
		
	}

}

void skill3() { // Get a random number that is less than 20 and print it to the console



// Get another random number that is less than 10 and print it to the console



// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction



}

void skill4() { // In a pop-up, ask the user for the city they live in

String answer = JOptionPane.showInputDialog(null, "What city do you live in?");

// If they answered "San Diego", tell them they live in America's Finest City
if (answer == "san diego") {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City."); 
}


// Otherwise, tell them to move to San Diego
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego."); 
}



}

void skill5() { // In a pop-up, ask the user for the name of their school

String answer = JOptionPane.showInputDialog(null, "What is the name if your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.

JOptionPane.showMessageDialog(null, answer + " is a fantastic school!");

}
}

