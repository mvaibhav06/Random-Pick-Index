class Solution {
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                temp.add(i);
            }
        }
        Random random = new Random();
        int randIndex = random.nextInt(temp.size());
        return temp.get(randIndex);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
