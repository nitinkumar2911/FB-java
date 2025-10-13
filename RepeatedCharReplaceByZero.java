import java.util.Scanner;

public class RepeatedCharReplaceByZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        char[] arr = s.toCharArray()
        ;
        for(int i = 0; i<s.length(); i++){
            if(arr[i] == '0') continue;
        
        boolean repeated = false;
        for(int j = 1 +i; j<s.length(); j++){
            if(arr[i] == arr[j]){
                arr[j] = '0';
                repeated = true;
            }
        }
        if(repeated){
            arr[i] = '0';
        }
    }
    System.out.println("Modified String : "+ new String(arr));

    }
    
}
