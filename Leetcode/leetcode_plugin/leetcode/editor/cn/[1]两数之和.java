
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hashtable.containsKey(target - nums[i]))
                return new int[]{hashtable.get(target- nums[i]),i};
            else hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
