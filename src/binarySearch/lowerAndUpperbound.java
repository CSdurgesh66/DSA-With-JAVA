package binarySearch;

public class lowerAndUpperbound {
    private static int lowerBound(int[] arr, int target) {
        int st = 0;
        int end = arr.length-1;
        int lower = arr.length;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid]>=target) {
                lower = mid;
                end = mid-1;
            }
            else st = mid+1;
        }
        return lower;
    }
    private static int upperBound(int[] arr, int target) {
        int st = 0;
        int end = arr.length-1;
        int upper = arr.length;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid]>target) {
                upper = mid;
                end = mid-1;
            }
            else st = mid+1;
        }
        return upper;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int target = 11;
        int lowerBound = lowerBound(arr,target);
        System.out.println("index is :"+lowerBound);
        int upperBound = upperBound(arr,target);
        System.out.println("index is :"+upperBound);
    }
}
