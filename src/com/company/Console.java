package com.company;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static CreateMatrix getMatrixInputs(int prompt) {
        System.out.println("Enter matrix dimensions for two matrices");
        System.out.println("----------------------------------------");
        System.out.print("Enter number of rows for matrix one: ");
        int rowNumber_1 = readNumber();
        System.out.print("Enter number of columns for matrix one: ");
        int columnNumber_1 = readNumber();
        System.out.print("Enter number of rows for matrix two: ");
        int rowNumber_2 = readNumber();
        System.out.print("Enter number of columns for matrix two: ");
        int columnNumber_2 = readNumber();

        if(prompt == 1)
            return  new MatrixMultiply(rowNumber_1,columnNumber_1,rowNumber_2,columnNumber_2);
        else if(prompt == 2)
            return  new MatrixAdd(rowNumber_1,columnNumber_1,rowNumber_2,columnNumber_2);
        else
            return  new MatrixSubtract(rowNumber_1,columnNumber_1,rowNumber_2,columnNumber_2);
    }

    public static QuadraticCalculation getQuadraticInputs() {
        System.out.println("Enter a, b and c  provided that the equation is in the form of ax^2 + bx + c = 0");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        return new QuadraticCalculation(a,b,c);
    }

    private static int readNumber() {
        int value;
        while (true) {
            value = scanner.nextInt();
            if (value > 0)
                break;
            System.out.print("Number of rows or columns can not be negative or 0, Please enter positive integer: ");
        }
        return value;
    }
}
