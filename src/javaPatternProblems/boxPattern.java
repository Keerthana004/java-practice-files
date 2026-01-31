package javaPatternProblems;

import java.util.Scanner;

public class boxPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==1 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    //true ah irundha andha edathla * print pannum
                    //else la varrapo andha edam false , so adhula and empty space fill pannum
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
 * * * * *
 *       *
 *       *
 *       *
 * * * * *
 */
