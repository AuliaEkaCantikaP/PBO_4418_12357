public class Vehicle {
    public double speed;
    public String color;

    public Vehicle() {
        speed = 0;
        color = "orange";
    }

    public Vehicle(double kecepatan, String warna){
        speed = kecepatan;
        color = warna;
    }

    public void goStraight(){
        System.out.println("Maju");
        speed = speed + 10;
    }

    public void turnLeft(){
        System.out.println("Belok Kiri");
    }

    public void turnRight(){
        System.out.println("Belok Kanan");
    }
}