public class Frequently {
    public static void main(String[] args){
        System.out.println(frequentlyOccur(new int[]{3,3,3,7,7,7,7,2,1,1,2,1}));

    }
    public static int frequentlyOccur(int[] a) {
        int mostOccuringElement = 0;
        int previousCount = 1;
        int currentCount = 1;

        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    currentCount++;
                }
            }
            if(currentCount>previousCount){
                previousCount = currentCount;
                mostOccuringElement = a[i];
            }
            currentCount=1;
        }
        return mostOccuringElement;
    }
}
