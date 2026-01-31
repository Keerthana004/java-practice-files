package basicProblems;

import java.util.Scanner;

public class oddEvenUsingOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        //condition for odd
        if((a|1) == a){
            System.out.println("The a is odd");
        }
        else{
            System.out.println("The a is not odd");
        }
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        //condition for even
        if((b|1) == b+1){
            System.out.println("The b is even");
        }
        else{
            System.out.println("The b is not even");
        }
    }
}
