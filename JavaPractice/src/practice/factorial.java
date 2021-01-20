package practice;

import java.util.Scanner;

public class factorial {

    static int i, n, sum = 1;

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else {
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number - ");
        n = sc.nextInt();

        for(i=n; i>=1; i--) {
            sum = sum*i;
        }
        System.out.println("factorial of "+ n + " is "+ sum);
        System.out.println("factorial of "+ n +" is " + factorial(n) + " using recursion");
    }
}
