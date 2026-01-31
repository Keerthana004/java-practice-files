package basicProblems;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double fact = 1;
        for(int i = n ; i > 1; i--){
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
    }
}
