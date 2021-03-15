class Matematika
{

    int tambah, kurang, kali, bagi=0;
    
    
    
    // method
    void pertambahan(int i)
    {
        tambah= tambah + i;
        System.out.println("\nPertambahan:20 + " + i + " = " + tambah);
    }
    
    void pengurangan(int i)
    {
        kurang = kurang - i;
        System.out.println("\nPengurangan :10 - " + i + " = " + kurang);
        
    }
    
    void perkalian(int i)
    {
        kali= kali * i;
        
                System.out.println("\nPerkalian :10 x " + i + " = " + kali);
    }
    
    void pembagian(int i)
    {
        bagi= bagi / i;
        
                System.out.println("\nPerkalian : 20 / " + i + " = " + bagi);
    }
}

public class MatematikaDemo
{
    public static void main(String[] args)
    {
        Matematika operator = new Matematika();
        
        ///memanggil atribut dan memberi nilai
        operator.tambah=20;
        operator.kurang=10;
        operator.kali=10;
        operator.bagi=20;

        
        ///memanggil fungsi dan mengisi nilai parameter
        operator.pertambahan(20);
        operator.pengurangan(5);
        operator.perkalian(20);
        operator.pembagian(2);
        
    }
}