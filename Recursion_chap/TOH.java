// tower of hanoi problem using recursion
public class TOH {
    public static void TOH(int n, char src, char aux, char dest){
        if (n==1){
            System.out.println("Move disk 1 from "+ src + " to " + dest);
            return;
        }
        TOH(n-1,src,dest,aux);
        TOH(1,src,aux,dest);
        TOH(n-1,aux,src,dest);
    }

    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
    
}
