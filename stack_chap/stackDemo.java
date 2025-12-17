// example of a stackDemo using ArrayList
package stack_chap;

public class stackDemo {

    int top;
    Integer[]arr;

    public stackDemo(int size) { //constructor ho size tala main function ma diyeko xa
    top = -1;
    arr = new Integer[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull(){
        return top >= arr.length -1; //stack overflow condition
    }

    public void push(int el){
        if(isFull()){
            System.out.println("stack overflow!!!");
        }else{
            arr[++top] = el; //index of top is pre-incremented
        }
    }

    public void pop(){
        if (isEmpty()) {
            System.out.println("stack underflow!!!");
        } else {
            System.out.println(arr[top]+ " is deleted from stack");
            top--;
        }
    }

    public void peek(){ //to see the array element at the top
        System.out.println(arr[top]);
    }

    // main function
    public static void main(String[] args){
        stackDemo s1 = new stackDemo(3);
        s1.push(10);
        s1.push(16);
        s1.push(18);
        s1.push(20);
        s1.peek();
    }
}
