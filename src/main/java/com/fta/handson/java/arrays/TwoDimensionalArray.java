package com.fta.handson.java.arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        twoDimensionalArray();
        System.out.println("===============");
        twoByThreeDimensionalArray();
        System.out.println("===============");
        multiDimensionalArray();
        System.out.println("===============");
        storeMultipleTypesInObjectArray();
    }

    private static void storeMultipleTypesInObjectArray() {
        Object[][] storeMultiTypes = new Object[][]{
                {0, "Hi", true, 2.3, 45.04332},
                {0, "How", false, 1.3, 343.332},
                {0, "Are", false, 5.7, 32123.032},
                {0, "you", true, 8.1, 452312.03212312}
        };

        for(int i=0; i< 4;i++){
            for(int j=0; j<5; j++){
                System.out.print(storeMultiTypes[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void twoByThreeDimensionalArray() {
        int[][] twoByThreeArray = new int[2][3];
        twoByThreeArray[0][0] = 43;
        twoByThreeArray[0][1] = 132;
        twoByThreeArray[0][2] = 33;
        twoByThreeArray[1][0] = 123;
        twoByThreeArray[1][1] = 4544;
        twoByThreeArray[1][2] = 213;

        for (int i = 0; i < 2; i++) { // To iterate over rows
            for (int j = 0; j < 3; j++) { // To iterate over columns of the row in focus
                System.out.print(twoByThreeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void multiDimensionalArray() {
        int[][] multi = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void twoDimensionalArray() {
        // int[] singleDArray = new int[10]; // for your quick reference
        int[][] twoDArray = new int[2][2];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
