import java.util.Scanner;
class ArrayMaxMin{
	int [] a;
	public void init(){
		 a=new int[10];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any 10 number");
		for(int i=0; i<10;i++){
			a[i]=sc.nextInt();
		}
   	 }

	public int minOfArray(){
		int min=a[0];
		for(int i=1;i<10;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
  	}

	public int maxOfArray(){
		int max=a[0];
		for(int i=1;i<10;i++){
		 	if(a[i]>max){
		    	 max=a[i];
			}
		}
		return max;
	}
	public static void main(String[]args){
		ArrayMaxMin a1=new ArrayMaxMin();
		a1.init();
		int x=a1.maxOfArray();
		int n=a1.minOfArray();
		System.out.println(" Maximum :" +x);
		System.out.println(" Minimum :" +n);

	//System.out.println("the Maximum number from array:" a1.maxOfArray);
	//System.out.println("the Maximum number from array:" a1.minOfArray);

  	}
}
