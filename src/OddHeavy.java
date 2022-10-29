public class OddHeavy {
    public static void main(String[] args){
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1,1,1,1,1,1}));
        System.out.println(isOddHeavy(new int[]{2,4,6,8,11}));
        System.out.println(isOddHeavy(new int[]{-2,-4,-6,-8,-11}));
    }
    static int isOddHeavy(int[] a){
        int countOfOddNumbers = 0;
        for (int i=0; i<a.length; i++){
            if(a[i]%2 != 0){
                countOfOddNumbers++;
                for (int j=0; j<a.length; j++){
                    if(a[j]%2 ==0 && a[j]>a[i]) return 0;
                }
            }
        }
        if(countOfOddNumbers==0) return 0;
        return 1;
    }
}
