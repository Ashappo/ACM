//给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：6
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：24
// 
//
// 示例 3： 
//
// 
//输入：nums = [-1,-2,-3]
//输出：-6
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10⁴ 
// -1000 <= nums[i] <= 1000 
// 
//
// Related Topics数组 | 数学 | 排序 
//
// 👍 484, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 * @author ambrose
 * @date 2024-09-29 18:57:34
 */

public class P628_MaximumProductOfThreeNumbers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P628_MaximumProductOfThreeNumbers().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}