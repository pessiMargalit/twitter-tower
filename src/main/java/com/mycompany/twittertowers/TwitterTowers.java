package com.mycompany.twittertowers;

import java.util.Scanner;

public class TwitterTowers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printOptionsMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    calculateRectangularTower(scanner);
                case 2 ->
                    calculateTriangularTower(scanner);
                case 3 ->
                    System.out.println("Exiting program...");
                default ->
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
        System.out.print("Enter height of the triangle tower: ");
        int height = scanner.nextInt();
        System.out.print("Enter width of the triangle tower: ");
        int width = scanner.nextInt();
        TriangleShape triangle = new TriangleShape(width, height);
        int choice;

        do {
            PrintTriangularTowerMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 ->
                    System.out.println("Perimeter of the triangle tower: " + triangle.calcPerimeter());
                case 2 ->
                    triangle.printTriangle();
                default ->
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 1 && choice != 2);
    }

    public static void printOptionsMenu() {
        System.out.println("Twitter Towers Menu");
        System.out.println("1. Rectangular Tower");
        System.out.println("2. Triangular Tower");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void PrintTriangularTowerMenu() {
        System.out.println("1. Calculate the perimeter of the triangle");
        System.out.println("2. Print the triangle");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

    }

}
