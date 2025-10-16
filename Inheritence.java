class Animal{
    String Animal;
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
        void bark(){
            System.out.println("dog is barking");
        }

    }
public class Inheritence {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();

    }
    
}
