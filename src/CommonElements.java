import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args){
        int[] a = {1,3,7,9};
        int[] b = {7,1,9,3};
        System.out.println(Arrays.toString(f(a,b)));
    }
    static int[] f(int[] first, int[] second){
        if(first == null || second == null){
            return null;
        }
        int count = 0;
        int[] common = new int[first.length];
        for(int i=0; i<first.length; i++){
            boolean isCommon = false;
            for(int j=0; j< second.length; j++){
                if(first[i]==second[j]){
                    isCommon = true;
                    continue;
                }
            }
            if(isCommon){
                common[count] = first[i];
                count++;
            }
        }
        int[] filteredCommon = new int[count];
        for(int x=0; x<filteredCommon.length; x++){
            filteredCommon[x]= common[x];
        }
        return filteredCommon;
    }












}
