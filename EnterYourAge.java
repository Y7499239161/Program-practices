import java.util.Scanner;
   class  EnterYourAge{

      public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter your age: ");
            int age = sc.nextInt();
           System.out.println("You are " + age + " years old.");
   } 
}