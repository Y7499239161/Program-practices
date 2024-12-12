// write a program to accept a number and print the sum of all digit which are  divisible by 5

import java.util.Scanner;
 class Divisibleby5{
	public static void main(String[]args){
	int no;
	Scanner sc=new Scanner(System.in);	
	 System.out.println("Enter the number  each digit which are  divisible by 5");
	  no=sc.nextInt();
	   int sum=0,d;
          while(no>0){
	    d=no%10;
	 if(d%5 ==0){
           sum=sum+d;
		}
	         no=no/10;

	}
	System.out.println("sum of digit:"+sum);
    }
 }
