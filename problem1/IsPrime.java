//program to check whether user iputted number is prime or ot
package problem1;
import java.util.Scanner;
public class IsPrime {

    public static void main(String[] args) {
        System.out.println("Enter a number to check whetether prime or not");
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      sc.close();

      if(num == 1){
          System.out.println("Neither prime nor composite");
      }
      else{
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
            flag = true;
            break;
            }
        }
    
        if (!flag){
            System.out.println(num + " is  prime number.");
        }
        else{
            System.out.println(num + " is not prime number.");
        }
        }
    }
  }