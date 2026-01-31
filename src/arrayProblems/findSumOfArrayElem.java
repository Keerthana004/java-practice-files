package arrayProblems;

public class findSumOfArrayElem {
    public static void main(String[] args){
        int [] a = {21,22,23,24,25,26};
        int sum = 0;
        /*   for(int elem : a){
            sum = sum + elem;
        }
        */
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
