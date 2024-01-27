
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot rob = new Robot();
		
		for (int i=0;i<1;i=0 ) {
		//2. Make the robot draw a shape (this will take more than one line of code)	
		
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("what color would you like the robot to draw with(red,yellow,orange,green,blue?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {

			rob.setPenColor(Color.red);

		}
		else if (color.equalsIgnoreCase("yellow")) {

			rob.setPenColor(Color.yellow);

		}
		else if (color.equalsIgnoreCase("orange")) {

			rob.setPenColor(Color.orange);

		}
		else if (color.equalsIgnoreCase("green")) {

			rob.setPenColor(Color.green);

		}
		else if (color.equalsIgnoreCase("blue")) {

			rob.setPenColor(Color.blue);

		}

		//6. If the user doesn't enter anything, choose a random color
		else {
			
			rob.setRandomPenColor();
			
		}
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		rob.setSpeed(1000);
		rob.penDown();
		rob.hide();
		for (int in = 0;in<1000;in++) {
		rob.move(10);
		rob.turn(1);
		rob.setRandomPenColor();

		}



		}


	}
}
