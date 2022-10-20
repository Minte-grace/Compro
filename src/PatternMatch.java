import java.util.Arrays;

public class PatternMatch {
    public static void main(String[] args){
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{3,-2,3}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{2,1,-1,-1,2,1}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{1,2,-1,-1,1,2}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{2,1,-2,3}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{1,1,1,-1,-1,1,1,1}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{4,-1,3}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{2,-3,3}));
        System.out.println(matches(new int[]{1,2,3,-5,-5,2,3,18},new int[]{8}));

    }
    static int matches(int[] a, int[] p){

        int matches = 1;
        int startIndex = 0;
        int endIndex = 0;

        for(int i=0; i<p.length; i++){
            endIndex = startIndex + Math.abs(p[i]);
            if(p[i]>0){
                for(int j=startIndex; j<endIndex; j++){
                    if(a[j]<0){
                        matches =0;
                        break;
                    }
                }
            } else if(p[i] < 0){
                for(int j=startIndex; j<endIndex; j++){
                    if (a[j] > 0) {
                        matches = 0;
                        break;
                    }
                }
            }
            else {
                matches = 0;
                break;
            }
            startIndex = startIndex + Math.abs(p[i]);
        }
        return matches;
        }
}
