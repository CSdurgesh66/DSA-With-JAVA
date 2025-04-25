package binarySearch;



public class rotatedArray {

    //problem-> 153. Find Minimum in Rotated Sorted Array(unique element)
    public static int search(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;

            // identify which part is sorted
            // left part sorted
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid]){
                    high = mid-1;
                }else low = mid+1;
            }
            // right part sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }else high = mid-1;
            }
        }
        return -1;
    }

//    problem -> 81. Search in Rotated Sorted Array II
    public static boolean searchII(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return true;

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }

            // identify which part is sorted
            // left part sorted
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid]){
                    high = mid-1;
                }else low = mid+1;
            }
            // right part sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }else high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 1;
        int ans = search(nums,target);
        System.out.println(ans);
        int[] arr = {2,5,6,0,0,1,2};
        int t = 1;
        boolean res = searchII(arr,t);
        System.out.println(res);

    }
}
