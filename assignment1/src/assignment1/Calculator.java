package assignment1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface ICalculator {
	/**
	* Adds given two numbers
	* @param x first number
	* @param y second number
	* @return the sum of the two numbers
	*/
	int add(int x, int y);
	/**
	* Divides two numbers
	* @param x first number
	* @param y second number
	* @return the division result
	*/
	float divide(int x, int y) throws RuntimeException;
}


public class Calculator implements ICalculator{
  /* Implement your calculator class here*/
	public int add(int x, int y) {
		return x+y;
	}
	public float divide(int x, int y) {
		if(y != 0) {
			return (float) x/y;
		}
		else {
			throw new RuntimeException(); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator mycalc = new Calculator();
		
		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Expression");

	    String expression = myScanner.nextLine();  // Read user input
	    
	    String[] splited = expression.split("\\s+");
	    
	    int x = Integer.parseInt(splited[0]);
	    int y = Integer.parseInt(splited[2]);

	    if (splited[1].charAt(0) == '+')
	    {
		    System.out.println(mycalc.add(x,y));
	    }
	    else if (splited[1].charAt(0) == '/')
	    {
	    	try {
	    		System.out.println(mycalc.divide(x,y));
	    	}
	    	catch(Exception e) {
	    		System.out.println("Error");	    		
	    	}
	    }
	    else {
	    	System.out.println(3);
	    }

	}
}