package practice;

import java.util.Scanner;

/** arm strong number 153, 370, 371 etc
 * 153 = (1*1*1) + (5*5*5) = (3*3*3)
 *
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n, sum = 0, r, d;

        System.out.print("enter a number - ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = n;

        while(n>0) {
            r = n%10;
            n = n/10;
            sum = sum + (r*r*r);
        }

        if (sum == d) {
            System.out.println("its an armstrong number");
        }else {
            System.out.println("Sum : "+ sum);
            System.out.println("its not a armstrong number");
        }

    }
}
