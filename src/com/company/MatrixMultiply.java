package com.company;

import java.util.Arrays;

public class MatrixMultiply extends CreateMatrix {
    public MatrixMultiply(int rowNumber_1, int columnNumber_1, int rowNumber_2, int columnNumber_2) {
        super(rowNumber_1, columnNumber_1, rowNumber_2, columnNumber_2);
    }

    public void multiplyMatrices() {
        createdMatrices();
        double[][] multiplication_result = new double[rowNumber_1][columnNumber_2];  // rowNumber_1 by columnNumber_2
        if (columnNumber_1 == rowNumber_2) {
            for (int i = 0; i < rowNumber_1; i++) {
                for (int j = 0; j < columnNumber_2; j++) {
                    multiplication_result[i][j] = 0;
                    for (int k = 0; k < columnNumber_1; k++)
                        multiplication_result[i][j] = multiplication_result[i][j] + matrixOne[i][k] * matrixTwo[k][j];
                }
            }
            System.out.println("matrix one times matrix two is " + Arrays.deepToString(multiplication_result));
        }
        else
            System.out.println("Number of columns of the first matrix should be equal to number of rows of the second matrix !");
    }
}
