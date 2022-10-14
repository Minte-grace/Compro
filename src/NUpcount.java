public class NUpcount {

    public static void main(String[] args){
        int[] testArray1 = {2,3,1,-6,8,-3,-1,2};
        int[] testArray2 = {6,3,1};
        int[] testArray3 = {1,2,-1,5,3,2,-3};
        System.out.println(nUpCount(testArray1,5));
        System.out.println(nUpCount(testArray2,6));
        System.out.println(nUpCount(testArray3,20));
    }
   public static int nUpCount(int[] a, int n){
        int count = 0;
        int previousPartialSum = 0;
        int partialSum = 0;
        for(int i = 0; i < a.length; i++){
           previousPartialSum = partialSum;
           partialSum += a[i];
           if(partialSum >= n && previousPartialSum < n){
               count++;
           }
        }
        return count;
   }

}
