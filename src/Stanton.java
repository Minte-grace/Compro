public class Stanton {
    public static void main(String[] args){
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3,1,1,4}));
        System.out.println(stantonMeasure(new int[]{1,3,1,1,3,3,2,3,3,3,4}));
        System.out.println(stantonMeasure(new int[]{}));
        System.out.println(stantonMeasure(new int[]{1,4,3,2,1,2,3,2}));
    }
    static int stantonMeasure(int[] a){
       int stantonNumber=0;
       int countSecond = 0;
       for(int i=0; i<a.length; i++){
           if(a[i]==1){
               stantonNumber++;
           }
       }
       for(int j=0; j<a.length; j++) {
           if (a[j] == stantonNumber) {
               countSecond++;
           }
       }
       return countSecond;
    }
}
