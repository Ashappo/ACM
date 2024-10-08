//给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3, 2, 1]
//输出：1
//解释：第三大的数是 1 。 
//
// 示例 2： 
//
// 
//输入：[1, 2]
//输出：2
//解释：第三大的数不存在, 所以返回最大的数 2 。
// 
//
// 示例 3： 
//
// 
//输入：[2, 2, 3, 1]
//输出：1
//解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
//此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能设计一个时间复杂度 O(n) 的解决方案吗？ 
//
// Related Topics数组 | 排序 
//
// 👍 473, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 第三大的数
 * @author ambrose
 * @date 2024-09-26 13:43:08
 */
 
public class P0414_ThirdMaximumNumber{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0414_ThirdMaximumNumber().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length, ans = 0, temp = nums[len - 1], cnt = 1;
		for(int i = len  - 1; i >= 0; i--){
			if(nums[i] < temp){
				if(++cnt == 3){
					return nums[i];
				}
				temp = nums[i];
			}
		}
		return nums[len - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
