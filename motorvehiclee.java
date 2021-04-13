public class MotorVehicle extends Vehicle{
    public int sizeOfEngine;
    public String licensePlate;

    public MotorVehicle(){
        super();
        sizeOfEngine = 1;
        licensePlate = "H 1 IDN";
    }

    public MotorVehicle(double kecepatan, String warna, int sizeEng, String lcPlate){
        super(kecepatan, warna);
        sizeOfEngine = sizeEng;
        licensePlate = lcPlate;
    }

    public int getSizeOfEngine(){
        return sizeOfEngine;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void goStraight(){
        System.out.println("Kendaraan Mesin Majuuu");
        speed = speed + 20;
    }
}