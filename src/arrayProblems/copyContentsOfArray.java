package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class copyContentsOfArray {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int [] a =new int[n];
        int [] b =new int[a.length];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        System.out.println("Elements in array B: " + Arrays.toString(b));
    }
}
/*
Enter the number of elements in the array:
4
Enter the elements in the array:
1
5
8
4
Elements in array B: [1, 5, 8, 4]

 */