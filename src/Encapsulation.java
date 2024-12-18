public class Encapsulation {

    private int speed;
    private String model;

    public int getSpeed(){
        return speed;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public void setSpeed(int speed){
        if(speed > 0){
            this.speed = speed;
        }
    }

    public static  void main(String[] args){
        Encapsulation e = new Encapsulation();
        e.setSpeed(100);
        e.setModel("KIA");
        System.out.println("Car Speed " + e.getSpeed());
        System.out.println("Car Model " + e.getModel());
    }
}
