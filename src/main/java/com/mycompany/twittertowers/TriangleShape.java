package com.mycompany.twittertowers;

class TriangleShape extends TowerShape {

    public TriangleShape(int width, int height) {
        super(width, height);
    }

    @Override
    public double calcPerimeter() {
        return 2 * width + Math.sqrt(2) * width;
    }

//    public void printShape() {
//        if (width % 2 == 0 || width >= 2 * height) {
//            System.out.println("Cannot print triangle.");
//        } else {
//            int mid = width / 2;
//            int spaces = mid;
//            for (int i = 0; i < height; i++) {
//                for (int j = 0; j < spaces; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 0; k < (2 * i) + 1; k++) {
//                    System.out.print("*");
//                }
//                spaces--;
//                System.out.println();
//            }
//        }
//    }
    
    public void printTriangle() {
        if (width % 2 == 0 || width >= 2 * height) {
            System.out.println("Cannot print triangle.");
        } else {
            int spaces = width / 2;
            int numRows = ((height - 2) / (width / 2) - 1);
            int upRow = (height - 2 - numRows * ((width / 2) - 1)) + numRows;
            int difference = upRow - numRows;
            int num = 1;
            boolean flag = false;
            for (int i = 0; i < height - 1; i++) {
                printSpaces(spaces);
                printAsterisks(num);
                if (!flag) {
                    if (i == 0) {
                        num += 2;
                        spaces--;
                    } else if (i % upRow == 0) {
                        num += 2;
                        spaces--;
                        flag = true;
                    }
                } else if ((i - difference) % numRows == 0) {
                    num += 2;
                    spaces--;
                }
                System.out.println();
            }

            printAsterisks(width);
            System.out.println();
        }
    }

    public static void printAsterisks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

}
