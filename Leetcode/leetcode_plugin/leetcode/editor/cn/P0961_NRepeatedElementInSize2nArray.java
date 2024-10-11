//给你一个整数数组 nums ，该数组具有以下属性： 
//
// 
// 
// 
// nums.length == 2 * n. 
// nums 包含 n + 1 个 不同的 元素 
// nums 中恰有一个元素重复 n 次 
// 
// 
// 
//
// 找出并返回重复了 n 次的那个元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,3]
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,1,2,5,3,2]
//输出：2
// 
//
// 示例 3： 
//
// 
//输入：nums = [5,1,5,2,5,3,5,4]
//输出：5
// 
//
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 5000 
// nums.length == 2 * n 
// 0 <= nums[i] <= 10⁴ 
// nums 由 n + 1 个 不同的 元素组成，且其中一个元素恰好重复 n 次 
// 
//
// Related Topics数组 | 哈希表 
//
// 👍 200, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashSet;

/**
 * 在长度 2N 的数组中找出重复 N 次的元素
 * @author ambrose
 * @date 2024-10-10 21:10:56
 */

public class P0961_NRepeatedElementInSize2nArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0961_NRepeatedElementInSize2nArray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int repeatedNTimes(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(!set.contains(nums[i]))
				set.add(nums[i]);
			else return nums[i];
		}
		return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}