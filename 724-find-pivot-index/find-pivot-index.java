class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int n=nums.length;
        int lsum=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int j=0;j<n;j++){
            int rsum=total-lsum-nums[j];
            if(lsum==rsum){
                return j;
            }
            lsum+=nums[j];
        }
        return -1;

    }

}