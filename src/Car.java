public class Car extends Vehicle{
    private int loader;

    public Car(String brand, String color, int speed, int wheels,int loader) {
        super(brand, color, speed, wheels);
        this.loader = loader;
    }




    //成员方法

    //汽车状态

    public void start(){
        System.out.println("Car is started.");
    }
    public void accelerate(int speed){
        this.setSpeed(this.getSpeed() + speed);
        System.out.println("Car is accelerating at speed:" + this.getSpeed());
    }
    public void brake(){
        System.out.println("Car is braking.");
    }

    //小车载重

    public void Loader(){
        if (this.loader > 5) {
            System.out.println("这是一辆小车，能载五人，实载" + this.loader + "人,你超载了。");
        }else{
            System.out.println("这是一辆小车，能载五人，实载" + this.loader);
        }
    }

}
