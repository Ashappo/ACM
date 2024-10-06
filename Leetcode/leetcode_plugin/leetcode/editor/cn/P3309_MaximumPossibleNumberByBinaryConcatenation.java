//给你一个长度为 3 的整数数组 nums。 
//
// 现以某种顺序 连接 数组 nums 中所有元素的 二进制表示 ，请你返回可以由这种方法形成的 最大 数值。 
//
// 注意 任何数字的二进制表示 不含 前导零。 
//
// 
//
// 示例 1: 
//
// 
// 输入: nums = [1,2,3] 
// 
//
// 输出: 30 
//
// 解释: 
//
// 按照顺序 [3, 1, 2] 连接数字的二进制表示，得到结果 "11110"，这是 30 的二进制表示。 
//
// 示例 2: 
//
// 
// 输入: nums = [2,8,16] 
// 
//
// 输出: 1296 
//
// 解释: 
//
// 按照顺序 [2, 8, 16] 连接数字的二进制表述，得到结果 "10100010000"，这是 1296 的二进制表示。 
//
// 
//
// 提示: 
//
// 
// nums.length == 3 
// 1 <= nums[i] <= 127 
// 
//
// 👍 0, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 连接二进制表示可形成的最大数值
 * @author ambrose
 * @date 2024-10-06 12:54:54
 */

public class P3309_MaximumPossibleNumberByBinaryConcatenation{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3309_MaximumPossibleNumberByBinaryConcatenation().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxGoodNumber(int[] nums) {
		int n = nums.length;
		String[] binaryNums = new String[n];
		for (int i = 0; i < n; i++) {
			binaryNums[i] = Integer.toBinaryString(nums[i]);
		}
		Arrays.sort(binaryNums, (a, b) -> (b + a).compareTo(a + b));
		StringBuilder sb = new StringBuilder();
		for(String s : binaryNums)
			sb.append(s);
		return Integer.parseInt(sb.toString(), 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}