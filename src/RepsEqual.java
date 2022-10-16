public class RepsEqual {
    public static void main(String[] args){
        int[] testArray = {3,2,0,5,3};
        System.out.println(repsEqual(testArray,32053));
    }
   static int repsEqual(int[] a, int n ) {
        int flag = 0;
        for(int i=a.length -1 ; i>=0; i--){
            int lastDigit = n%10;
            n = n/10;
            if(lastDigit == a[i]){
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        return flag;
   }
}
