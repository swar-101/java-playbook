package io.github.swar101.dsa.sorting.bubblesort;

import io.github.swar101.dsa.sorting.Sort;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        return null;
    }
}