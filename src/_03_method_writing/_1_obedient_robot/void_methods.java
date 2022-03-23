package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class void_methods {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.setX(60);
		bob.penDown();
		bob.setSpeed(5);
		drawSquare();
	}
	public static void drawSquare() {
		int x = 0;
		while(x<4) {
			bob.move(30);
			bob.turn(90);
			x++;
		
		}
		
	}
	
}