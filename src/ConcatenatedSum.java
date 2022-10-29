public class ConcatenatedSum {
    public static void main(String[] args){
            System.out.println(checkConcatenatedSum(198,2));
            System.out.println(checkConcatenatedSum(198,3));
            System.out.println(checkConcatenatedSum(2997,3));
            System.out.println(checkConcatenatedSum(2997,2));
            System.out.println(checkConcatenatedSum(13332,4));
            System.out.println(checkConcatenatedSum(9,1));
    }
    static int checkConcatenatedSum(int n, int catlen){
        int sum = 0;
        int origionalNumber = n;
        while(n>0){
            int currentNumber = n%10;
            int i=0;
            int numberToBeAdded = 0;
            while(i<catlen){
                int lengthDeterminingFatcor = (int) Math.pow(10,i);
                numberToBeAdded = numberToBeAdded + currentNumber * lengthDeterminingFatcor;
                i++;
            }
            sum = sum+numberToBeAdded;
            n=n/10;
        }
        return sum == origionalNumber ? 1 :0;
    }
}
