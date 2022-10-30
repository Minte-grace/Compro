public class SumSafe {
    public static void main(String[] args){
        System.out.println(isSumSafe(new int[]{5,-5,0}));
        System.out.println(isSumSafe(new int[]{5,-2,1}));
    }
    static int isSumSafe(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        for(int i=0; i<a.length; i++){
            if(sum == a[i]) return 0;
        }
        return 1;
    }
}
