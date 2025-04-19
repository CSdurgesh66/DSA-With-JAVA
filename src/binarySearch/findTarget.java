package binarySearch;

public class findTarget {
    private static int findI(int[] arr , int t){
        int n = arr.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = (end+st)/2;
            if(arr[mid]==t) return mid;
            else if(arr[mid]>t) end = mid-1;
            else st = mid+1;
        }
        return -1;
    }
    private static int findRecursively(int[] arr, int t,int st,int end){
        if(st>end) return -1;
        int mid = (st+end)/2;
        if(arr[mid]==t) return mid;
        else if(arr[mid]>t) return findRecursively(arr,t,st,mid-1);
        return findRecursively(arr,t,mid+1,end);
    }
    public static void main(String[] args) {
        int[] arr= {1,4,6,8,9,10,25,34,68,72};
        int target = 25;
        int ans = findI(arr,target);
        System.out.println(ans);
        System.out.println(findRecursively(arr,target,0,arr.length-1));
    }
}
