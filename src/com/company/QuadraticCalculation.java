package com.company;

public class QuadraticCalculation {
    double a;
    double b;
    double c;

    public QuadraticCalculation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solveQuadratic(){
        double discriminant = Math.sqrt(b*b - 4*a*c);
        double root1 = (-b + discriminant)/2*a;
        double root2 = (-b - discriminant)/2*a;
        System.out.println("The solution of your quadratic equation is: " + root1 + " and "+ root2);
    }
}
