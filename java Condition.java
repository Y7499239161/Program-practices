// age check   // if-else condition using
import java.util.Scanner;

 class Condition{
    public static void main(String []args){
	Scanner sc=new Scanner(System.in);
         int age=sc.nextInt();
	 if(age > 18){
	  System.out.println("Adult");
	}
	else{
          System.out.println("Not Adult");
    }
 }
}
 

//check the even or odd

import java.util.Scanner;

 class Condition{
    public static void main(String []args){
	Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
	 if(x%2 ==0){
	  System.out.println("Even");
	}
	else{
          System.out.println("Odd");
    }
 }
}


//user as three condtion a==equal,a>b,a<b
import java.util.Scanner;

 class Condition{
    public static void main(String []args){
	Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
	 int b-sc.nextInt();

	 if(a == b){
	    System.out.println("equal");
           }
	   else if(a > b){
		System.out.println("a is greater than");
		}
	    }
	    else{
		System.out.println("b is less than"); 
		}
	 }
     }


 //Switch case 

import java.util.Scanner;
class Switchcase{
    public static void main(string[]args){
	Scanner sc=new Scanner(System.in);
         int button=sc.nextInt();

       Switch(button){
	 case 1: System.out.println("Hello");
                  break;
	case 2: System.out.println("namste");
                  break;
        case 3: System.out.println("kaise ho aap");
                  break;
       }
       default:System.out.println("Invalid button")
     }
  }



//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.Scanner;
 Class MonthPrint{
	public static void main(String[]args){
	   Scanner sc=new Scanner(System.in)
           
	   System.out.println("enter the number of the month ");
		 int MonthPrint=sc.nextInt();
 	Switch(MonthPrint){
	 	case 1:System.out.println("january");
		  break;
		 case 2:System.out.println("Feburuary");
		  break;
	          case 3:System.out.println("March");
		  break;
		  case 4:System.out.println("April");
		  break;
		  case 5:System.out.println("May");
		  break;
	          case 6:System.out.println("june");
		  break;
		  case 7:System.out.println("july");
		  break;
	          case 8:System.out.println("august");
		  break;
		  case 9:System.out.println("september");
		  break;
		  case 10:System.out.println("octomber");
		  break;
		  case 11:System.out.println("November");
		  break;
		  case 12:System.out.println("December");
		  break;

		}
		 System.out.println("Invalid month number. Please enter a number between 1 and 12.")
 	}
   }



// loops in java
for loop
//print the number from 1 to 10
 class Number{
	public static void main(String []args){
	  for(int i=0;i<10;i++){
	   System.out.println("i")
		}
	 }
     }


While loop
//print the number from 1 to 10
 class Number{
	public static void main(String []args){
	 int i=0;
	while(i<11){
	 System.out.println(i)
		i++;
	}
       }
     }



//Do while loop
 class Number{
	public static void main(String []args){
	 int i=0;
	 do{
              i=i+1;
           }while(i<11);
	     
	 }
     }


//print the sum of first  N natural Numbers
import java.util.Scanner;
class NaturalNumber{
	public static void main(String[]args){
	          Scanner s=new Scanner(System.in);
      		   int n=sc.nextInt();
		  int sum=0;
		for(int i=0; i<=n;i++){
		  sum =sum+i;
		}
 	  }
	}

//print the table of a number input by the user
import java.util.Scanner;
class Number{
 public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
		for(int i=1; i<11;i++){
		System.out.println(i*n);
		}
	  }
	}
     
 //println all even number till n
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
      System.out.println("All even numbers up to " + n + ":");
       
    }
}
   



 **//Array

 import java.util.Scanner;
class TotalMarks{
	public static void main(String[]args){
           int marks[]=new int[3];
	   int marks[0]=98;
	   int marks[1]=67;
	   int marks[2]=55;
	   for(int i=0;i<3;i++){
		System.out.println(mark[i]);
                     }
	       }
	}


 








