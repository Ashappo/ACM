//给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 5
//输出：true
//解释：5 的二进制表示是：101
// 
//
// 示例 2： 
//
// 
//输入：n = 7
//输出：false
//解释：7 的二进制表示是：111. 
//
// 示例 3： 
//
// 
//输入：n = 11
//输出：false
//解释：11 的二进制表示是：1011. 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
//
// Related Topics位运算 
//
// 👍 242, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 交替位二进制数
 * @author ambrose
 * @date 2024-10-02 16:38:49
 */

public class P0693_BinaryNumberWithAlternatingBits{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0693_BinaryNumberWithAlternatingBits().new Solution();
		  int n = 5;
		  System.out.println(solution.hasAlternatingBits(n));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//n:      00000000 00000000 00000000 00000101
//n >> 1: 00000000 00000000 00000000 00000010
//------------------------------------------
//n ^ (n >> 1) = 00000000 00000000 00000000 00000111
//n ^ (n >> 1) + 1 = 00000000 00000000 00000000 00001000

//n:      00000000 00000000 00000000 00000100
//n >> 1: 00000000 00000000 00000000 00000010
//------------------------------------------
//n ^ (n >> 1) = 00000000 00000000 00000000 00000110
//n ^ (n >> 1) + 1 = 00000000 00000000 00000000 00000111
//	n>>1，以及n ^ n>>1 不会发生溢出。num一定小于2^31 - 1，num + 1不会溢出。
    public boolean hasAlternatingBits(int n) {
		int num = n >> 1 ^ n;
		return (num & (num + 1)) == 0;
//		return ((Integer.highestOneBit(n) << 1) - 1) == (n >> 1 ^ n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}