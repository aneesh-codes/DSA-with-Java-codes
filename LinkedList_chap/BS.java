package LinkedList_chap;
// Binary Search 

 class BS111 {

    public static int binarySearch(int[]arr,int key){
        int low = 0, mid, high = arr.length - 1;
        while (low <= high) {
            mid = (low + high)/2;
            if (key < arr[mid]) {
                high = mid - 1;
            }
            else if (key > arr[mid]) {
                low = mid + 1;
            } 
            else {
                return mid;
            }
           
        } 
         return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 5;
      System.out.println(binarySearch(arr,key));  
    // System.out.println("Hello World");
    }
}
