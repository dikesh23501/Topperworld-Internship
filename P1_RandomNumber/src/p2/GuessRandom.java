package p2;
import p1.*;
import java.util.Scanner;
public class GuessRandom 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("WelCome to Guess Number Game");
		System.out.println("You will Be Asked to guess a Number to win the game");
		System.out.println("You Hava Maximum 5 attempts Limit");
		int myNum=GenRandom.getRand(0, 100);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter Your Guess Between 1 to 100");
			int guess=s.nextInt();
			if(guess>=1 && guess<=100)
			{
				if(guess==myNum)	
				{
					System.out.println("OOHHOO! Your number is correct. You win the game....");
					break;
				}
				else if(guess<myNum)
				{
					System.out.println("Your Guess Number is Smaller");
				}
				else if(guess>myNum)
				{
				System.out.println("Your Guess Number is Greater");
				}
				if(i>=5)
				{
				System.out.println("Limit Finished, The number is= "+myNum);
				}
			}
			else
			{
				System.out.println("Invalid Guess....");
			
			}
		}
		s.close();
	}
}
