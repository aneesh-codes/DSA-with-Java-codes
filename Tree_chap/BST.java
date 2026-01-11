
// all codes realted to BST

package Tree_chap;

class Node {

    Integer data;
    Node left,right;

    public Node(int data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST{
    Node root;
    public BST(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int key){
        Node p = root, prev = null;

        while(p != null){
            prev = p;
            if(p.data < key){
                p = p.right;
            }else{
                p = p.left;
            }
        }

        //if tree is empty
        if(root == null){
            root = new Node(key);
        }else if(prev.data < key){
            prev.right = new Node(key);
        }else{
            prev.left = new Node(key);
        }
    }

    // main class 
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
    }
}