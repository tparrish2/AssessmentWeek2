package model;
import java.lang.Math;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

public class Calculator {
	
	// method that takes a number and finds the square root of it
	public double squareRoot(int num) {
		return Math.sqrt(num);
	}
	
	// method that takes a number and squares it
	public double squared(int num) {
		double power = 2;
		return Math.pow(num, power);
	}
}
