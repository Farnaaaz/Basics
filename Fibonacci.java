//**************************************
//Printing out fibonacci series 
//**************************************

public class Fibonacci {

	public static void main(String[] args) {
		
		int f1 = 0;
		int f2 = 1;
		int f3;
		
		for (int i = 0 ; i < 13 ; i++)
		{
			System.out.print(f1 + "\t");
			 
			f3 = f1 + f2;
			f2 = f1;
			f1 = f3;
		}
		
	}

}
