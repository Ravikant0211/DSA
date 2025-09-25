package LinkedList;

import java.util.Scanner;

public class AddToFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Create the linked list
        Node head = null, temp = null;
        while (n-- > 0) {
            int input = sc.nextInt();
            Node newNode = new Node(input);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        // add node to first
        head = addToFirst(head, k);
        // print the linkedList
        printLinkedList(head);
    }

    public static Node addToFirst(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

