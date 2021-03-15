class Mobil2
{
    String posisi;
    int gigi=0;
    
    
    // method
    void hidupkanMobil(String newValue)
    {
        posisi = newValue;
        System.out.println("\nMobil:" + posisi);
    }
    
    void matikanMobil(String i)
    {
        posisi = i;
        System.out.println("\nMobil:" + posisi);
        
    }
    
    void ubahGigi(int tambah)
    {
        gigi= gigi + tambah;
        
                System.out.println("\nPosisi gigi setelah diubah :" + gigi);
    }
}

public class MobilDemo2
{
    public static void main(String[] args)
    {
        Mobil2 mobilku = new Mobil2();
        
        ///memanggil atribut dan memberi nilai
        mobilku.posisi="Hidup";
        mobilku.posisi="Mati";
        mobilku.gigi=1;
        
        mobilku.hidupkanMobil("Hidup");
        mobilku.matikanMobil("Mati");
        mobilku.ubahGigi(3);
        
    }
}