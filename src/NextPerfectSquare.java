public class NextPerfectSquare{
    public static void main(String[] args){
        System.out.println(calculateNextPerfectSquare(6));
        System.out.println(calculateNextPerfectSquare(36));
        System.out.println(calculateNextPerfectSquare(0));
        System.out.println(calculateNextPerfectSquare(-5));
    }
    public static int  calculateNextPerfectSquare(int n){
//        int nextPerfectSquare = 0;
//        if(n>=0){
//            int x = (int) Math.sqrt(n) + 1;
//            int y = (int) Math.pow(x,2);
//            nextPerfectSquare = y;
//        }
//        return  nextPerfectSquare;

        int maxInteger = Integer.MAX_VALUE;
        n++;
        if(n<0) return 0;
        while(n<maxInteger){
            double sqrtOfNumber = Math.sqrt(n);
            int intSqrtOfNumber = (int) sqrtOfNumber;
            if(sqrtOfNumber - intSqrtOfNumber == 0){
                return n;
            }
            n++;
        }
        return 0;

    }
}







