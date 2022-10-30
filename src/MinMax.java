public class MinMax {
    public static void main(String[] args){
        System.out.println(isMinMaxDisjoint(new int[]{5,4,1,3,2}));
        System.out.println(isMinMaxDisjoint(new int[]{18,-1,3,4,0}));
        System.out.println(isMinMaxDisjoint(new int[]{9,0,5,9}));
        System.out.println(isMinMaxDisjoint(new int[]{0,5,18,0,9}));
        System.out.println(isMinMaxDisjoint(new int[]{7,7,7,7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1,2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }
    static int isMinMaxDisjoint(int[] a){
        if(a.length < 3) return 0;
        int min=a[0];
        int max=a[a.length-1];
        int indexOfMin=0;
        int indexOfMax= a.length-1;
        int countMax = 0;
        int countMin = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max) {
                max = a[i];
                indexOfMax = i;
            }
            if(a[i]<min) {
                min = a[i];
                indexOfMin = i;
            }
        }
        if(Math.abs(indexOfMax - indexOfMin) ==1) return 0;
        for(int i=0; i<a.length; i++){
            if(a[i]== max){
                countMax++;
            }
            if(a[i] == min){
                countMin++;
            }
        }
        if(countMax != 1 || countMin !=1) return 0;
        if(max==min) return 0;
        return 1;
    }
}
