import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int k = sc.nextInt();
        int low = -1;
        int high = n-1;
        int idx = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                idx = mid;
                break;

            }else if(arr[mid]>k){
                high = mid -1;
            }else{
                low = mid +1;

            }

        }
        System.out.println("Index is "+ idx);
    }
    
}
