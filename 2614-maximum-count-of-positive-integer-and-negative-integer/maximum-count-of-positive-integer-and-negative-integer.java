class Solution {
    public int maximumCount(int[] nums) {
        int low=0;
        int n=nums.length;
       int high=n-1;
       int neg=0;
       int pos=0;
       while(low<=high) {
        int mid = low+ (high - low) / 2;
        if( nums[mid]>=0){
            high=mid-1;
        }
       else {
        
        low=mid+1; 
         neg=low;
        }
       }
        low=0;
        high=n-1;
          while(low<=high) {
         int mid = low+ (high - low) / 2;
        if( nums[mid]<=0){
          low=mid+1;
        }
       else{
         
           high=mid-1;
            pos=n-mid;
       }
       }
        if(neg>pos) return neg;
        else return pos;
    }
}