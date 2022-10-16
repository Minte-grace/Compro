public class IsDivisible {
    public static void main(String[] args){
        int[] testArray = {3,4,3,6,36};
        System.out.println(isDivisible(testArray,3));
    }
    static int isDivisible(int[] a, int divisor){
        int flag = 1;
        for(int i=0; i<a.length; i++){
            if(a[i]%divisor != 0){
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
