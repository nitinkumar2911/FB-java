import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to find :");
        int key = sc.nextInt();
        int index =-1;
        boolean found = false;
        for(int num: arr){
            index++;
            if(num == key){
                found = true;
                break;
            }
        }
        System.out.println("Element found  "+key+ " at index "+ index);
    }
    
}
