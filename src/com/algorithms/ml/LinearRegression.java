package com.algorithms.ml;

import java.util.Scanner;

public class LinearRegression {
    public static void main(String[] args) {
        int[] height = {63, 64, 66, 69, 69, 71, 71, 72, 73, 75};
        int[] weight = {127, 121, 142, 157, 162, 156, 169, 165, 181, 208};

        int sumx = 0, sumy = 0;

        for (int i = 0; i < height.length && i < weight.length; i++) {
            sumx += height[i];
            sumy += weight[i];
        }

        int xmean = sumx / height.length;
        int ymean = sumy / weight.length;

        int sumNum = 0, sumDen = 0;
        for (int i = 0; i < height.length && i < weight.length; i++) {
            int value1 = height[i] - xmean;
            int value2 = weight[i] - ymean;
            sumNum += value1 * value2;
            sumDen += value1 * value1;
        }

        double m = sumNum / sumDen;
        double c = ymean - (xmean * m);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of height: ");
        int heightValue = sc.nextInt();
        System.out.println("Weight is: " + ((m * heightValue) + c));
    }
}
