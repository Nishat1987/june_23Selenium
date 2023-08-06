package inheritance;

public class MethodOverrideDemo {

	public static void main(String[] args) {
	
		E e= new E();
		e.a1();

	}
	}
	 class D{
		public void a1() {
			System.out.println(" It is a parent");
		}
	}
	class E extends D{
		public void a1() {
		//	super.a1();
			System.out.println("it is a child");
		}
	}


