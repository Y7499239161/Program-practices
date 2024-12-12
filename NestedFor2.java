 // 5 4 3 2 1
 // 5 4 3 2
 // 5 4 3 
 // 5 4
 // 5

class NestedFor2{
	  public void pattern2(){
	for(int i=1;i<=5;i++){
		for(int j=5;j>=i;j--){
		  System.out.print(j);
	}
	 System.out.println();
	}
     }
	public static void main(String[]args){
		NestedFor2 s=new NestedFor2();
		s.pattern2();
	}

 }