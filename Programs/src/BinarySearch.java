import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(BinarySearch.searchElement(array, 14));
    }

    public static boolean searchElement(int[] a, int key) {
        boolean status = false;
        int low = 0, mid, high = a.length-1;
        while(low<=high) {
            mid = ( low + high ) / 2;
            if(a[mid]==key) {
                status = true;
                break;
            }
            if (a[mid] > key) {
                high = mid - 1;
            }
            if (a[mid] < key) {
                low = mid + 1;
            }
        }
        return status;
    }
}

// Time complexity (n = 16)
// Sort - O(n * log n) - O(16 * log 16) - O(16 * 4) - O(64)
// Linear search - O(n) - O(16)
// Binary search - O(log n) - O(log 16) - O(4)