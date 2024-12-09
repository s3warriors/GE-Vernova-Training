package Assignments.OOPs.EmployeeWage;

import java.util.Random;

public class UC4_WorkHoursSwitch {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("UC4: Calculate Daily Wage Using Switch Case");
        Random random = new Random();
        int empType = random.nextInt(3); // 0 = Absent, 1 = Full-Time, 2 = Part-Time

        int workHours = getWorkHours(empType);
        int dailyWage = workHours * WAGE_PER_HOUR;

        System.out.println("Daily Wage (Using Switch Case): " + dailyWage);
    }

    private static int getWorkHours(int empType) {
        switch (empType) {
            case 1: return FULL_DAY_HOUR; // Full-Time
            case 2: return PART_TIME_HOUR; // Part-Time
            default: return 0; // Absent
        }
    }
}
