
class Sepeda{
    int speed =0;
    int gear =0;
    
    // method
    void operGigi(int gigibaru)
    {
        gear = gear + gigibaru;
        System.out.println("\n Gear:" + gear);
    }
    
    void kecepatan(int tambah)
    {
        speed = speed + tambah;
        System.out.println("\n Speed:" + speed);
    }
}

public class SepedaDemo
{
    public static void main(String[] args)
    {
        ///membuat object 
        Sepeda bike = new Sepeda();
        
        // memanggil atribut dan memberi nilai
        bike.speed = 5;
        bike.gear = 2;
        
        // memanggil methode dan menunjuk nilai parameter
        bike.kecepatan(6);
        bike.operGigi(4);
        
    }
}