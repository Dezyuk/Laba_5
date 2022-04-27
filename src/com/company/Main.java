package com.company;

import classes.RightTriangle;
import classes.Triangle;
import classes.Triangles;

public class Main {

    public static final int M = 5;
    public static final int N = 5;
    public static final int MAX_SIDE = 100;


    public static void main(String[] args) {
        // write your code here
        int side1, side2, side3;


        Triangles triangles = new Triangles(M);

        for (int i = 0; i < M; i++) {
            while (!Triangle.existsTriangle(side1 = ((int) (Math.random() * MAX_SIDE + 1)), side2 = ((int) (Math.random() * MAX_SIDE + 1)), side3 = ((int) (Math.random() * MAX_SIDE + 1)))) {
                //System.out.println(side1 + " " + side2 + " " + side3);
            }
            Triangle triangle = new Triangle(side1, side2, side3);
            triangles.add(triangle);
        }

        System.out.println(triangles);

        System.out.println(triangles.getAverageSquare());

        System.out.println("\n--------------------------------\n");

        Triangles rightTriangles = new Triangles(M);

        for (int i = 0; i < N; i++) {
            while (!RightTriangle.existsRightTriangle(side1 = ((int) (Math.random() * MAX_SIDE + 1)), side2 = ((int) (Math.random() * MAX_SIDE + 1)), side3 = ((int) (Math.random() * MAX_SIDE + 1)))) {
                //System.out.println(side1 + " " + side2 + " " + side3);
            }
            RightTriangle rightTriangle = new RightTriangle(side1, side2, side3);
            rightTriangles.add(rightTriangle);
        }
        System.out.println(rightTriangles);

        System.out.println(rightTriangles.getLargestHypotenuse());

    }
}
