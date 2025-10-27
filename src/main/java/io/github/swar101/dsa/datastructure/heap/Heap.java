package io.github.swar101.dsa.datastructure.heap;

import java.util.List;

public interface Heap<T> {

    void insert(T val);
    T peek();
    T poll();
    int size();
    List<T> toList();

    void heapifyDown();
    void heapifyUp();
}