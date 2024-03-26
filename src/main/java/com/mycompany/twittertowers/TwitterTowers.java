package com.mycompany.twittertowers;

import java.util.Scanner;

public class TwitterTowers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Rectangular Tower");
            System.out.println("2. Triangular Tower");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateRectangularTower(scanner);
                    break;
                case 2:
                    calculateTriangularTower(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void calculateRectangularTower(Scanner scanner) {
        int height = 0, width;
        System.out.print("Enter width of the tower: ");
        width = scanner.nextInt();
        do {
            System.out.print("Enter height of the tower: ");
            height = scanner.nextInt();
        } while (height < 2);
        RectangleShape rectangle = new RectangleShape(width, height);
        if (Math.abs(width - height) > 5 || width == height) {
            System.out.println("Area of the rectangular tower: " + rectangle.calcArea());
        } else {
            System.out.println("Perimeter of the rectangular tower: " + rectangle.calcPerimeter());
        }
    }

    public static void calculateTriangularTower(Scanner scanner) {
        System.out.print("Enter height of the triangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter width of the triangle: ");
        int width = scanner.nextInt();
        TriangleShape triangle = new TriangleShape(width, height);
        int choice;

        do {
            System.out.println("1. Calculate the perimeter of the triangle");
            System.out.println("2. Print the triangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Perimeter of the triangle tower: " + triangle.calcPerimeter());
                    break;
                case 2:
                    triangle.printTriangle();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }

}
