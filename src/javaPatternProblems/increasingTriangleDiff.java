package javaPatternProblems;

import java.util.Scanner;

public class increasingTriangleDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for (int i = 1; i <= n ; i++) {
//            for (int j = i; j >= 1 ; j--) {   (other method)
//                System.out.print(j+"  ");
//            }
            for (int j = 1; j <= i ; j++) {
                System.out.print((i-j)+1+"  ");
            }
            System.out.println();
        }
    }
}
/*
Enter the number:
5
1
2  1
3  2  1
4  3  2  1
5  4  3  2  1
*/