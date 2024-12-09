package Assignments.Generics;

public class PrintArray {
    // Generic method to print elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Apple", "Banana", "Cherry"};
        Float[] floatArray = {1.1f, 2.2f, 3.3f};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);

        System.out.println("Float Array:");
        printArray(floatArray);
    }
}
