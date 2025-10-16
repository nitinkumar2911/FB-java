class Car{
    private String brand;
    private String model;
    private long cost;
    public void setBrand(String n){
        brand = n;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String s){
        model = s;
    }
    public String getModel(){
        return model;
    }
    public void setCost(int t){
        if(t>0){
            cost = t;
        }else{
            System.out.println("Invalid cost");
        }
    }
    public long getCost(){
        return cost;
    }


}
public class Encapsulation2 {
    public static void main(String[] args){
        Car m = new Car();
        m.setBrand("Scarpio");
        m.setModel("Fortuner");
        m.setCost(100000);

        System.out.println(m.getModel());
        System.out.println(m.getBrand());
        System.out.println(m.getCost());

    }
    
}
