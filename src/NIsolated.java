public class NIsolated {
    public static void main(String[] args){
            System.out.println(isIsolated(163));
            System.out.println(isIsolated(162));
            System.out.println(isIsolated(69));
            System.out.println(isIsolated(2));
            System.out.println(isIsolated(3));
            System.out.println(isIsolated(8));
            System.out.println(isIsolated(9));
            System.out.println(isIsolated(14));
            System.out.println(isIsolated(24));
            System.out.println(isIsolated(28));
            System.out.println(isIsolated(34));
            System.out.println(isIsolated(58));
            System.out.println(isIsolated(63));
            System.out.println(isIsolated(45));
    }
    static int isIsolated(long n){
        long maxInt = Long.MAX_VALUE;
        if(n<1 || n>maxInt) return -1;
        long squaredValue = n*n;
        long cubedValue = n*n*n;
        while(squaredValue>0){
            long outerCurrentNumber = squaredValue % 10;
            while (cubedValue>0){
                long interCurrentNumber = cubedValue % 10;
                if(interCurrentNumber == outerCurrentNumber) return 0;
                cubedValue = cubedValue/10;
            }
            squaredValue = squaredValue/10;
        }
        return 1;
    }
}
