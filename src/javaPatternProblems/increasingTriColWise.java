package javaPatternProblems;

import java.util.Scanner;

public class increasingTriColWise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            int nums = i;
            for (int j = 1; j <= i ; j++) {
                System.out.print(nums+" ");
                nums = nums+n-j;
            }
            System.out.println();
        }
    }
}
/*
output:
Enter the number:
5
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */