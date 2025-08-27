import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];
        for(int i = 0; i<a.length;i++){
            b[i] = a[a.length-1-i];
            
        }
        System.out.println(Arrays.toString(b));


    }
    
}
