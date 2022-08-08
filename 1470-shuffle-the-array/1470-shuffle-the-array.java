class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i1 = 0;
        int i2 = n;
        for(int i=0; i<2*n; i++){
            if(i%2==0){
                ans[i] = nums[i1];
                i1++;
            }
            else{
                ans[i] = nums[i2];
                i2++;
            }
        }
        return ans;
    }
}