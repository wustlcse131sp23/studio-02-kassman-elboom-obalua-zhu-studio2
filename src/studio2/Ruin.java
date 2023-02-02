package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi, welcome to the casino. How much money would you like to start with?");
		double startAmount = scan.nextDouble();
		System.out.println("For your game, what is the chance you will win a single play (between 0-1?");
		double winChance = scan.nextDouble();
		System.out.println("How much money would you like to win before leaving?");
		double winLimit = scan.nextDouble();
		System.out.println("How many simulations would you like to run?");
		int totalSimulations = scan.nextInt();
		
		boolean winLoss;
		int countPlays = 0;
		double currentAmount = startAmount;
		
		int lostSimulation = 0;
		int wonSimulation = 0;
		
		for (int simulationsRun = 1; simulationsRun <= totalSimulations; simulationsRun++) {
			while (currentAmount > 0 && currentAmount < winLimit) {
				if (winLoss = Math.random() < winChance) {
					currentAmount++;
					countPlays++;
					//System.out.println("You won!");
					//System.out.println("You currently have $" + startAmount + ".");
				}
				else {
					currentAmount--;
					countPlays++;
					//System.out.println("You lost.");
					//System.out.println("You currently have $" + startAmount + ".");
				}
				
			}
			
			String simWinLoss;
			
			if (currentAmount == winLimit) {
				simWinLoss = "WIN";
			}
			else {
				simWinLoss = "LOSE";
			}
				
				
			if (currentAmount == 0) {
				lostSimulation++;
			}
			else {
				wonSimulation++;
			}
				
			System.out.println("SIMULATION " + simulationsRun + ": " + countPlays + " " + simWinLoss);
			
			
			countPlays = 0;
			currentAmount = startAmount;
			
		}	
		
		
		
		System.out.println("Losses: " + lostSimulation + " Simulations: " + totalSimulations);	
		
}
}
