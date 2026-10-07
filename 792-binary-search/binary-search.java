class Solution {
    public int existno(int [] nums,int target,int low ,int high){
    if(low>high) return -1;
     int mid=  low + (high - low) / 2;
    if(nums[mid]==target) return mid;
   else  if (nums[mid]>target) return existno( nums,target,low ,mid-1);
   else return  existno(nums,target,mid+1 ,high);
    }
   public int search(int[] nums, int target) {
    return  existno( nums,target,0 ,nums.length-1);
    }
}