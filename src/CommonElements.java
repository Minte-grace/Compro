import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {};
        System.out.println(Arrays.toString(f(a,null)));
    }
    static int[] f(int[] first, int[] second){
        if(first == null || second == null){
            return null;
        }
        int count = 0;
        int[] common = new int[first.length];
        for(int i=0; i< first.length; i++){
            boolean com = false;
            for(int j=0; j< second.length; j++){
                if(first[i]==second[j]){
                    com = true;
                    continue;
                }
            }
            if(com){
                common[count] = first[i];
                count++;
            }
        }
        int[] commonValues = new int[count];
        for(int x=0; x<commonValues.length; x++){
            commonValues[x] = common[x];
        }
        return commonValues;
    }
}
