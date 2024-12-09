package Assignments.Generics;

import java.util.Arrays;

public class MaxWithVarargs {
    // Generic method to find the maximum of multiple values
    @SafeVarargs
    public static <T extends Comparable<T>> T findMax(T... elements) {
        return Arrays.stream(elements).max(T::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        System.out.println("Maximum of Integers: " + findMax(10, 20, 30, 40, 50)); // Output: 50
        System.out.println("Maximum of Floats: " + findMax(1.1f, 3.3f, 2.2f, 5.5f)); // Output: 5.5
        System.out.println("Maximum of Strings: " + findMax("Apple", "Peach", "Banana", "Cherry")); // Output: Peach
    }
}

