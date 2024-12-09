package Assignments.OOPs.EmployeeWage;

import java.util.Random;

public class UC1_CheckAttendance {
    public static void main(String[] args) {
        System.out.println("UC1: Check Employee Attendance");
        Random random = new Random();
        int isPresent = random.nextInt(2); // 0 = Absent, 1 = Present

        if (isPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

