//read a string and count all instances of a given word
package problem6;
import java.util.Scanner;


public class sub2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to search through");
        String str1 = sc.nextLine();
        System.out.println("Enter the stirng youwould like to search for in  first string");
        String str2 = sc.nextLine();
        sc.close();
        str1 = str1.replaceAll("\\W"," "); //regular expression matches all special characters(!@#$%^&*,etc) and replaces them with white spaces
        String arr[] = str1.split(" ");
        int count = 0;
        for(String a:arr){
            if(a.equals(str2)){
                count++;
            }
        }
        System.out.println("Number of instances of the word "+str2+" is "+count);

    }
}
