public class SumOfEvenOdd {
    public static void main(String[] args){
        int[] testArray = {1,1};
        System.out.println(f(testArray));
    }
    static int f(int[] a){
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < a.length; i++ ){
            if(a[i] % 2 == 0){
                sumOfEven = sumOfEven + a[i];
            } else {
                sumOfOdd = sumOfOdd + a[i];
            }
        }
        return sumOfOdd - sumOfEven;
    }

}
