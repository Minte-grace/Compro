//public class NextPerfectSquare{
//    public static void main(String[] args){
//
//    }
//    int nextPerfectSquare(int n){
//        int nextPS = 0;
//        if(n > 0){
//            int a = (int)
//        }
//        return nextPS;
//    }
//}
//
//
//public class NextPerfectSquare {
//    int isPerfectSquare(int n){
//        int st = 0;
//        for(int i = n; i>n; i++){
//            int sqrtValue = (int) Math.sqrt(i);
//            if(sqrtValue%2 == 0){
//                st = sqrtValue;
//                break;
//            }else {
//                continue;
//            }
//        }
//        return st;
////        int nextPerfectSquare = 0;
////
////        if (n >= 0) {
////            double sqrtResult = Math.sqrt(n);
////            int baseNumber = (int) sqrtResult;
////            int nextNumber = baseNumber + 1;
////            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
////        }
////
////        return nextPerfectSquare;
//    }
//    public static void main(String[] args){
//        NextPerfectSquare nps = new NextPerfectSquare();
//        System.out.println(nps.isPerfectSquare(16));
//    }
//}


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
