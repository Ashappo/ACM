//给定一个非负整数数组 nums， nums 中一半整数是 奇数 ，一半整数是 偶数 。 
//
// 对数组进行排序，以便当 nums[i] 为奇数时，i 也是 奇数 ；当 nums[i] 为偶数时， i 也是 偶数 。 
//
// 你可以返回 任何满足上述条件的数组作为答案 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [4,2,5,7]
//输出：[4,5,2,7]
//解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,3]
//输出：[2,3]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 2 * 10⁴ 
// nums.length 是偶数 
// nums 中一半是偶数 
// 0 <= nums[i] <= 1000 
// 
//
// 
//
// 进阶：可以不使用额外空间解决问题吗？ 
//
// Related Topics数组 | 双指针 | 排序 
//
// 👍 297, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 按奇偶排序数组 II
 * @author ambrose
 * @date 2024-10-06 21:42:59
 */

public class P0922_SortArrayByParityIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0922_SortArrayByParityIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
		int odd = 1;
		for (int even = 0; even < nums.length; even += 2) {
			if (nums[even] % 2 == 1){
				while (odd < nums.length && nums[odd] % 2 == 1){
					odd += 2;
				}
				nums[even] += nums[odd];
				nums[odd] = nums[even] - nums[odd];
				nums[even] -= nums[odd];
			}
		}
		return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}