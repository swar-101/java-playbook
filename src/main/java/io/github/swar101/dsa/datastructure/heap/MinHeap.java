package io.github.swar101.dsa.datastructure.heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap implements Heap<Integer> {

    private final List<Integer> minHeapArray;
    private int HEAP_SIZE = 0;

    public MinHeap() {
        minHeapArray = new ArrayList<>();
    }


    @Override
    public void insert(Integer val) {

    }

    @Override
    public Integer peek() {
        return minHeapArray.getFirst();
    }

    @Override
    public Integer poll() {
        if (minHeapArray.isEmpty()) throw new IllegalStateException("Heap is empty");

        int val = minHeapArray.getFirst();
        int last = minHeapArray.remove(minHeapArray.size() - 1);

        if (!minHeapArray.isEmpty()) {
            minHeapArray.set(0, last);
            heapifyDown();
        }

        HEAP_SIZE = minHeapArray.size();
        return val;
    }

    @Override
    public int size() {
        return HEAP_SIZE;
    }

    @Override
    public List<Integer> toList() {
        return List.of();
    }


    @Override
    public void heapifyDown() {
        heapifyDownFrom(0);
    }

    private void heapifyDownFrom(int i) {
        int smallestIdx = i;
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;
        int n = minHeapArray.size();

        if (leftChildIdx < n && minHeapArray.get(leftChildIdx) < minHeapArray.get(smallestIdx))
            smallestIdx = leftChildIdx;
        if (rightChildIdx < n && minHeapArray.get(rightChildIdx) < minHeapArray.get(smallestIdx))
            smallestIdx = rightChildIdx;

        if (smallestIdx != i) {
            int temp = minHeapArray.get(i);
            minHeapArray.set(i, minHeapArray.get(smallestIdx));
            minHeapArray.set(smallestIdx, temp);
            heapifyDownFrom(smallestIdx);
        }
    }

    @Override
    public void heapifyUp() {
        int i = minHeapArray.size() - 1;

        while(i > 0) {
            int parent = (i - 1) / 2;
            if (minHeapArray.get(parent) > minHeapArray.get(i)) {
                int temp = minHeapArray.get(parent);
                minHeapArray.set(parent, minHeapArray.get(i));
                minHeapArray.set(i, temp);
                i = parent;
            }
            else break;
        }
    }
}