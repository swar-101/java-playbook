package io.github.swar101.dsa.datastructure.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        test_insertion_deletion();
    }

    private static void test_insertion_deletion() {
        begin("test_insertion_deletion");
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(22);

        linkedList.removeFromLast();
        linkedList.insertAtEnd(32);

        System.out.println(linkedList);
        System.out.println("The size of the Linked List is " + linkedList.size);
        end();
    }

    private static void begin(String methodName) {
        System.out.println("Testing " + methodName + "...");
    }

    private static void end() {
        System.out.println("Testing complete");
    }
}