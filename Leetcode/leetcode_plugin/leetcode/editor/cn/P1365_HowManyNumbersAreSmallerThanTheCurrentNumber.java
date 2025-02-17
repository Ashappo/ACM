//给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。 
//
// 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。 
//
// 以数组形式返回答案。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [8,1,2,2,3]
//输出：[4,0,1,1,3]
//解释： 
//对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。 
//对于 nums[1]=1 不存在比它小的数字。
//对于 nums[2]=2 存在一个比它小的数字：（1）。 
//对于 nums[3]=2 存在一个比它小的数字：（1）。 
//对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
// 
//
// 示例 2： 
//
// 输入：nums = [6,5,4,8]
//输出：[2,1,0,3]
// 
//
// 示例 3： 
//
// 输入：nums = [7,7,7,7]
//输出：[0,0,0,0]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 500 
// 0 <= nums[i] <= 100 
// 
//
// Related Topics数组 | 哈希表 | 计数 | 排序 
//
// 👍 297, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 有多少小于当前数字的数字
 * @author ambrose
 * @date 2025-02-14 21:11:18
 */

public class P1365_HowManyNumbersAreSmallerThanTheCurrentNumber{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1365_HowManyNumbersAreSmallerThanTheCurrentNumber().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumbers = new int[101], answer = new int[nums.length];
		for(int num:nums) {
			smallerNumbers[num]++;
		}
		for (int i = 1; i <= 100; i++) {
			smallerNumbers[i] += smallerNumbers[i - 1];
		}
		for (int i = 0; i < nums.length; i++) {
			answer[i] = nums[i] == 0 ? 0 : smallerNumbers[nums[i] - 1];
		}
		return answer;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}