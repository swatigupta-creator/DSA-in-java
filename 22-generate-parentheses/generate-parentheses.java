class Solution {
    public  void para(String ans,int left,int right ,int n,List<String>list){
            if (ans.length() == 2 * n) {      
   list.add(ans);
   return;
      }
           if(left<n) {
                   para(ans+"(",left+1,right,n,list);
           }
         if(right<left){
              para(ans+")",left,right+1,n,list);
           }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList<>();
       para("",0,0,n,list);
       return list; 
    }
}