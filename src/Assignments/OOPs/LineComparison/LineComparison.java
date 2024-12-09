package Assignments.OOPs.LineComparison;

public class LineComparison {
    public static void main(String[] args) {
        // UC1: Calculate Lengths of Two Lines
        double line1 = calculateLength(2, 3, 5, 7); // Line 1: (2,3) to (5,7)
        double line2 = calculateLength(1, 1, 4, 5); // Line 2: (1,1) to (4,5)

        System.out.println("Length of Line 1: " + line1);
        System.out.println("Length of Line 2: " + line2);

        // UC2: Check Equality of Two Lines
        if (Double.valueOf(line1).equals(Double.valueOf(line2))) {
            System.out.println("Line 1 and Line 2 are Equal.");
        } else {
            System.out.println("Line 1 and Line 2 are NOT Equal.");
        }

        // UC3: Compare Two Lines
        int comparisonResult = Double.valueOf(line1).compareTo(line2);
        if (comparisonResult > 0) {
            System.out.println("Line 1 is Longer than Line 2.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is Shorter than Line 2.");
        } else {
            System.out.println("Line 1 and Line 2 are Equal in Length.");
        }
    }

    // Method to Calculate the Length of a Line
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
