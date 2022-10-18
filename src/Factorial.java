import java.util.Arrays;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Result: "+ Arrays.toString(solve10()));
    }
    static int[] solve10(){
        int factorialOfTen = 1;
        int factorialOfX = 1;
        int factorialOfY = 1;
        int x=0;
        int y=0;
        boolean factorialFound = false;
        int[] result = new int[2];
        for(int i=1; i<=10; i++){
            factorialOfTen = factorialOfTen * i;
        }
        for(x=1; x<10; x++) {
            for (int j = 0; j < y; j++) {
                factorialOfX = factorialOfX * j;

                for (y = 1; y < 10; y++) {
                    for (int n = 1; n < y; n++) {
                        factorialOfY = factorialOfY * n;
                    }

                }
                if (factorialOfX + factorialOfY == factorialOfTen) {
                    factorialFound = true;
                    break;
                }
            }
            if (factorialFound) {
                break;
            }
        }
        if(x==10 || y==10){
            x=0;
            y=0;
        }
        result[0] = x;
        result[1]=y;
       return result;
    }
}
