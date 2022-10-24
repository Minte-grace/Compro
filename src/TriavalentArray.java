import java.util.Arrays;

public class TriavalentArray {
    public static void main(String[] args){
        System.out.println(isTrivalent(new int[]{-1,0,1,0,0,0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647,-1,-1,-2147483648}));
    }
    static int isTrivalent(int[] a){
        int uniqueArrayLength = 0;
        int[] uniqueValues = new int[a.length];
        for(int i=0; i< a.length; i++){
            boolean isUnique = true;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                uniqueValues[uniqueArrayLength] = a[i];
                uniqueArrayLength++;
            }
        }
        int[] distinictArray = new int[uniqueArrayLength];
        for (int i=0; i<uniqueArrayLength; i++){
            distinictArray[i] = uniqueValues[i];
        }
        return uniqueArrayLength ==3?1:0;
    }
}
