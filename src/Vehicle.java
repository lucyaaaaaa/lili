public class Vehicle {
    private String brand;
    private String color;
    private int speed;
    private int wheels;
    public Vehicle(String brand, String color, int speed, int wheels){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String color(){
        return color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels() {
        return wheels;
    }
}




