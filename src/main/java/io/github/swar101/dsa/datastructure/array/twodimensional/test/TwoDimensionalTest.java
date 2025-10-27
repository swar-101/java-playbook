package io.github.swar101.dsa.datastructure.array.twodimensional.test;//package org.swar101.dsa.datastructure.array.twodimensional.test;
//
////import com.java.dsa.datastructure.array.twodimensional.TwoDimensionalArray;
//
//import java.util.Arrays;
//
//public class TwoDimensionalTest {
//
//    private final static TwoDimensionalArray t = new TwoDimensionalArray();
//
//    public static void main(String[] args) {
//        testRowSum();
//        testColumnSum();
//        testTranspose();
//        testReverse();
//    }
//
//    private static void testRowSum() {
//        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println("Testing row sum for input " + Arrays.deepToString(arr));
//        int[] result = t.calculateRowSum(arr);
//        System.out.println("The result is " + Arrays.toString(result));
//        int[] expected = new int[]{6, 15, 24};
//
//        if (Arrays.equals(expected, result))
//            System.out.println("Test case passed!");
//        else
//            System.out.println("Test case failed!");
//    }
//
//    private static void testColumnSum() {
//        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}};
//        System.out.println("Testing col sum for input " + Arrays.deepToString(arr));
//        int[] result = t.calculateColumnSum(arr);
//        System.out.println("The result is " + Arrays.toString(result));
//        int[] expected = new int[]{1 + 5 + 9, 2 + 6 + 1, 3 + 7 + 2, 4 + 8 + 3};
//
//        if (Arrays.equals(result, expected))
//            System.out.println("Test case passed!");
//        else
//            System.out.println("Test case failed!");
//    }
//
//    private static void testTranspose() {
//        System.out.println("Testing transpose for jagged array...");
//        int[][] jaggedArray = new int[][]{{1, 2}, {3, 4}, {5, 6}};
//        System.out.println(Arrays.deepToString(jaggedArray));
//        int[][] result = t.transpose(jaggedArray);
//        System.out.println("The result is " + Arrays.deepToString(result));
//        int[][] expected = new int[][]{{1, 3, 5}, {2, 4, 6}};
//
//        if (Arrays.deepEquals(result, expected))
//            System.out.println("Test case passed!");
//        else
//            System.out.println("Test case failed!");
//
//        System.out.println("Testing transpose for square matrix...");
//        int[][] squareMatrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(Arrays.deepToString(squareMatrix));
//        result = t.transpose(squareMatrix);
//        System.out.println("The result is " + Arrays.deepToString(result));
//        expected = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
//
//        if (Arrays.deepEquals(result, expected))
//            System.out.println("Test case passed!");
//        else
//            System.out.println("Test case failed!");
//    }
//
//    private static void testReverse() {
//        System.out.println("Testing clockwise reverse for square matrix...");
//        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        printInput(input);
//        int[][] result = t.rotateClockwise(input);
//        printResult(result);
//        int[][] expected = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
//        if (Arrays.deepEquals(result, expected))
//            printTestMessage("Test case passed!");
//        else
//            printTestMessage("Test case failed!");
//
//        printTestMessage("Testing anti-clockwise reverse for square matrix...");
//        input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        printInput(input);
//        result = t.rotateAntiClockwise(input);
//        printResult(result);
//        expected = new int[][]{{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
//        if (Arrays.deepEquals(result, expected))
//            printTestMessage("Test case passed!");
//        else
//            printTestMessage("Test case failed!");
//
//        printTestMessage("Testing clockwise reverse for jagged matrix...");
//        input = new int[][]{{1, 2}, {3, 4}, {5, 6}};
//        printInput(input);
//        result = t.rotateClockwise(input);
//        printResult(result);
//        expected = new int[][]{{5, 3, 1}, {6, 4, 2}};
//        if (Arrays.deepEquals(result, expected))
//            printTestMessage("Test case passed!");
//        else
//            printTestMessage("Test case failed!");
//
//        printTestMessage("Testing anti-clockwise reverse for jagged matrix...");
//        input = new int[][]{{1, 2}, {3, 4}, {5, 6}};
//        printInput(input);
//        result = t.rotateAntiClockwise(input);
//        printResult(result);
//        expected = new int[][]{{2, 4, 6}, {1, 3, 5}};
//        if (Arrays.deepEquals(result, expected))
//            printTestMessage("Test case passed!");
//        else
//            printTestMessage("Test case failed!");
//    }
//
//    private static void printInput(int[][] input) {
//        System.out.println("The input is " + Arrays.deepToString(input));
//    }
//
//    private static void printResult(int[][] result) {
//        System.out.println("The result is " + Arrays.deepToString(result));
//    }
//
//    private static void printTestMessage(String msg) {
//        System.out.println(msg);
//    }
//}