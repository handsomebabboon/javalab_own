//concatenate 2 strings
package problem6;
import java.util.Scanner;
public class sub6 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        String str3 = str1 + str2;
        System.out.println("The concactenated string is:"+str3);
        sc.close();
    }
}
