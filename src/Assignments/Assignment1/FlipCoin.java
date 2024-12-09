package Assignments.Assignment1;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heads = 0, tails = 0;

        System.out.print("Enter the number of times to flip the coin (positive integer): ");
        int flips = scanner.nextInt();

       
        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        
        for (int i = 0; i < flips; i++) {
            double randomValue = Math.random(); 
            if (randomValue < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

      
        double headPercentage = (double) heads / flips * 100;
        double tailPercentage = (double) tails / flips * 100;

        System.out.println("Total Flips: " + flips);
        System.out.println("Heads: " + heads + " (" + headPercentage + "%)");
        System.out.println("Tails: " + tails + " (" + tailPercentage + "%)");

        scanner.close();
    }
}
