package io.github.swar101.dsa.datastructure.heap.test.minheap;//package main.java.dsa.datastructure.heap.test.minheap;
//
//import main.java.dsa.datastructure.heap.Heap;
//import main.java.dsa.datastructure.heap.MinHeap;
//
//import java.util.Arrays;
//
//public class TestHeapManipulationFunctions {
//
//    public static void main(String[] args) {
//        Heap heap = new MinHeap();
//
//        // Test: insert()
//        System.out.println("🛠 Inserting: 23, 11, 12, 45");
//        heap.insert(23);
//        heap.insert(11);
//        heap.insert(12);
//        heap.insert(45);
//
////        System.out.println("📦 Heap after inserts: " + Arrays.toString(heap()));
//        int[] expected = {11, 23, 12, 45};  // Valid MinHeap shape
////        assert Arrays.equals(heap.toArray(), expected) : "❌ Heap insert failed";
//
//        // Test: peek()
//        System.out.println("\n🔍 Testing peek()");
////        int top = heap.peek();
//        System.out.println("👀 Peeked value: " + top);
//        assert top == 11 : "❌ peek() did not return the correct min value";
//
//        // Test: poll()
//        System.out.println("\n🧹 Testing poll()");
//        int removed = heap.poll();
//        System.out.println("🗑 Removed value: " + removed);
//        System.out.println("📦 Heap after poll: " + Arrays.toString(heap.toArray()));
//        assert removed == 11 : "❌ poll() did not return the correct min value";
//
//        // Test: size()
//        System.out.println("\n📏 Testing size()");
//        int size = heap.size();
//        System.out.println("🔢 Heap size: " + size);
//        assert size == 3 : "❌ Heap size after poll is incorrect";
//
//        System.out.println("\n✅ All heap manipulation tests passed.");
//    }
//}