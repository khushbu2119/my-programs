import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {3,6,5,4,7,9,8,2,1};
        sortArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sortArray(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j< a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
