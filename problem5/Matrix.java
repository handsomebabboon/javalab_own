package problem5;


import java.util.Scanner;
class Matrix { 
  
    // Function to print Matrix 
    static void printMatrix(int M[][], int rowSize, int colSize) { 
        for (int i = 0; i < rowSize; i++) { 
            for (int j = 0; j < colSize; j++) 
                System.out.print(M[i][j] + "\t"); 
  
            System.out.println(); 
        } 
    } 
  
    // Function to multiply 
    // two matrices A[][] and B[][] 
    static void multiplyMatrix( int row1, int col1, int A[][], int row2, int col2, int B[][]) 
    { 
       
  
        // Print the matrices A and B 
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1); 
        System.out.println("\nMatrix B:"); 
        printMatrix(B, row2, col2); 
  
        // Check if multiplication is Possible 
        if (row2 != col1) { 
  
            System.out.println( 
                "\nMultiplication Not Possible"); 
            return; 
        } 
  
        // Matrix to store the result 
        // The product matrix will 
        // be of size row1 x col2 
        int C[][] = new int[row1][col2]; 
  
        // Multiply the two marices 
        for (int i = 0; i < row1; i++) { 
            for (int j = 0; j < col2; j++) { 
                for (int k = 0; k < row2; k++) 
                    C[i][j] += A[i][k] * B[k][j]; 
            } 
        } 
  
        // Print the result 
        System.out.println("\nResultant Matrix:"); 
        printMatrix(C, row1, col2); 
    } 

  
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int row1, col1, row2, col2; 
        System.out.println("Enter the number to rows in matrix1");
        row1 = sc.nextInt();
        System.out.println("Enter the number to columns in matrix1");
        col1 = sc.nextInt();
        System.out.println("Enter the number to rows in matrix2");
        row2 = sc.nextInt();
        System.out.println("Enter the number to columns in matrix2");
        col2 = sc.nextInt();

        

        int A[][] = new int[row1][col1];
        int B[][] = new int[row2][col2];
        System.out.println("Enter the elements for array 1");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("Enter the data for element"+"["+i+"]"+"["+j+"]");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements for array 2");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.println("Enter the data for element"+"["+i+"]"+"["+j+"]");
                B[i][j]=sc.nextInt();
            }
        }
        sc.close();
      
  
        multiplyMatrix(row1, col1, A,row2, col2, B); 
    } 
}