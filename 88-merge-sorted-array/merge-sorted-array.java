class Solution {
    public static void combined(int[]a,int []b,int []c){
        int i=0;int j=0;int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k++]=b[j++];
            }
        }
             while(i<a.length){
                 c[k++]=a[i++];
             }
               while(j<b.length){
                  c[k++]=b[j++];
             }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] a= new int[m];
        int []b= new int[n]; 
        int[] c= new int[m+n];
        for (int i = 0; i < m; i++) {
            a[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            b[i] = nums2[i];
        }

         combined(a,b,c);
          for (int i = 0; i < m + n; i++) {
            nums1[i] = c[i];
        }
    }
}