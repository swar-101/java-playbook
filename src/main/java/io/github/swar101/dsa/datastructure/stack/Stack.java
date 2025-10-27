package io.github.swar101.dsa.datastructure.stack;

public class Stack<T> {

    T[] data;
    int top;

    private static int MAXIMUM_CAPACITY = 10;

    public Stack() {
        data = (T[]) new Object[MAXIMUM_CAPACITY];
        top = -1;
    }

    public void push(T item) {
        if (top == data.length - 1) {
            resize();
        }
        data[++top] = item;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack Underflow");
        T item = data[top];
        data[top--] = null;
        return item;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newData = (T[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}