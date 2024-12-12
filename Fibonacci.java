// 0  1   1  2  3   5  8  13  21  34  55  89 

// a   b  c

//     a   b

import java.util.Scanner;
 
class Fibonacci{

	public void fibonacci(int n){

		int a=0, b=1,c;

		System.out.print(a+ "  " + b);

		for(int i=3;i<=n;i++){

			c=a+b;

			System.out.print("  " +c);

			a=b;

			b=c;

		}

	}

	public static void main(String [] args){

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the limit for Fibonacci series ");

		n=sc.nextInt();

		Fibonacci f1 = new Fibonacci();

		f1.fibonacci(n);

	}

}

 