//给你两个整数 left 和 right ，在闭区间 [left, right] 范围内，统计并返回 计算置位位数为质数 的整数个数。 
//
// 计算置位位数 就是二进制表示中 1 的个数。 
//
// 
// 例如， 21 的二进制表示 10101 有 3 个计算置位。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：left = 6, right = 10
//输出：4
//解释：
//6 -> 110 (2 个计算置位，2 是质数)
//7 -> 111 (3 个计算置位，3 是质数)
//9 -> 1001 (2 个计算置位，2 是质数)
//10-> 1010 (2 个计算置位，2 是质数)
//共计 4 个计算置位为质数的数字。
// 
//
// 示例 2： 
//
// 
//输入：left = 10, right = 15
//输出：5
//解释：
//10 -> 1010 (2 个计算置位, 2 是质数)
//11 -> 1011 (3 个计算置位, 3 是质数)
//12 -> 1100 (2 个计算置位, 2 是质数)
//13 -> 1101 (3 个计算置位, 3 是质数)
//14 -> 1110 (3 个计算置位, 3 是质数)
//15 -> 1111 (4 个计算置位, 4 不是质数)
//共计 5 个计算置位为质数的数字。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= left <= right <= 10⁶ 
// 0 <= right - left <= 10⁴ 
// 
//
// Related Topics位运算 | 数学 
//
// 👍 147, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 二进制表示中质数个计算置位
 * @author ambrose
 * @date 2024-10-03 00:58:39
 */

public class P0762_PrimeNumberOfSetBitsInBinaryRepresentation{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0762_PrimeNumberOfSetBitsInBinaryRepresentation().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//1.Integer.bitCount(x),统计1的个数，2.求质数的算法
    public int countPrimeSetBits(int left, int right) {
		int res = 0;
//		for (int i = left; i <= right; i++) {
//			int temp = i, cnt = 0;
//			while(temp > 0){
//				cnt += temp & 1;
//				temp >>= 1;
//			}
//			if(isPrime(cnt))
//				res++;
//		}
		for (int x = left; x <= right; ++x) {
			if (isPrime(Integer.bitCount(x))) {
				++res;
			}
		}
		return res;
    }
	public boolean isPrime(int n) {
		if (n <= 1) return false; // 质数必须大于 1
		if (n <= 3) return true;  // 2 和 3 是质数

		// 排除偶数和 3 的倍数
		if (n % 2 == 0 || n % 3 == 0) return false;

		// 仅检查到 sqrt(n)
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) return false;
		}

		return true; // 如果没有找到因子，则是质数
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}