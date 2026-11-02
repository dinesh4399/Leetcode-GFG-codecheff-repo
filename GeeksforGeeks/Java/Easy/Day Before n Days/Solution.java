class Solution {
    public int nthDay(int d, int n) {
        // code here
   n=n%7;
    if(d>=n){
        return d-n;
    }else{
         
        return d+(7-n);
        
    }
       
    }
}