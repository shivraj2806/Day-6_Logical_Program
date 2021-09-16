package com.Bridgelabz;

import java.util.Scanner;

public class Coupen_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of coupon");
        int numberOfCoupons = sc.nextInt();

        int[] couponArray = new int[numberOfCoupons];

        getCouponNumber(couponArray, numberOfCoupons);

    }

    public static void getCouponNumber(int[] couponArray, int numberOfCoupons) {
        for (int i = 0; i < numberOfCoupons; i++) {
            couponArray[i] = (int) (Math.random() * 1000);
            for (int j = 0; j < i; j++) {
                if (couponArray[j] == couponArray[i]) {
                    i = (i - 1);
                }
            }
            System.out.println(i + 1 + ":: Coupon number value is ::" + couponArray[i]);
        }
    }
}
