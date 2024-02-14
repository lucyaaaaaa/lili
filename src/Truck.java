public class Truck extends Vehicle{
    private int loader;
    private double payload;
    public Truck(String brand, String color, int speed, int wheels,int loader,double payload) {
        super(brand, color, speed, wheels);
        this.loader = loader;
        this.payload =  payload;

    }


    //成员方法

    public void start(){
        System.out.println("Truck is strating.");
    }
    public void accelerate(int speed){
        this.setSpeed(this.getSpeed() + speed);
        System.out.println("Truck is accelerating at speed" + this.getSpeed());
    }
    public void brake(){
        System.out.println("Truck is braking.");
    }

    //卡车载重

    public void Loader(){
        if(this.loader>3){
            System.out.println("这是一辆卡车，能载3人，实载" + this.loader + "人，你超载了。");
        }else {
            System.out.println("这是一辆卡车，能载3人，实载" + this.loader + "人。");
        }
    }
    public void Payload(){
        if(this.payload>5000){
            System.out.println("这是一辆卡车，核载5000kg，已装载" + this.payload + "kg,你超载了。");
        }else{
            System.out.println("这是一辆卡车，核载5000kg，已装载" + this.payload + "kg。");
        }
    }
}

