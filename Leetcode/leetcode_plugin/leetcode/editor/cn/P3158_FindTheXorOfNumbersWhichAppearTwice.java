//给你一个数组 nums ，数组中的数字 要么 出现一次，要么 出现两次。 
//
// 请你返回数组中所有出现两次数字的按位 XOR 值，如果没有数字出现过两次，返回 0 。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [1,2,1,3] 
// 
//
// 输出：1 
//
// 解释： 
//
// nums 中唯一出现过两次的数字是 1 。 
//
// 示例 2： 
//
// 
// 输入：nums = [1,2,3] 
// 
//
// 输出：0 
//
// 解释： 
//
// nums 中没有数字出现两次。 
//
// 示例 3： 
//
// 
// 输入：nums = [1,2,2,1] 
// 
//
// 输出：3 
//
// 解释： 
//
// 数字 1 和 2 出现过两次。1 XOR 2 == 3 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50 
// 1 <= nums[i] <= 50 
// nums 中每个数字要么出现过一次，要么出现过两次。 
// 
//
// Related Topics位运算 | 数组 | 哈希表 
//
// 👍 24, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashSet;

/**
 * 求出出现两次数字的 XOR 值
 * @author ambrose
 * @date 2024-10-12 23:02:40
 */

public class P3158_FindTheXorOfNumbersWhichAppearTwice{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3158_FindTheXorOfNumbersWhichAppearTwice().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int duplicateNumbersXOR(int[] nums) {
		int ans = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int c : nums){
			if(!set.contains(c))
				set.add(c);
			else {
				ans ^= c;
			}
		}
		return ans;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}