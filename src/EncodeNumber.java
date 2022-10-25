import java.util.Arrays;

public class EncodeNumber {

    public static void main(String[] args){
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
    }
    static int[] encodeNumber(int n){
        int origionalNumber = n;
        int count = 0;
        int div = 2;
        while(n>1){
            if(n%div==0){
                n=n/div;
                count++;
                div=2;
            }else {
                div++;
            }

        }
        int[] encoded = new int[count];
        div = 2;
        count=0;
        n=origionalNumber;
        while(n>1){
            if(n%div==0){
                encoded[count] = div;
                n=n/div;
                count++;
                div=2;
            }else {
                div++;
            }

        }
        return encoded;
    }
}
