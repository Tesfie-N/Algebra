package com.company;

import java.util.Scanner;

public class CreateMatrix {
    public double[][] matrixOne;
    public double[][] matrixTwo;
    public int rowNumber_1;
    public int columnNumber_1;
    public int rowNumber_2;
    public int columnNumber_2;

    private Scanner scanner = new Scanner(System.in);

    public CreateMatrix(int rowNumber_1, int columnNumber_1, int rowNumber_2, int columnNumber_2) {
        this.rowNumber_1 = rowNumber_1;
        this.columnNumber_1 = columnNumber_1;
        this.rowNumber_2 = rowNumber_2;
        this.columnNumber_2 = columnNumber_2;
    }

    private double[][] createMatrix(int rowNumber, int columnNumber) {
        double[][] matrix = new double[rowNumber][columnNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print("Enter matrix element at index " + (1 + i) + (1 + j) + ": " );
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for(int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public void createdMatrices(){
        System.out.println("      MATRIX ONE     ");
        matrixOne = createMatrix(rowNumber_1, columnNumber_1);
        System.out.println("      MATRIX TWO     ");
        matrixTwo = createMatrix(rowNumber_2, columnNumber_2);
    }
}
