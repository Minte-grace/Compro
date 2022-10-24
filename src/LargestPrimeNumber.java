public class LargestPrimeNumber {
    public static void main(String[] args){
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
    static int largestPrimeFactor(int n){
        int largestPrimeF = 0;
        int div =2;
        while(div<n){
            if(n%div != 0){
               div++;
            } else {
                n = n/div;
                largestPrimeF = n;
                div=2;
            }
        }
        return largestPrimeF;
    }
}
