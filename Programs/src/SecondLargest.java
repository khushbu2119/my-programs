public class SecondLargest {

    public static void main(String[] args) {
        int array[] = {3,6,8,5,4,7,9,2,1,5,4,7,8,9,6,3,2,5};
        System.out.println(findSecondLargest(array, array.length));
    }

    public static int findSecondLargest(int a[], int length) {
        int slargest = Integer.MIN_VALUE;
        int largest = a[0];
        for(int i = 0 ; i < length-1; i++) {
            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }
}
