class Solution {
    public void moveZeroes(int[] nums) {
         for (int i= nums.length-1;i>=0;i--){
            if (nums[i]==0){
                for (int k=i;k< nums.length-1;k++){
                    nums[k]=nums[k+1];

                }

                nums[nums.length-1]=0;
            }
        }
        
        
    }
}
