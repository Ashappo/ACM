//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
//
// Related Topics数组 | 双指针 | 排序 
//
// 👍 1043, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 有序数组的平方
 * @author ambrose
 * @date 2024-10-10 21:21:45
 */

public class P0977_SquaresOfASortedArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0977_SquaresOfASortedArray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
		int n = nums.length, negative = -1;
		for (int i = 0; i < n; i++) {
			if(nums[i] < 0)
				negative = i;
			else break;
		}
		int idx = 0, i = negative, j = negative + 1;
		int[] ans = new int[n];
		while (i >= 0 || j < n){
			if(i == -1){
				ans[idx] = (int)Math.pow(nums[j++], 2);
			} else if(j == n){
				ans[idx] = (int)Math.pow(nums[i--], 2);
			} else if ((int)Math.pow(nums[i], 2) > (int)Math.pow(nums[j], 2)) {
				ans[idx] = (int)Math.pow(nums[j++], 2);
			} else ans[idx] = (int)Math.pow(nums[i--], 2);
			idx++;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}