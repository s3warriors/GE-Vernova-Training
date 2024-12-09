package Assignments.OOPs.EmployeeWage;

public class UC3_CalculatePartTimeWage {
    private static final int WAGE_PER_HOUR = 20;
    private static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("UC3: Calculate Part-Time Wage");
        int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        System.out.println("Part-Time Wage: " + partTimeWage);
    }
}
