import java.util.Scanner;
class ArraySort{
	int [] a;
	public void init(){
		 a=new int[10];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any 10 number");
		for(int i=0; i<10;i++){
			a[i]=sc.nextInt();
		}
   	 }

	public void sort(){
		int temp;
		for(int i=0;i<a.length;i++){
		  for(int j=0;j<a.length-i-1;j++){
			if(a[j]>a[j+1]){
			  temp=a[j];
			  a[j]=a[j+1];
			 a[j+1]=temp;
			}
		   }
		}
	 }
	  public void print(){
	     System.out.println("\nThe array is : \n");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	  }
	   
	}

		public static void main(String[]args){
		ArraySort a1=new ArraySort();
		a1.init();
		a1.print();
		a1.sort();
		a1.print();
	    }
       }




