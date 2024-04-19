public class SecondSmallest {

    public static void main(String[] args) {
        int array[] = {6,8,9,1,3,4,5,9,7,6,5,2,1,9};
        System.out.println(findSecondSmallest(array, array.length));
    }

    //Best approach
    public static int findSecondSmallest(int a[], int length) {
        int ssmallest = Integer.MAX_VALUE;
        int smallest = a[0];
        for(int i =1; i<length-1; i++){
            if(smallest > a[i]){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(smallest < a[i] && ssmallest > a[i]){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    //
}
