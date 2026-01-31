package basicProblems;

import java.util.Scanner;

public class swapTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("a after swapping number: "+" "+ a);
        System.out.println("b after swapping number: "+" "+ b);
    }
}
