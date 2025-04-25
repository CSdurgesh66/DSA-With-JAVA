package binarySearch;

public class findMinimumInRotatedArray {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int st = 0 , end = nums.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]>nums[n-1]){
                st = mid + 1;
            }else {
                end = mid -1;
                ans = mid;
            }
        }
        return nums[ans];

    }
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,10,1,2,3,4};
        System.out.println(findMin(nums));
    }
}
