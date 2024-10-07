//给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。 
//
// 返回满足此条件的 任一数组 作为答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,1,2,4]
//输出：[2,4,3,1]
//解释：[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 5000 
// 0 <= nums[i] <= 5000 
// 
//
// Related Topics数组 | 双指针 | 排序 
//
// 👍 395, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 按奇偶排序数组
 * @author ambrose
 * @date 2024-10-06 18:57:08
 */

public class P0905_SortArrayByParity{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0905_SortArrayByParity().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		 //原地交换需要用双指针
    public int[] sortArrayByParity(int[] nums) {
		int left = 0, right = nums.length - 1;
		while(left < right){
			while (left < right && nums[left] % 2 == 0)
				left++;
			while (left < right && nums[right] % 2 == 1)
				right--;
			if(left < right){
				nums[left] = nums[right] + nums[left];
				nums[right] = nums[left] - nums[right];
				nums[left] -= nums[right];
				left++; right--;
			}
		}
		return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}