import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of an element  in the array "+sum);

    }
    
}
