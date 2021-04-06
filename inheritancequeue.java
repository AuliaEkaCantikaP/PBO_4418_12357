import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Buku buku = new Buku();
            System.out.println(sayur.sisaSayur());
 
            sayur.tambahBuku("Fisika");
            sayur.tambahBuku("Matematika");
            sayur.tambahBuku("Kimia");
            sayur.tambahBukur("Biologi");
            sayur.tambahSayur("Sejarah");
            System.out.println(sayur.sisaBuku());
 
            sayur.bukuSobek(3);
            System.out.println(buku.bukuSobek());
      }      
}

class Toko_Buku {
      Queue<String> book = new LinkedList<String>();
 
      public Toko_Sayur(){
 
      }
      public void setBuku(Queue<String> book) {
            this.book = book;
      }
      public Queue<String> getBuku(){
            return this.vegetable;
      }
}

class Buku extends Toko_Buku {
      public void tambahBuku(String book){
            super.getBuku().add(book);
      }
      public void bukuSobek(int index){
            System.out.println(super.getBuku().poll());
      }
      public Queue<String> bukuSobek(){
            return super.getBuku();
      }
} 