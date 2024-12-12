import java.util.Scanner;
class Prime{
	public void prime(int no){
	 boolean flag=true;
	for(int i=2;i<no;i++){
	 if(no%i ==0){
	 flag=false;
	 break;
		}
	}
	if(flag==true){
	 System.out.println("The number is prime");
	}
	 else{
	    System.out.println("The number is  Not prime");

	}
   }
	public static void main(String[]args){
	 int no;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 no =sc.nextInt();
	 Prime p1 = new Prime();
	 p1.prime(no);

	}
}