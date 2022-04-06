package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class void_methods {
	
	
	public static void main(String[] args) {
		Robot bob = new Robot();
		int x = 0;
		bob.setSpeed(5);
		bob.setX(60);
		bob.penDown();
		bob.setPenWidth(5);
		bob.setSpeed(5);
		while(x<4) {
			bob.move(200);
			bob.turn(90);
			x++;
		}
		x = 0;
		bob.penUp();
		bob.setX(300);
		bob.penDown();
		bob.turn(120);
		bob.move(200);
		bob.turn(120);
		bob.move(200);
		bob.turn(120);
		bob.move(200);
		
		bob.penUp();
		bob.setX(550);
		bob.penDown();
		bob.setSpeed(10);
		while(x<360) {
			bob.move(2);
			bob.turn(1);
			x++;
		}
	}
  }
	
		
	
	
