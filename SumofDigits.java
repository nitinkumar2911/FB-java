import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int sum = 0;
        while(n>0){
            long last = n%10;
            sum +=last;
            n/=10;
        }
        System.out.println(sum);

    }
    
}
