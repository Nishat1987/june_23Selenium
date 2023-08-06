package june_23Selenium2;

public class PrimeNumber {
public static void main(String[] args) {
	   
	int num = 12;
	boolean isPrime = true;
	
	for(int i = 2; i< num; i++) {
		if(num % i == 0)
			{isPrime = false;
		break;
			}}

		if(isPrime)
			{System.out.println(num + " is a prime number");
}else{
	System.out.println(num + " is not a prime number");
	}
		
		//MethodDemo  md = new MethodDemo();
		int h = MethodDemo.sub(10, 6);
		System.out.println(h);
		
}}

