package io.github.swar101.dsa.datastructure.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap implements Heap<Integer> {

    private final List<Integer> maxHeapArray;

    public MaxHeap() {
        maxHeapArray = new ArrayList<>();
    }


    @Override
    public void insert(Integer val) {

    }

    @Override
    public Integer peek() {
        return maxHeapArray.getFirst();
    }

    @Override
    public Integer poll() {
        if (maxHeapArray.isEmpty())
            throw new IllegalStateException("Heap is empty");

        int val = maxHeapArray.getFirst();
        int last = maxHeapArray.removeLast();

        if (!maxHeapArray.isEmpty()) {
            maxHeapArray.set(0, last);
            heapifyDown();
        }

        return val;
    }

    @Override
    public int size() {
        return maxHeapArray.size();
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
        int largestIdx = i;
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;
        int n = maxHeapArray.size();

        if (leftChildIdx < n && maxHeapArray.get(leftChildIdx) > maxHeapArray.get(largestIdx))
            largestIdx = leftChildIdx;

        if (rightChildIdx < n && maxHeapArray.get(rightChildIdx) > maxHeapArray.get(largestIdx))
            largestIdx = rightChildIdx;

        if (largestIdx != i) {
            int temp = maxHeapArray.get(largestIdx);
            maxHeapArray.set(largestIdx, maxHeapArray.get(i));
            maxHeapArray.set(i, temp);
            heapifyDownFrom(largestIdx);
        }
    }

    @Override
    public void heapifyUp() {
        int i = maxHeapArray.size() - 1;

        while (i > 0) {
            int parent = (i - 1) / 2;
            if (maxHeapArray.get(parent) < maxHeapArray.get(i)) {
                int temp = maxHeapArray.get(i);
                maxHeapArray.set(i, maxHeapArray.get(parent));
                maxHeapArray.set(parent, temp);
                i = parent;
            }
            else break;
        }
    }
}