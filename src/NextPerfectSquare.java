public class NextPerfectSquare{
    public static void main(String[] args){
        System.out.println(calculateNextPerfectSquare(6));
        System.out.println(calculateNextPerfectSquare(36));
        System.out.println(calculateNextPerfectSquare(0));
        System.out.println(calculateNextPerfectSquare(-5));
    }
    static int calculateNextPerfectSquare(int n){
        int nextPS = 0;
        if(n < 0) {
            return nextPS;
        } else {
            int sqrtOfNumber = (int) Math.sqrt(n) + 1;
            nextPS = (int) Math.pow(sqrtOfNumber,2);
            return nextPS;
        }

    }
}
