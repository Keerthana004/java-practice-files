//leetcode problem mo: 9
//https://leetcode.com/problems/palindrome-number/description/

package lcPractice;

import java.util.Scanner;

public class palindromNumber {
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int cur = number;
        int rev = 0;
        while(cur!=0){
            int digit=cur%10;
            rev=rev*10+digit;
            cur=cur/10;
        }
        System.out.println("The reversed number is "+rev);
        if(rev==number){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
