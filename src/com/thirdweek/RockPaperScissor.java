package com.thirdweek;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] rps = { "R", "P", "S" };

		String computerMove = rps[new Random().nextInt(rps.length)];

		String playerMove;
		String PlayAgain = "yes";

		while (PlayAgain.equals("yes")) {

			System.out.println("Enter your choice (R, P or S)");
			playerMove = scan.nextLine();

			System.out.println("Computer Move:" + computerMove);

			if (playerMove.equalsIgnoreCase("R")) {

				if (computerMove.equals("P")) {
					System.out.println("You lose! Computer Win!!!");
				} else if (computerMove.equals("S")) {
					System.out.println("You Win!!!");
				} else if (computerMove.equals("R")) {
					System.out.println("Game Tie!");
				}

			} else if (playerMove.equalsIgnoreCase("P")) {

				if (computerMove.equals("P")) {
					System.out.println("Game Tie!");

				} else if (computerMove.equals("S")) {
					System.out.println("You lose! Computer Win!!!");

				} else if (computerMove.equals("R")) {
					System.out.println("You Win!!!");

				}

			}

			else if (playerMove.equalsIgnoreCase("S")) {

				if (computerMove.equals("P")) {
					System.out.println("You Win!!!");

				} else if (computerMove.equals("S")) {
					System.out.println("Game Tie!");

				} else if (computerMove.equals("R")) {
					System.out.println("You lose! Computer Win!!!");

				}

			} else {
				System.out.println("Invalid move ,Enter a  valid choice");
			}

			System.out.println("Play Game Again , Enter yes or no");
			PlayAgain = scan.nextLine().toLowerCase();

		}

		System.out.println("Game Over!");

	}
}
