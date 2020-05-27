/*
* StarGraph.java
* Author: JiaoAng Dong
* Submission Date: 10/10/2019
*
* Purpose: The user inputs value x and the program will 
* keep calculating y until it reaches the number 
* the user wants. then prints out appropriate 
* "star graph" 
 *
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
import java.util.Scanner;

public class StarGraph {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the number of x values to process: ");
		int numofrepeats = keyboard.nextInt();
		if (numofrepeats <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		// takes in the number of repeats, and make an if statement exception when number of 
		//repeat is zero or lower and zero

		System.out.println("Enter a minimum value for x: ");
		double minx = keyboard.nextDouble();
		
		// takes in and stores the minimum value for x;
		System.out.println("Enter the amount to increment x: ");
		double incrementX = keyboard.nextDouble();
		if (incrementX <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//takes in and stores the increment value for x, and make an if statement
		//if the increment is not a number greater than zero

		double[] xvalues = new double[numofrepeats];
		double[] yvalues = new double[numofrepeats];
	
		//creates two arrays of x and y values
		
		xvalues[0] = minx;
		
		// first index of x array is always the minimum X
		
		for ( int i = 1 ; i < numofrepeats ; i++) {
			xvalues[i] = xvalues[i-1] + incrementX;
		}
		
		// for loop generates all the x values by adding 
		// the increment value to it each time
		
		for ( int i = 0 ; i < numofrepeats ; i++) {
			yvalues[i] = 20.0 * Math.abs(Math.sin(xvalues[i]));
		}
		
		// for loop generates all the y values by 
		// applying the math formula to the existing x values
		
		System.out.println("\nValues");
		for ( int i = 0 ; i < numofrepeats ; i++) {
             System.out.printf("x: %.3f" , xvalues[i]);
             System.out.printf(", y: %.3f" , yvalues[i]);
             System.out.println();
		}
		
		// prints out a list of x and y values from the array
		
		System.out.println("\nGraph");
		for (int i = 0 ; i < numofrepeats ; i++) {
			System.out.print(":");
			for (int a = 0 ; a < Math.floor(yvalues[i]) ; a++ ) {
			System.out.print("*");	
			}
			System.out.println("");
		}
		// prints out the "star graph" with a double for loop
		// that first creates the number of rows from the number of
		// repeats, then creates the amount of starts based on the 
		// integer value of Y
		
		
}
}