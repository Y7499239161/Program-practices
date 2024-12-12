import java.util.Scanner;
 
class MatrixTranspose{
	public void transposeMatrix(int [][] m){
		System.out.println("Enter the given elements of 3x3 matrix");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				m[i][j] = sc.nextInt();
			}
		}
	}
	public void transposeMatrix(int [][]m){
		System.out.println("\nTranspose of matrix \n");
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				System.out.print(m[j][i]+" "); 
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		MatrixTranspose m1 = new MatrixTranspose();
		int [][] m = new int[3][3];
		m1.acceptMatrix(m);
		m1.printMatrix(m);
		m1.transposeMatrix(m);
	}
}