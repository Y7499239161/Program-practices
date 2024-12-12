import java.util.Scanner;

class DoWhileLoopDemo2{
	public static void main(String[]args){ 
	  int no=1;
	  int sum=0;
	  String opt;
	Scanner sc=new Scanner(System.in);
	do{
	 System.out.println("Enter Any number");
		no =sc.nextInt();
		sum=sum+no;
	        System.out.println("Do you want to add another number? yes/no");
		 opt=sc.next();

		
      }while(opt.equals("yes"));
      System.out.println("The sum of all entered numbers;" +sum);
   }

 }