import java.util.*;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int comp = n;
        int res = 0;
        while(n>0){
            int rem = n%10;
            res = res*10 + rem;
            n/=10; 
        }
        if(res == comp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a Palindrome Number");
        }

    }
    
}
