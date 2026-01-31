package javaPatternProblems;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
        1 2 3 4 5
        2 3 4 5
        3 4 5
        4 5
        5
         */
        System.out.println("other way");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
    }
}
