package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManager {
	
	public Scanner input;
	
	public final int NUM_MENU_OPTIONS = 1;
	
	public EmployeeManager()
	{
		input = new Scanner(System.in);
	}
	
	public void MainMenu()
	{
		int userChoice = -1;
		
		
		do{
			System.out.println("What would you like to do? (Enter a number)");
			System.out.println("1. List employee details");
			userChoice = getNumber();
			
			if(userChoice > NUM_MENU_OPTIONS)
				System.out.println("Incorrect option, try again:");
		}while(userChoice > NUM_MENU_OPTIONS);
		
	}
	
	public int getNumber()
	{
		int result = -1;
		do{
			try{
				result = input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Incorrect value, try again");
				input.next();
			}
		}while(result == -1);
		
		return result;
	}
}
