package astelit.day3;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 10);
		boolean game = true;
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		while(game && counter < 3){
			System.out.println("Enter value");
			int val = sc.nextInt();
			if(val == rand){
				game = false;
				System.out.println("Correct");
			}

		}
	}

}
