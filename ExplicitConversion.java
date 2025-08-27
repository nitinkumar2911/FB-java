public class ExplicitConversion {
    public static void main(String[] args){
        double doubleNum = 99.99;
        int intNum = (int)doubleNum;
        int bigValue = 300;
        byte smallValue = (byte) bigValue;
        System.out.println("Double: "+doubleNum);
        System.out.println("int: "+ intNum);
        System.out.println("int 300 to byte(after casting) : "+ smallValue);
    }
    
}
