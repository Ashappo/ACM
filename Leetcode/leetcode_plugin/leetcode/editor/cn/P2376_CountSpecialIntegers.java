//如果一个正整数每一个数位都是 互不相同 的，我们称它是 特殊整数 。 
//
// 给你一个 正 整数 n ，请你返回区间 [1, n] 之间特殊整数的数目。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 20
//输出：19
//解释：1 到 20 之间所有整数除了 11 以外都是特殊整数。所以总共有 19 个特殊整数。
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：5
//解释：1 到 5 所有整数都是特殊整数。
// 
//
// 示例 3： 
//
// 
//输入：n = 135
//输出：110
//解释：从 1 到 135 总共有 110 个整数是特殊整数。
//不特殊的部分数字为：22 ，114 和 131 。 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2 * 10⁹ 
// 
//
// Related Topics数学 | 动态规划 
//
// 👍 127, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 统计特殊整数
 * @author ambrose
 * @date 2024-09-21 15:54:27
 */
public class P2376_CountSpecialIntegers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2376_CountSpecialIntegers().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int countSpecialNumbers(int n) {
		String strN = String.valueOf(n);
		int length = strN.length();

		// 计算小于当前位数的特殊整数个数
		int count = 0;
		for (int i = 1; i < length; i++) {
			count += 9 * permute(9, i - 1);  // i位数的特殊整数
		}

		// 计算与 n 同位数的特殊整数
		boolean[] used = new boolean[10];  // 记录数字是否已被使用
		for (int i = 0; i < length; i++) {
			int currentDigit = strN.charAt(i) - '0';
			for (int j = (i == 0 ? 1 : 0); j < currentDigit; j++) {  // 第一个数字不能为0
				if (!used[j]) {  // 如果 j 这个数字还没有被使用
					count += permute(9 - i, length - i - 1);
				}
			}
			if (used[currentDigit]) {  // 如果当前数字已使用，直接退出
				break;
			}
			used[currentDigit] = true;  // 标记当前数字为已使用
		}

		return count + 1;  // 包括 n 本身，如果 n 是特殊数
	}

	private int permute(int availableDigits, int length) {
		if (length == 0) return 1;
		int result = 1;
		for (int i = 0; i < length; i++) {
			result *= availableDigits;
			availableDigits--;
		}
		return result;
	}
}

//leetcode submit region end(Prohibit modification and deletion)

}
