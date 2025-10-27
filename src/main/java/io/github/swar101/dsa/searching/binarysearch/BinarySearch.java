package io.github.swar101.dsa.searching.binarysearch;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static int search(List<Integer> A, int target) {
        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == A.get(mid))
                return mid;
            if (target < A.get(mid))
                high = mid - 1;
            else if (target > A.get(mid))
                low = mid + 1;

        }

        return 0;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 3, 5, 6, 9, 10);
        System.out.println(search(A, 6));
    }
}