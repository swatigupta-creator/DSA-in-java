class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int first=0;
        int sec=0;
        int n=arr.length;
        while(low<=high) {
          int mid = low + (high - low) / 2; 
         if(arr.length==1) return arr[0];
        else if(arr[0]!=arr[1]) return arr[0];
        else if( arr[n-1]!=arr[n-2]) return arr[n-1];
       else if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
       else if(arr[mid]==arr[mid-1]) {
        first=mid-1;
        sec=mid;
       }
       else if (arr[mid]==arr[mid+1]){
        first=mid;
        sec=mid+1;
       }
       int leftcount=first-low;
       int rightcount=high-sec;
       if(leftcount%2==0)  low=sec+1; 
            else high=first-1;            
        }
        return arr[low] ;
    }
}