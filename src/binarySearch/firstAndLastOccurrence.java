package binarySearch;

//problem -> 34. Find First and Last Position of Element in Sorted Array
public class firstAndLastOccurrence {
    public static int findOccurrence(int[] arr,int target,boolean isFirst){
        int st = 0, end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target==arr[mid]){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else if(arr[mid]>target){
                end = mid-1;
            }
            else st = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,7,7,7,7,10,12,13};
        int target = 7;
        int[] ans = new int[2];
        int first = findOccurrence(nums,target,true);
        int second = findOccurrence(nums,target,false);
        ans[0] = first;
        ans[1] = second;
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
