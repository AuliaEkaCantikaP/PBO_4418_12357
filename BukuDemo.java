class Buku
{
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
    
    public Buku(String judul, String pengarang, String penerbit, int tahun)
    {

        this.judul=judul;
        this.pengarang=pengarang;
        this.penerbit=penerbit;
        this.tahun = tahun;
        
    }
    
    public void cetakBuku()
    {
        System.out.println("Judul : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.tahun); 
        
    }
    
}

public class BukuDemo
{
    public static void main(String[] args)
    {
        Buku buku1 = new Buku("Pemrogaman Berbasis Objek dengan Java","Indraini", "Elexmedia Komputindo",2007);
        Buku buku2 = new Buku("Dasar Pemrogaman Java","Abdul Kadir", "Andi Offset",2004);
        buku1.cetakBuku();
        System.out.println(""); 
        buku2.cetakBuku();
    }
}

