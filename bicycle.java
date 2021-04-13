public class Bicycle extends Vehicle{
    public Bicycle(){
        super();
    }

    public void ringBell(){
        System.out.println("Kring....Kring....");
    }

    public void goStraight(){
        System.out.println("Sepeda Majuuu");
        speed = speed + 15;
    }
}
