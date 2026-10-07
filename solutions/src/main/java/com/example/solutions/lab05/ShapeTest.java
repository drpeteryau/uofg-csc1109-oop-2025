/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab05;

/** Lab 05 Q4(b): polymorphism through the {@link Shape} reference type. */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("Area of the circle: " + shape.calculateArea());
    }
}
