package io.github.swar101.dsa.datastructure.heap.test.minheap;//package org.swar101.dsa.datastructure.heap.test.minheap;
//
//import com.java.dsa.datastructure.heap.Heap;
//import com.java.dsa.datastructure.heap.MinHeap;
//
//import java.util.Arrays;
//
//public class TestHeapifyUp {
//
//    public static void main(String[] args) {
//        Heap minHeap = new MinHeap();
//
//        /*
//         * Test a normal array-based heap
//         * */
//        int[] a = {10, 15, 20, 17, 25, 5};
////        minHeap.heapifyUp(a, 5);
//        System.out.println(Arrays.toString(a));
//
//        assert Arrays.equals(a, new int[]{5, 15, 20, 17, 25, 20})
//                : "Arrays should be equal.";
//
//        /*
//         * Test an empty array-based heap
//         * */
//        int[] e = {};
////        minHeap.heapifyDown(e, 0);
//        System.out.println(Arrays.toString(e));
//
//        assert Arrays.equals(e, new int[]{})
//                : "Arrays should be equal";
//    }
//}