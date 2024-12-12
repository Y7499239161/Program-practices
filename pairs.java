//Pairs in an array
import java.util.Scanner;

class Pairs{
	public static void Pairs(int numbers[]){
		int totalpair = 0;
         for(int i=0;i<numbers.length;i++){
		int current= numbers[i];
	 for(int j=0+1;j<numbers.length;j++){
		System.out.println("(" + current +","+ numbers[j]+")");
			totalpair++;
			}
			System.out.println();
		}
		 System.out.println("Total Pairs :" + totalpair);
	}


	public static void main(String[]args){
    		int [] numbers = {2,4,6,8,10,12,14,16,18};
		Pairs(numbers);
	}
}