import java.util.Scanner;

  class  MarksOfJava{
	public static void main(String []args){
	int no,no1,no2;

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Marks of Student1");
	no=sc.nextInt();
	
	 
	System.out.println("Enter Marks of Student2");
	no1=sc.nextInt();
	
	
	System.out.println("Enter Marks of Student2");
	no2=sc.nextInt();
	
	System.out.println("Total Marks is:" +(no+no1+no2) );
	System.out.println("Total Avg is:" +(no+no1+no2) );

	

	

  }
}
