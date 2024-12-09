package Assignments.Generics;

public class FindMaximum {
    // Generic method to find the maximum of three values
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a; // Assume 'a' is the largest
        if (b.compareTo(max) > 0) {
            max = b; // Update max if 'b' is larger
        }
        if (c.compareTo(max) > 0) {
            max = c; // Update max if 'c' is larger
        }
        return max;
    }

    public static void main(String[] args) {
        // Test case 1: Integers
        System.out.println("Maximum of 3 Integers:");
        System.out.println(findMax(10, 20, 30)); // Output: 30

        // Test case 2: Floats
        System.out.println("Maximum of 3 Floats:");
        System.out.println(findMax(1.1f, 3.3f, 2.2f)); // Output: 3.3

        // Test case 3: Strings
        System.out.println("Maximum of 3 Strings:");
        System.out.println(findMax("Apple", "Peach", "Banana")); // Output: Peach
    }
}
