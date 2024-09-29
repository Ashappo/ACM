//给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。 
//
// 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。 
//
// 任何误差小于 10⁻⁵ 的答案都将被视为正确答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,12,-5,-6,50,3], k = 4
//输出：12.75
//解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 示例 2： 
//
// 
//输入：nums = [5], k = 1
//输出：5.00000
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= k <= n <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// Related Topics数组 | 滑动窗口 
//
// 👍 354, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 子数组最大平均数 I
 * @author ambrose
 * @date 2024-09-29 19:02:56
 */

public class P643_MaximumAverageSubarrayI{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P643_MaximumAverageSubarrayI().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
		int temp = 0, ans = 0;
		for (int i = 0; i < k; i++) {
			temp += nums[i];
		}
		ans = temp;
		for (int i = k; i < nums.length; i++) {
			temp += nums[i] - nums[i - k];
			ans = Math.max(ans, temp);
		}
//		直接double，否则除余再double损失精度
//		return (double) (ans / k);
		return (double) ans / k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}