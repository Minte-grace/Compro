
public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(henry(1,3));
    }
    static int henry(int i,int j){
        int largestBound = i>=j ?  i:j;
        int count = 0;
        int maximumInteger = Integer.MAX_VALUE;
        int[] perfectNumbers = new int[largestBound];

        for(int x=1; x<maximumInteger; x++){
            int sum = 0;
            for(int y=1; y<x; y++){
                if(x%y == 0){
                   sum=sum+y;
                }
            }
            if(sum==x){
                perfectNumbers[count] = x;
                count++;
            }
            if(count==largestBound){
                break;
            }
        }
        return perfectNumbers[i-1]+perfectNumbers[j-1];
    }
}
