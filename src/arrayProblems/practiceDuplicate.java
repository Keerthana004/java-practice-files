package arrayProblems;

import java.util.Arrays;

public class practiceDuplicate {
    public static void main(String[] args) {
        int [] a = {1, 3, 4, 3, 5, 6, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Arrays after removing dups: ");
//        remove(a);
//        System.out.println(Arrays.toString(a));
        int newSize = remove(a);
//        for (int i = 0; i < newSize ; i++) {
//            System.out.print(a[i]+ " ");
//        }
        int [] result = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            result[i] = a[i];
        }
        System.out.println(Arrays.toString(result));

    }
    static int remove(int [] arr){
        int pos=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[pos]=arr[i];
                pos++;
            }
        }
        System.out.println("position of where the dups start: "+ pos);
        return pos;
    }
}
