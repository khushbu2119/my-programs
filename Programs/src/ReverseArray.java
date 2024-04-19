public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {3,6,8,5,2,1,5,8};
        int[] reverse = reverseArray(array);
        for(int value : reverse){
            System.out.println(value);
        }
    }

    public static int[] reverseArray(int[] a) {
        int low = 0;
        int high = a.length-1;
        while(low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high]  = temp;
            low++;
            high--;
        }
        return a;
    }
}
