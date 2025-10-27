package io.github.swar101.dsa.datastructure.heap.test.minheap;//package main.java.dsa.datastructure.heap.test.minheap;
//
//import main.java.dsa.datastructure.heap.Heap;
//import main.java.dsa.datastructure.heap.MinHeap;
//
//import java.util.Arrays;
//
//public class TestHeapifyDown {
//
//    public static void main(String[] args) {
//        Heap a = new MinHeap();
//        a.insert(40);
//        a.insert(15);
//        a.insert(30);
//        a.insert(25);
//
//        /*
//         * Test a normal array
//         * */
//        a.heapifyDown();
//        System.out.println(Arrays.toString(a.toArray()));
//
//        assert Arrays.equals(a.toArray(), new int[]{15, 25, 30, 40})
//                : "Heaps should be equal";
//
//        /*
//         * Test an empty array
//         * */
//        Heap e = new MinHeap();
//        System.out.println(Arrays.toString(e.toArray()));
//
//        assert Arrays.equals(e.toArray(), new int[]{})
//                : "Heaps should be equal";
//    }
//}