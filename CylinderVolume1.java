/*
Student ID:18970601
Name: Ibrahim George 
Campus: Penrith 
 */

import java.util.Scanner;

public class CylinderVolume1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius"));
		//double height = Double.parseDouble(JOptionPane.showInputDialog("What is the height"));
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the radius");
		double radius = keyboard.nextDouble();
		
		System.out.println("What is the heights");
		double height = keyboard.nextDouble();
		
		keyboard.close();
		
		double fraction = 1d/3d; //casting them as doubles
		
		
		double volume = fraction * Math.PI * radius *radius * height;
		
		System.out.println("The Volume is " + volume);
	}

}
