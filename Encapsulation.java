class Student{
    private String name;
    private int age;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a>0){
            age = a;
        }else{
            System.out.println("Age must be positive ");
        }
    }
    public int getAge(){
        return age;
    }
}


public class Encapsulation {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Nitin");
        s.setAge(19);
        
        String res = s.getName();
        int age = s.getAge();
        System.out.println("Name : "+ res + "  Age : " + age);

    }
    
}
