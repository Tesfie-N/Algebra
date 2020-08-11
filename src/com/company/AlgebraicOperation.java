package com.company;

import java.util.Scanner;

public class AlgebraicOperation {
    public void operate() {
        System.out.print("Enter 1 for matrix operation and 2 for quadratic solution ");
        Scanner scanner = new Scanner(System.in);
        int prompt = scanner.nextInt();
        switch(prompt) {
            case 1:
                operateMatrix();
                break;
            case 2:
                solve();
                break;
            default:
                System.out.println("You did not choose mathematical operation defined here: enter 1 or 2 ");
        }
    }

    private void operateMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for multiplication 2 for addition and 3 for subtraction   ");
        int prompt = scanner.nextInt();
        switch(prompt) {
            case 1:
                var multiply = (MatrixMultiply) Console.getMatrixInputs(1);
                multiply.multiplyMatrices();
                break;

            case 2:
                var add = (MatrixAdd) Console.getMatrixInputs(2);
                add.addMatrices();
                break;

            case 3:
                var subtract = (MatrixSubtract) Console.getMatrixInputs(3);
                subtract.subtractMatrices();
                break;

            default:
                System.out.println("Enter from 1 up to 3 inclusive");
        }
    }

    private void solve(){
        var quadratic = Console.getQuadraticInputs();
        quadratic.solveQuadratic();
    }
}
