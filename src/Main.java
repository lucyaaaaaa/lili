public class Main{
    public static void main(String args){
        Car c = new Car("Lamborghini","Blue",40,4,6);
        System.out.println("车轮的个数是：" + c.getWheels());
        c.start();
        c.accelerate(60);
        c.brake();

        Truck t = new Truck("Faw-volkswagen","Black",50,4,1,5000);
        System.out.println("车轮的个数是：" + t.getWheels());
        t.start();
        t.accelerate(30);
        t.brake();

    }
}