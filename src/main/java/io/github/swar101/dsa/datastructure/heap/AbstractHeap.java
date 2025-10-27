package io.github.swar101.dsa.datastructure.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AbstractHeap<T> implements Heap<T> {

    protected final List<T> heapArray;
    protected final Comparator<T> comparator;

    public AbstractHeap(Comparator<T> comparator) {
        this.comparator = comparator;
        this.heapArray = new ArrayList<>();
    }

    @Override
    public void insert(T val) {
        heapArray.add(val);
        heapifyUp();
    }

    @Override
    public T peek() {
        return heapArray.isEmpty() ? null : heapArray.getFirst();
    }

    @Override
    public T poll() {
        if (heapArray.isEmpty()) return null;

        T root = heapArray.getFirst();
        T last = heapArray.removeLast();

        if (!heapArray.isEmpty()) {
            heapArray.set(0, last);
            heapifyDown();
        }

        return root;
    }

    @Override
    public int size() {
        return heapArray.size();
    }

    @Override
    public List<T> toList() {
        return List.of();
    }

    protected int left(int i) {
        return 2 * i + 1;
    }

    protected int right(int i) {
        return 2 * i + 2;
    }

    protected int parent(int i) {
        return (i - 1) / 2;
    }

    protected void swap(int i, int j) {
        T temp = heapArray.get(i);
        heapArray.set(i, heapArray.get(j));
        heapArray.set(j, temp);
    }

    @Override
    public void heapifyDown() {

    }

    @Override
    public void heapifyUp() {

    }
}
