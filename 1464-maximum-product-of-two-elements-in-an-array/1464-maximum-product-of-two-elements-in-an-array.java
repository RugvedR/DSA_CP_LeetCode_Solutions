class Solution {
    public int maxProduct(int[] nums) {
        int product = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]-1)*(nums[j]-1) >= product){
                    product = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return product;
    }
}