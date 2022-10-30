import java.util.Arrays;

public class ClusterCompression {
    public static void main(String[] args){
        System.out.println(Arrays.toString(clusterCompression(new int[]{3,3,3,4,4,3,2,2,2,2,4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{3,1,3,4,4,3,2,2,2,2,4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{3,3,3,4,4,3,2,7,2,2,4})));
    }
    static int[] clusterCompression(int[] a){
        int clusterCounter = 1;
        int[] tempArray = new int[a.length];
        for(int i=1; i<a.length; i++){
            if(a[i] != a[i-1]){
                tempArray[0] = a[0];
                tempArray[clusterCounter] = a[i];
                clusterCounter++;
            }
        }
        int[] compressedArray = new int[clusterCounter];
        for(int i=0; i<compressedArray.length; i++){
            compressedArray[i] = tempArray[i];
        }
        return compressedArray;
    }
}
