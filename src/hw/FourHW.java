package hw;

public class FourHW {

	public static void main(String[] args) {
		
		 C c1 = new C(); 
		 	c1.test(); 
		} 
	}
	class A{
		 void test(){} 
		} 


class B extends A{

 protected void test(){  
System.out.println("2nd method");
} 
}
class C extends B{

 public void test(){
	 System.out.println("3rd method");
 } 

}

