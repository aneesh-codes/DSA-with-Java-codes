//Single linked list creation and traversal

package LinkedList_chap;
import java.util.Scanner;
class Sll {
    static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }Node head = null;

    public void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            }
            else{
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to continue, If yes press 1 : ");
            n = sc.nextInt();
        }
        while(n==1);
    }
//traversal
    public void display() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
}
    // Main method 
    public static void main(String[] args) {
        Sll sll = new Sll();
        sll.creation();
        sll.display();
    }
    
}
