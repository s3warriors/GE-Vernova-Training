package Assignments.Generics;

public class GenericMax<T extends Comparable<T>> {
    private T a, b, c;

    // Constructor
    public GenericMax(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to find the maximum
    public T findMax() {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        // Test case with Integers
        GenericMax<Integer> intMax = new GenericMax<>(10, 20, 30);
        System.out.println("Maximum Integer: " + intMax.findMax());

        // Test case with Floats
        GenericMax<Float> floatMax = new GenericMax<>(1.1f, 3.3f, 2.2f);
        System.out.println("Maximum Float: " + floatMax.findMax());

        // Test case with Strings
        GenericMax<String> stringMax = new GenericMax<>("Apple", "Peach", "Banana");
        System.out.println("Maximum String: " + stringMax.findMax());
    }
}
