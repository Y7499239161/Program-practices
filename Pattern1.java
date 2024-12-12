class Pattern1{
	public void pattern(){
	   int no=1;
	    for(int i=0;i<=5;i++){
	      for(int j=1;j<=i;j++){
		System.out.printf(" "+no);
		no++;
	    }
	    System.out.println();
	}
 }
	public void pattern1(){
	 int no=1;
	  //asky value
	    for(int i=65;i<=69;i++){
	      for(int j=65;j<=i;j++){
		System.out.printf("%2c",j);
		
	    }
	    System.out.println();
	}
 }
	public void pattern1(){
	   
	    for(int i=A;i<=E;i++){
	      for(int j=A;j<=i;j++){
		System.out.printf("%2c",j);
		
	    }
	    System.out.println();
	}
 }


	public static void main(String[]args){
	 Pattern1 p1 = new Pattern1();
	
	 p1.pattern();
	 p1.pattern1();
	 p1.pattern2();
	}
     }
