public class SequenceArray {
    public static void main(String[] args){
        int[] testArray1 ={1,2,3,4,5};
        int[] testArray2 ={1,2,3,2,5};
        int[] testArray3 ={-5,-5,-4,-4,-4,-3,-3,-2,-2,-2};
        int[] testArray4 ={0,1,2,3,4,5};
        int[] testArray5 ={1,2,3,4};
        int[] testArray6 ={1,2,5};
        int[] testArray7 ={5,4,3,2,1};

        System.out.println(isSequencedArray(testArray1,1,5));
        System.out.println(isSequencedArray(testArray2,1,5));
        System.out.println(isSequencedArray(testArray3,-5,-2));
        System.out.println(isSequencedArray(testArray4,1,5));
        System.out.println(isSequencedArray(testArray5,1,5));
        System.out.println(isSequencedArray(testArray6,1,5));
        System.out.println(isSequencedArray(testArray7,1,5));
    }
    static int isSequencedArray(int[] a, int m,int n){
        if(a[0]!=m || a[a.length-1]!=n) return 0;

            for(int i=0; i<a.length-1; i++){
                if(a[i+1] != a[i] && a[i+1] != a[i]+1) return 0;
            }
      return 1;
    }
}
