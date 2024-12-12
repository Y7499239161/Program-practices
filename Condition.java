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
	case 1: System.out.println("namste");
                  break;
        case 1: System.out.println("kaise ho aap");
                  break;
       }
       default:System.out.println("Invalid button")
     }
  }










