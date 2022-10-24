public class SquarePair {
    public static void main(String[] args){
            System.out.println(countSquarePairs(new int[]{9,0,2,-5,7}));
        System.out.println(countSquarePairs(new int[]{9}));
    }
    static int isPerfectSquare(int n){
        double sqrtOfaNumber = Math.sqrt(n);
        int intSqrtOfaNumber = (int) sqrtOfaNumber;
        return sqrtOfaNumber - intSqrtOfaNumber == 0 ? 1:0;
    }
    static int countSquarePairs(int[] a){
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j= 0; j<a.length; j++){
                if(a.length>=2 && a[i] != a[j] && a[i]>0 && a[j]>0 && a[j] > a[i]){
                    int sumOftWoNumbers = a[i]+a[j];
                    if(isPerfectSquare(sumOftWoNumbers)==1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
