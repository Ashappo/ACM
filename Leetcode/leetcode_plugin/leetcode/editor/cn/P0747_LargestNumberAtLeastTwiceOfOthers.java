//给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。 
//
// 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,6,1,0]
//输出：1
//解释：6 是最大的整数，对于数组中的其他整数，6 至少是数组中其他元素的两倍。6 的下标是 1 ，所以返回 1 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：-1
//解释：4 没有超过 3 的两倍大，所以返回 -1 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 50 
// 0 <= nums[i] <= 100 
// nums 中的最大元素是唯一的 
// 
//
// Related Topics数组 | 排序 
//
// 👍 210, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 至少是其他数字两倍的最大数
 * @author ambrose
 * @date 2024-10-02 22:44:39
 */

public class P0747_LargestNumberAtLeastTwiceOfOthers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0747_LargestNumberAtLeastTwiceOfOthers().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	//解答失败:
//测试用例:[0,0,3,2]
//测试结果:2
//期望结果:-1
//不要忘记单独判断是否大于第二大
    public int dominantIndex(int[] nums) {
		int max = 0, second = 0, ans = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max){
				second = max;
				max = nums[i];
				ans = i;
			}
			else if(nums[i] > second){
				second = nums[i];
			}
		}
		return max >= 2 * second ? ans : -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}