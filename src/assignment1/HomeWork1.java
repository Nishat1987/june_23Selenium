package assignment1;

public class HomeWork1 {
 
public static void main(String[] args) {
		
 A a= new A();
  a.abc();
 B b = new B();
  b.abc();
 C c = new C();
  c.abc();
  
}}

class A{
public void abc() {
		System.out.println("A");
	}
}

class B extends A{
	public void abc() {
		System.out.println("B");
	}
	
}

class C extends B{
	public void abc() {
		System.out.println("C");
	}
}