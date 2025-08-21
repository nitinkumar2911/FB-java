import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int value = i;
            int add = n;
            for(int j = i;j<=n; j++){

                System.out.print(value + " ");
                value += add;
                add--;

            }
            System.out.println();
        }
    }
    
}
