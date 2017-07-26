package numberpackage;

import java.util.Scanner;

public class GuessMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = 58; 
		int numberHolder; 
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter a number");
		numberHolder = getInput.nextInt(); 
		
		if(numberHolder==randomNumber)
		{
			System.out.println("Congratulations! "+randomNumber+" was the number");
		}
		else
		{
			if(numberHolder<randomNumber)
			{
				System.out.println("Your guess is too low");
			}
			else
			{
				System.out.println("Your guess is too high");
			}
			
		}
		getInput.close();
		

	}

}
