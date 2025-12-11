//creatiion of doubly linked list

import java.util.Scanner;
public class doubly_linklist {
    static class Node{
        int data;
        Node next;
        Node prev; //pointer to previous node    

    //constructor 
    Node (int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}   
    Node head = null;

    public void creation(){
        int data,n;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null){
                head = new_node;
            }else{
                new_node.next = head;
                head.prev = new_node; //new 
                head = new_node;
            }
            System.out.println("Do you want to continue, If yes press 1 : ");
            n = sc.nextInt();
        }
        while(n==1);
        sc.close();
    }

    public static void main(String[] args) {
        doubly_linklist list = new doubly_linklist();
        list.creation();
        // list.display();
    }
}
