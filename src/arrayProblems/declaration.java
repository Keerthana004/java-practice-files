package arrayProblems;

public class declaration {
    public static void  main(String args[]) {
        int [] a = new int [5];
        a[0] = 1;
        a[1] = 2;
        int [] b = {1,2,3};
        System.out.println(a[1]);
        System.out.println(b[2]);
        for(int val:b){
            System.out.println(val);
        }
    }
}
