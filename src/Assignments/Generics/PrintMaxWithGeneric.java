package Assignments.Generics;

import java.util.Arrays;

public class PrintMaxWithGeneric {
    // Generic method to find and print the maximum value
    public static <T extends Comparable<T>> void printMax(T... elements) {
        T max = findMax(elements); // Reuse findMax logic
        System.out.println("Maximum Value: " + max);
    }

    // Reuse the varargs-based max logic
    public static <T extends Comparable<T>> T findMax(T... elements) {
        return Arrays.stream(elements).max(T::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        printMax(10, 20, 30, 40, 50); // Output: Maximum Value: 50
        printMax(1.1f, 3.3f, 2.2f, 5.5f); // Output: Maximum Value: 5.5
        printMax("Apple", "Peach", "Banana", "Cherry"); // Output: Maximum Value: Peach
    }
}
