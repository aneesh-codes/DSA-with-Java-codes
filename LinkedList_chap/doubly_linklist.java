//Add to head and tail in doubly linked list

import java.util.Scanner;

public class doubly_linklist {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at head
    public void insertAtHead(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }

    //  Insert at tail
    public void insertAtTail(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    //  creation method using insertAtHead
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();

            insertAtHead(data);  

            System.out.println("Do you want to continue? If yes press 1: ");
            n = sc.nextInt();

        } while (n == 1);
    }
    //display method
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        doubly_linklist list = new doubly_linklist();
        list.creation();
        list.display();
    }
}