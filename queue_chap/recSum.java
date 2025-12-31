// this is the recursion program for sum of n natural numbers

package queue_chap;
import java.util.Scanner;
public class recSum {
    public static int recSum(int n) //kina static rakheko
    { 
        if(n==1){
            return 1;
        }
        return n + recSum(n-1);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();

        int sum = recSum(n);
        System.out.println("The sum of is: " + sum);
    }
}
