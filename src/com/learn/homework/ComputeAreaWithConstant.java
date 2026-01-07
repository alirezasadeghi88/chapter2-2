package com.learn.homework;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = scanner.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
