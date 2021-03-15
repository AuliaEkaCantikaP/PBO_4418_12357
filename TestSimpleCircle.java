/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class SimpleCircle
{
   int radius=0;
   
   void area(int i)
   {
       radius = radius + i;
       System.out.println("The area of the circle of radius " + radius);
   }
}


public class TestSimpleCircle
{
	public static void main(String[] args) {
	
	SimpleCircle circle1 = new SimpleCircle();
	
	//memanggil atribut dan memberi nilai
	circle1.radius=5;
	
	circle1.area(6);
	
	}
}
