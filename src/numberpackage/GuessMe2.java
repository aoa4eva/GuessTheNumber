package numberpackage;

import java.util.Random;
import java.util.Scanner;

public class GuessMe2 {
	/***
	 * This is an application to allow a user to guess a number. If the user guesses correctly, the system congratulates
	 * the user. Otherwise the system hints how the user should guess if he/she wants to continue. 
	 * If the user gives up, the number is printed. 
	 * */
	public static void main(String[] args) {
		//Uses Random class to generate a random number
		Random r = new Random(); 
	
		/*Ensures that number is between 1 and 10 (without adding one 
		the range decreases by 1, and is between 0 and 9)*/
		int randomNumber = 1 + r.nextInt(10); 
		
		//Holds the user's guess.
		int numberHolder;   

		//Stores the response from the user. Initialised to 'y', just because that's our 'yes' option. 
		String response="y";

		//Receives user input
		Scanner getInput = new Scanner(System.in);
		
		//Keeps track of whether user wants to continue
		Scanner sc= new Scanner(System.in); 
		//Keeps track of whether a user guessed correctly. Initialized with the user not having guessed the number yet. 
		boolean guessed = false; 
		
		
		while(!response.equalsIgnoreCase("n") && guessed==false)
		{
			
			System.out.println("Enter a number");
			
			
			numberHolder = getInput.nextInt();  //Gets input as an integer
			
			if(numberHolder==randomNumber) //Yaaay! User has guessed the number.
			{
				System.out.println("Congratulations! "+randomNumber+" was the number");
				guessed=true; 
			}
			else //User hasn't guessed the number yet
			{
				if(numberHolder<randomNumber) //Give the user a hint
				{
					System.out.println("Your guess is too low");
				}
				else
				{
					System.out.println("Your guess is too high");
				}
				

			System.out.println("Would you like to continue?");
			response = sc.nextLine(); //Get a response from the user - do they want to continue? 
			
			//Checks the validity of the user's response.
			while(!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n"))
			{
				System.out.println("You entered an invalid option.");
				System.out.println("Would you like to continue?");
				response = sc.nextLine(); //Get a response from the user - do they want to continue? 
				
			}
		}
	
	}
		if(!guessed){
			System.out.println("What a pity. Okaaaay, so "+randomNumber+" was the number");
		}
		getInput.close();
		

	}

}
