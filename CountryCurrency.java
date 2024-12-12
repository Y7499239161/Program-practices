//accept the contry name  & currency also print



 import java.util.Scanner;

 class CountryCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	String country;
        System.out.print("Enter the country name: ");
	country=sc.next();
        
        
        switch (country) {
            case "india":
                System.out.println("The currency is Indian Rupee.");
                break;
            case "usa":
            case "united states":
                System.out.println("The currency is US Dollar.");
                break;
            case "japan":
                System.out.println("The currency is Japanese Yen.");
                break;
            case "uk":
            case "united kingdom":
                System.out.println("The currency is British Pound.");
                break;
            case "canada":
                System.out.println("The currency is Canadian Dollar.");
                break;
            default:
                System.out.println("Country not recognized. Please enter a valid country name.");
			break;
        }  
       
    }
}
