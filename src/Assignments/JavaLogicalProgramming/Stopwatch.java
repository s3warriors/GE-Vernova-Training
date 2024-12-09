package Assignments.JavaLogicalProgramming;


public class Stopwatch {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        // Simulate some processing time
        Thread.sleep(2000); // 2 seconds

        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (endTime - startTime) + " ms");
    }
}


