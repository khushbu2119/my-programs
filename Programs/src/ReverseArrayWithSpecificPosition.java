import java.util.Arrays;

public class ReverseArrayWithSpecificPosition {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int position = 3;
        reverseArray(a, 0, position-1);
        reverseArray(a, position, a.length-1);
        reverseArray(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void reverseArray(int[] a, int low, int high) {
        while(low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }
}
