public class ConvertToBase10 {
    public static void main(String[] args){
        System.out.println(convertToBase10(new int[]{1,0,1,1},2));
        System.out.println(convertToBase10(new int[]{1,1,2},3));
        System.out.println(convertToBase10(new int[]{3,2,5},8));
        System.out.println(convertToBase10(new int[]{3,7,1},6));
    }
    static int convertToBase10(int[] a, int base){
            int result = 0;
            int counter = a.length - 1;

            for(int i=0; i<a.length; i++){
                if(a[i]>base) return 0;
                int pw = (int) Math.pow(base,counter);
                result = result + a[i]*pw;
                counter--;
            }
            return result;
    }
}
