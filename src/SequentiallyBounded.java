public class SequentiallyBounded {
    public static void main(String[] args){
        System.out.println(isSequentiallyBounded(new int[]{0,1}));
        System.out.println(isSequentiallyBounded(new int[]{-1,2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5,5,5}));
        System.out.println(isSequentiallyBounded(new int[]{2,3,3,99,99,99,99,99}));
        System.out.println(isSequentiallyBounded(new int[]{2,3,3,3,3}));
    }
    static int isSequentiallyBounded(int[] a){
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]) return 0;
            int countOccurenceOfElement = 0;
            for(int j=0; j<=i; j++){
                if(a[i] == a[j]){
                    countOccurenceOfElement++;
                }
            }
            if(countOccurenceOfElement>= a[i]) return 0;
        }
        return 1;
    }
}
