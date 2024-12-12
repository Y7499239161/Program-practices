// program to print reverse of number
//no        d       rev
//5281

import java.util.Scanner;

 class Reverse {
    public static void main(String[] args) {
	 int no;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any number");
	no=sc.nextInt();
	int rev=0,d;
	while(no>0){
		d=no%10;
		rev=rev*10+d;
		no=no/10;
		
	  }
	 System.out.println(rev);
	  
	 
	}
   }
