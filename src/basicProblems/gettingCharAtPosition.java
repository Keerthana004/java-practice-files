package basicProblems;

import java.util.Scanner;

public class gettingCharAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.print("which position ? ");
        int position = sc.nextInt();
        System.out.println("The character at position"+" "+position+" "+"is"+" "+ word.charAt(position));
    }
}
