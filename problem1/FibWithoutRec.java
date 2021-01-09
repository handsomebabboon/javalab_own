package problem1;

import java.util.Scanner;

public class FibWithoutRec {

    public static void main(String[] args) {
        System.out.println("Enter how many terms");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "\t");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}