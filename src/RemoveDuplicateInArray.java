import java.util.Arrays;

public class RemoveDuplicateInArray {
    public static void main(String[] args){
      int[] a = {1,2,3,4,5,6,7};
      int[] b = {1,2,1,3,4,2,5};
      int[] c = {12,32,1,3,6,2,12,3,6,2,12,3,1,2};

      System.out.println(Arrays.toString(f(a)));
      System.out.println(Arrays.toString(f(b)));
      System.out.println(Arrays.toString(f(c)));
    }
    static int[] f(int[] a){
        int count = 0;
        int[] output = new int[a.length];
        for(int i=0; i<a.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j<output.length; j++){
                if(output[j]==a[i]){
                    isDuplicate = true;
                    continue;
                }
            }
            if(!isDuplicate){
                output[count] = a[i];
                count++;
            }
        }
        int[] filteredOutPut = new int[count];
        for(int x= 0; x< filteredOutPut.length; x++){
            filteredOutPut[x] = output[x];
        }
        return filteredOutPut;
    }
}
