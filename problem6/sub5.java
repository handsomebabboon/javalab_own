//program to compare 2 user inputted strings and see if equal(ignore case)
package problem6;
import java.util.Scanner;
public class sub5 {
    
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter tha value of the first string");
    String str1=sc.nextLine();
    System.out.println("Enter the second string");
    String str2 =sc.nextLine();
    sc.close();
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if(str1.equals(str2)){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings arent equal");
    }
   }
}
