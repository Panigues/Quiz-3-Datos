package org.example;
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public Node search(int data) {
        Node current = head;
        while (current != null) {
            if (data == current.data) {
                return current;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
