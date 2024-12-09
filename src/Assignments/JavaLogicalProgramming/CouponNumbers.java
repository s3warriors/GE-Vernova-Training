package Assignments.JavaLogicalProgramming;

import java.util.HashSet;
import java.util.Random;

public class CouponNumbers {
    public static void main(String[] args) {
        int n = 5; // Number of distinct coupons
        HashSet<Integer> coupons = new HashSet<>();
        Random random = new Random();

        int count = 0;

        while (coupons.size() < n) {
            int newCoupon = random.nextInt(n);
            coupons.add(newCoupon);
            count++;
        }

        System.out.println("Total random numbers needed: " + count);
    }
}
