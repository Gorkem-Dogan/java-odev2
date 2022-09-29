package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
	int number =5;
	boolean isPrime =true;
	
	for(int i = 2; i < number; i++ ) 
	{
		System.out.println("------------------");
		if (number % i ==0) 
		{
			isPrime = false;
		}}
			
		if(isPrime) 
		{
			System.out.println("sayı asaldır");
		}
		else 
		{
			System.out.println("sayı asal değildir");
		}
	

	}

}
