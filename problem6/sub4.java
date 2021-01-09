//rearrange in alphabetical order
package problem6;
import java.util.Scanner;
import java.util.Arrays;
public class sub4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to sort:");
        String str1 = sc.nextLine();
        char arr[] = str1.toCharArray();
        Arrays.sort(arr);
        String str2 =new String(arr);
        System.out.println("The sorted string is:"+str2);
        sc.close();
    }
}
