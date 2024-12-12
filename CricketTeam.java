import java.util.Scanner;
class CricketTeam{
	public static void main(String []args){
	String CricketTeam;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Favorite Team name");
	CricketTeam=sc.next();
	switch(CricketTeam){
	     case "MI":System.out.println("Rohit sharma,Hardik pandya,Suryakumar yadav are Team Player");
			break;
	     case "Csk":System.out.println("‎MS Dhoni  ,Ruturaj Gaikwad ,Ravindra Jadeja,are Team Player ");
			break;
	     case "KKR":System.out.println("  Shreyas iyer ,Rinku Singh , Ramandeep singh are Team Player");
			break;

		default:System.out.println("I am not knowing about this Team");
		break;

	}
   }
 }
