package com.jakewagoner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Write a program to search for the "saddle points" in a 5 by 5 array of integers.
A saddle point is a cell whose value is greater than or equal to any in its row, and less than or equal to any in its column.
There may be more than one saddle point in the array. Print out the coordinates of any saddle points your program finds.
Print out "No saddle points" if there are none.
 */
class SaddlePointsTest {
    @Test
    @DisplayName("Number of SaddlePoints")
    void numberOfSaddlePoints() {
        int[][] arr = {{0,0,4,0,0}, // one saddle point at the center
                       {0,0,3,0,0},
                       {0,1,2,1,0},
                       {0,0,3,0,0},
                       {0,0,4,0,0}};

        int[][] arr2 = {{0,12,7,0,0}, // four saddle points
                       {0,6,6,15,0},
                       {5,6,6,4,3},
                       {0,6,6,0,0},
                       {0,12,7,0,0}};

        int[][] arr3 = {{0,0,0,0,0}, // 25 saddle points (by the definition given)
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0}};

        int[][] arr4 = {{15,0,9,8,1}, // 0 saddle points
                        {0,123,0,0,0},
                        {0,0,0,1,0},
                        {6,0,0,0,1222},
                        {0,15,28,0,0}};

        assertEquals(1, SaddlePoints.getNumPoints(arr));
        assertEquals(4, SaddlePoints.getNumPoints(arr2));
        assertEquals(25, SaddlePoints.getNumPoints(arr3));
        assertEquals(0, SaddlePoints.getNumPoints(arr4));
    }

}