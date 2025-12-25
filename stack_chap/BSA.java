// Binary Search Algorithm in java 
public class BSA {
   public static int binarySearch(int arr[], int key){
        int low =0, high = arr.length -1, mid;
        while(low<=high){
            mid = (low + high)/2;
            if(key>arr[mid])
                low = mid+1;
            else if(key<arr[mid])
                high = mid-1;
            else 
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,10,20,22,30,32,66};
        int key = 61;
        System.out.println(binarySearch(arr,key));
    }
}
