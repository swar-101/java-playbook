package io.github.swar101.dsa.datastructure.linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Takes constant time i.e. O(1)
    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        tail.next = new Node(data);
        tail = tail.next;
        size++;
    }

    // Takes linear time i.e. O(n)
    public void removeFromLast() {
        if (head == null)
            throw new RuntimeException("Node removal failed. The Linked List is empty.");

        if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;

            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
    }

    public void insertAt(int index, int data) {
        if (head == null || size < index)
            throw new RuntimeException("Node insertion failed. The Linked List is empty.");

        Node current = head;
        int count = 0;
        while (count < index) {
            current = current.next;
            count++;
        }

        Node newNode = new Node(data);
        current.next = newNode;

    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        return sb.append(" null").toString();
    }
}