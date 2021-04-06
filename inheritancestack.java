import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            Buah buah = new Buah();
            System.out.println(buah.sisaBuah());
 
            buah.tambahBuah("Lemon");
            buah.tambahBuah("Durian");
            buah.tambahBuah("Pir");
            System.out.println(buah.sisaBuah());
 
            buah.gantiBuah(2,"Jeruk");
            System.out.println(buah.sisaBuah());
 
            buah.buahBusuk();
            System.out.println(buah.sisaBuah());
      }
}
 
class Pasar_Buah {
      Stack<String> fruit = new Stack<String>();
 
      public Pasar_Buah(){
 
      }
      public void setBuah(Stack<String> fruit) {
            this.fruit = fruit;
      }
      public Stack<String> getBuah(){
            return this.fruit;
      }
} 
 
class Buah extends Pasar_Buah {
      public void tambahBuah(String fruit){
            super.getBuah().push(fruit);
      }
      public String buahBusuk(){
            return super.getBuah().pop();
      }
      public void gantiBuah(int index,String fruit){
            super.getBuah().set(index, fruit);
      }
      public Stack<String> sisaBuah(){
            return super.getBuah();
      }
}

