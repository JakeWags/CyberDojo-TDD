package com.jakewagoner;

/*
Write a program to search for the "saddle points" in a 5 by 5 array of integers.
A saddle point is a cell whose value is greater than or equal to all integers in its row, and less than or equal to all integers in its column.
There may be more than one saddle point in the array. Return the number of saddlepoints in a given 5x5 array.
Return 0 if none are found.
 */
public class SaddlePoints {

    public static int getNumPoints(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (checkSaddlePoint(arr, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean checkSaddlePoint(int[][] arr, int i, int j) {
        for (int row = 0; row < arr.length; row++) { // check each row on column j
            if (row != i) { // if it's not the value given
                if (arr[row][j] < arr[i][j]) return false;
            }
        }
        for (int col = 0; col < arr[i].length; col++) { // check each column on row i
            if (col != j) { // if it's not the value given
                if (arr[i][col] > arr[i][j]) return false;
            }
        }

        return true;
    }

}
