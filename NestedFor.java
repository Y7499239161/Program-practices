
class NestedFor{
	 public void  pattern1(){
		 for(int i=1;i<=5;i++){
		     for(int j=1;j<=5;j++){
			System.out.print(j);
		}
		         

		 System.out.println();
	   }
	}
	 public void  pattern2(){
		 for(int i=1;i<=5;i++){
		    for(int j=1;j<=i;j++){
		 System.out.print(j);
	
		}
		 System.out.println();
	   }
	}
	 public static void main(String[]args){
	 NestedFor d1=new NestedFor();
	
	 d1.pattern1();
	 d1.pattern2();

    }
 }
