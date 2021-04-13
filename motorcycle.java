public class MotorCycle extends MotorVehicle {
    private int numGigi;

    public MotorCycle(){
        super();
        numGigi = 0;
    }

    public MotorCycle(double kecepatan, String warna, int sizeEng, String lcPlate){
        super(kecepatan, warna, sizeEng, lcPlate);
        numGigi = 0;
    }

    public void setGigi(int numGigi){
        this.numGigi = numGigi;
    }

    public int getGigi(){
        return numGigi;
    }

    @Override
    public void goStraight(){
        System.out.println("Motor Majuuu");
        speed = speed + 30;
    }
}
