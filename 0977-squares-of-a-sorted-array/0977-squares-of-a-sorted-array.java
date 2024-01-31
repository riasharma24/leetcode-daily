class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<=nums.length-1;i++)res[i]=nums[i]*nums[i];
        int g;
        for(int i=0;i<=nums.length-2;i++)
        {
            for(int j=i+1;j<=nums.length-1;j++)
            {
                if(res[i]>res[j])
                {
                    g=res[i];
                    res[i]=res[j];
                    res[j]=g;
                }
            }
        }
        return res;
    }
}