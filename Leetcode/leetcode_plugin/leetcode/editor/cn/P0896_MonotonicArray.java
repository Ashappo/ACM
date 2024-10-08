//如果数组是单调递增或单调递减的，那么它是 单调 的。 
//
// 如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = 
//nums[j]，那么数组 nums 是单调递减的。 
//
// 当给定的数组 nums 是单调数组时返回 true，否则返回 false。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：nums = [6,5,4,4]
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,3,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics数组 
//
// 👍 216, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 单调数列
 * @author ambrose
 * @date 2024-10-06 18:41:23
 */

public class P0896_MonotonicArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0896_MonotonicArray().new Solution();
		  int[] nums = {11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5};
		  System.out.println(solution.isMonotonic(nums));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMonotonic(int[] nums) {
		int n = nums.length, temp = 0;
		for (int i = 1; i < n; i++) {
			if((nums[i] - nums[i - 1] > 0 && temp < 0) || (nums[i] - nums[i - 1] < 0 && temp > 0))
				return false;
			else {
				if(temp == 0){
					temp = nums[i] - nums[i - 1];
				}
			}
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}