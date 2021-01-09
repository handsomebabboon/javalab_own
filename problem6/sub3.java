/*Replace a substring in the given string.*/

package problem6;

import java.util.Scanner;

public class sub3 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the original string to make replaements in ");
		String orig = scan.nextLine();
		System.out.println("Enter the string to be replaced ");
		String temp = scan.nextLine();
		System.out.println("Enter the new string ");
		String nu = scan.nextLine();
		
		String replaced_str = orig.replace(temp, nu);
        System.out.println("The new string is: " + replaced_str);
        scan.close();  
    
 
    }
}