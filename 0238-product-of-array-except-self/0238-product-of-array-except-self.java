class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]= new int[nums.length];
        int prodl=1;
        int prodr=1;
        for(int j= nums.length-1; j>=0;j--){
                ans[j]=prodr;
                prodr=prodr*nums[j];
        }
        for(int k=0; k<nums.length;k++){
            ans[k]=ans[k]*prodl;
            prodl=prodl*nums[k];
        }
        return ans;
    }
        
    }