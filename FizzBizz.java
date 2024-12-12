 import java.util.Scanner;

class FizzBizz{
	public static void main(String[]args){ 
	  int no=1;
	 
	
	while(no<=100){
	   if(no%3==0 && no%5==0)
	   System.out.println("FizzBizz");
	  else if(no%3==0)
	 System.out.println("Fizz");
	
	 else if(no%5==0)
	 System.out.println("Bizz");
	else
	 System.out.println(""+no+"");


	   no++;
	}
		
     }
 }

