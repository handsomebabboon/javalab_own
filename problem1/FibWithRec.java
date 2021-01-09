 //Java program to calculate and print Fibonacci number using recursion

package problem1;
import java.util.Scanner;
 
public class FibWithRec {


    public static int fibonacci(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); 
    }
    public static void main(String args[]) {
    
       //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number of series terms you want: ");
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci series upto " + number +" numbers : ");
        
        //printing Fibonacci series upto number
        for(int i=0; i<=number; i++){
            System.out.print(fibonacci(i) +"\t");
        }
  
    
    } 
  
  
}