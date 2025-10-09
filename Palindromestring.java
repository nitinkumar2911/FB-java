import java.util.Scanner;

public class Palindromestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s+","").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        if(rev.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
