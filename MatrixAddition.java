class MatrixAddition{
	
	public void accept(int[][]m){
	 for(int i=0;i<3;i++){
	   for(int j=0;j<3;j++){
		m[i][j] = sc.nextInt();
			}    
		}
	}

       public void print(int [][]a){
	System.out.println("\n Element in 3x3 matrix:\n");
	 for(int i=0;i<3;i++){
	   for(int j=0;j<3;j++){
		System.out.printf("%5d,a[i][j]");
			}
		}
		System.out.println();
	}



      public void add(int[][]a,int[][]b){
	int[][]c=new int[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			c[i][j]=a[i][j]+b[i][j];

			}
		}
		print(c);
	}
	public static void main(String[]args){
	MatrixAddition m1 = new MatrixAddition();
	int[][]a=new int[3][3];
	int[][]b=new int[3][3];
	m1.accept(a);
	m1.accept(b);

	m1.print(a);
	m1.print(b);
	
	m1.add(a,b);
	
	}
}