import java.util.Scanner;

  class  AreaOfRectangle{
	public static void main(String []args){
	int len,bre;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Any Length");
	len=sc.nextInt();

	System.out.println("Enter Any breadth");
	bre=sc.nextInt();

	System.out.println("The length is:"+len);
	System.out.println("The breadth is:"+bre);
	System.out.println("The Area Of rectangle is: "+ len*bre);
   }

}
