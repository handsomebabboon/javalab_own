//Extract a portion of the string and print it. Variable m indicates the amount of characters to be extracted from the string starting from the nth position.
package problem6;
import java.util.Scanner;

public class sub1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to extract from");
        String str1 = sc.nextLine();
        System.out.println("enter number of characters in substring");
        int m = sc.nextInt();
        System.out.println("Enter startin gindex of string");
        int n = sc.nextInt();
        sc.close();
        String str2 = str1.substring(n,n+m);
        System.out.println("The required string is:");
        System.out.println(str2);

    }
}