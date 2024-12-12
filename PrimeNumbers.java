import java.util.Scanner;
class PrimeNumbers{
	public void prime(int no){
	 boolean flag=true;
	 for(int i=2;i<no;i++){
	 if(no%i ==0){
	 flag=false;
	  break;
     }
 }
	 if(flag==true){
	    System.out.print(no+" ");
	}
   }
	public static void main(String[]args){
		 
	 PrimeNumbers p1 = new PrimeNumbers();
	  for(int i=2;i<=100;i++){
	  p1.prime(i);
        }
    }
}