package basicProblems;

import java.util.Scanner;

public class addNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer1: ");
        int num1 = input.nextInt();
        System.out.print("Enter integer2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
        System.out.print("Enter Double1: ");
        double no1 = input.nextDouble();
        System.out.print("Enter Double2: ");
        double no2 = input.nextDouble();
        double sum1 = no1 + no2;
        System.out.println("The double sum is " + sum1);
    }
}
