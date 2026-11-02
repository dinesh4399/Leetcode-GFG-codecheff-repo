class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // int n=0;
        // int target=sc.nextInt();
        // int hours[]=sc.nextInt(n);
        int count=0;
        for(int x:hours)
        {
            if(x>=target){
                count++;

            }
        }
        return count;
        
    }
}