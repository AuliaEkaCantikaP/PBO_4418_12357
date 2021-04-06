[20:48, 4/6/2021] ramaaaaaa: public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";

    MotorVehicle() {

    }

    public MotorVehicle(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;

    }

    public void apa() {
        System.out.println(sizeofEngine);
        System.out.println(licencePlate);

    }

    public int getSizeofEngine() {
        return sizeofEngine;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

}
[20:48, 4/6/2021] ramaaaaaa: MotorVehicle.java
[20:48, 4/6/2021] ramaaaaaa: public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(3, "H 171 NO");
    

        sepeda.goStraight();
        sepeda.ringBell();
        motor.apa();
        kendaraan.turnRight();
        motor.getSizeofEngine();
    }
}