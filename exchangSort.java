import java.util.Scanner;
 
class ExchangSort{
	int [] a;
	public void init(){
		a= new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 10 numbers ");
		for(int i=0; i<10; i++){
			a[i]=sc.nextInt();
		}
	}
	public void exchangesort(){
				int temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					temp=a[j];
					a[i]=a[j];
					a[j]=temp;
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
	public static void main(String [] args){
		ArraySort a1 = new ArraySort();
		a1.init();
		a1.print();
		a1.exchangSort();
		a1.print();
        }
}