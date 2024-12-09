package Assignments.OOPs.EmployeeWage;

public class UC2_CalculateDailyWage {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("UC2: Calculate Daily Wage");
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Full-Time Daily Wage: " + dailyWage);
    }
}
