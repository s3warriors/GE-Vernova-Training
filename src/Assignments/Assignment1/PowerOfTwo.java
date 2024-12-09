package Assignments.Assignment1;

public class PowerOfTwo {
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("Please provide a value for N as a command-line argument.");
            return;
        }

        
        int N = Integer.parseInt(args[0]);

       
        if (N < 0 || N >= 31) {
            System.out.println("Please provide a value for N such that 0 <= N < 31.");
            return;
        }

        System.out.println("Powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }
}


// how to run
/* open src in terminal
   write javac Assignment1/PowerOfTwo then enter
   write java Assignment1.PowerOfTwo 5
 */