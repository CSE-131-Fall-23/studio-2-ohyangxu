package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What amount of money do you have at the beginning? ");
		int startAmount = in.nextInt();
		System.out.print("Win probability? ");
		double winChance = in.nextDouble();
		System.out.print("Winlimit? ");
		int winLimit = in.nextInt();
		System.out.print("How many days you want to simulate? ");
		int totalSimulations = in.nextInt();
		int lostplay = 0;
		for (int i=1;i<=totalSimulations;i++)
		{
		int nowamount = startAmount;
		int Plays = 0;
		while (nowamount > 0 && nowamount < winLimit)
		{
			int Random = (int)(Math.random()*100+1);
			double probability = (winChance * 100);
			if (Random <= probability)
			{
				nowamount += 1;
			}
			else
			{
				nowamount -= 1;
			}
		Plays ++;			
		}
		if (nowamount == 0)
		{
		System.out.println("Simulation "+i+": "+Plays+" You lose!");
		lostplay ++;
		}
		else
		{
			System.out.println("Simulation "+i+": "+Plays+" You win!");
		}
	}
		double ruinrate = ((double) lostplay/totalSimulations);
		double expected = 1 - ((double) startAmount/winLimit);
		System.out.println("Loses: " + lostplay +" Simulation:" + totalSimulations);
		System.out.println("Ruin Rate from Simulation: "+ ruinrate + ". Expected Ruin Rate:" + expected);
	}
}

