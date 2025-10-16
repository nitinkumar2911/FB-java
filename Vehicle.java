class Car{
    String color;
    int speed;
    void display(){
        System.out.println(" speed of vehicle :"+ speed);
        System.out.println("Color of Vehicle is : "+ color);
    }

}
public class Vehicle {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "red";
        c1.speed = 90;
        c1.display();

    }
    
}
