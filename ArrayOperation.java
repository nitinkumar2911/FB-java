import java.util.Arrays;
public class ArrayOperation {
    public static void main(String[] args){
        int arr[] = {2,5,3,0,1};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        int b[] = {2,5,3,0,1};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        int c[]= new int[5];
        Arrays.fill(c,7);
        System.out.println(Arrays.toString(c));
        Arrays.copyOf(b,8);
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(arr,b));



    }
    
}
