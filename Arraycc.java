import java.util.Scanner;
//liner serch

class Arraycc{
	public static int linearSerch(int number[], int key){
		for(int i=0;i<number.length;i++){
		 if(number[i]== key){
			return i;
			}
		}
		return -1;
	}


	public static void main(String[]args){
	 int [] numbers = {40,67,89,46,56,6,89};
	 int key = 46;

	    int index = linearSerch(numbers,key);
	    if(index == -1){
		System.out.println("Not Found");
	    }
	     else{
		 System.out.println("key is at index:"+ index);
		}
     }
}