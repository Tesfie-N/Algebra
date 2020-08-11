package com.company;

import java.util.Arrays;

public class MatrixAdd extends CreateMatrix {
    public MatrixAdd (int rowNumber_1, int columnNumber_1, int rowNumber_2, int columnNumber_2) {
        super(rowNumber_1, columnNumber_1, rowNumber_2, columnNumber_2);
    }

    public void addMatrices() {
        createdMatrices();
        double[][] add_result = new double[rowNumber_1][columnNumber_1];
        if (rowNumber_1 == rowNumber_2 && columnNumber_1 == columnNumber_2) {
            for (int i = 0; i < rowNumber_1; i++) {
                for (int j = 0; j < rowNumber_2; j++) {
                    add_result[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                }
            }
            System.out.println("matrix one plus matrix two is " + Arrays.deepToString(add_result));
        }
        else
            System.out.println("Matrix addition and subtraction error: the two matrices should be equal !");
    }
}
