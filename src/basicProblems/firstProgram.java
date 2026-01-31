package basicProblems;

import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String str = input.nextLine();
        System.out.println("your input:" + str);
        System.out.print("Enter roll number: ");
        long reg_no = input.nextLong();
        System.out.println("your roll num:" + reg_no);
    }
}
