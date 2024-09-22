//给你三个 正 整数 num1 ，num2 和 num3 。 
//
// 数字 num1 ，num2 和 num3 的数字答案 key 是一个四位数，定义如下： 
//
// 
// 一开始，如果有数字 少于 四位数，给它补 前导 0 。 
// 答案 key 的第 i 个数位（1 <= i <= 4）为 num1 ，num2 和 num3 第 i 个数位中的 最小 值。 
// 
//
// 请你返回三个数字 没有 前导 0 的数字答案。 
//
// 
//
// 示例 1： 
//
// 
// 输入：num1 = 1, num2 = 10, num3 = 1000 
// 
//
// 输出：0 
//
// 解释： 
//
// 补前导 0 后，num1 变为 "0001" ，num2 变为 "0010" ，num3 保持不变，为 "1000" 。 
//
// 
// 数字答案 key 的第 1 个数位为 min(0, 0, 1) 。 
// 数字答案 key 的第 2 个数位为 min(0, 0, 0) 。 
// 数字答案 key 的第 3 个数位为 min(0, 1, 0) 。 
// 数字答案 key 的第 4 个数位为 min(1, 0, 0) 。 
// 
//
// 所以数字答案为 "0000" ，也就是 0 。 
//
// 示例 2： 
//
// 
// 输入： num1 = 987, num2 = 879, num3 = 798 
// 
//
// 输出：777 
//
// 示例 3： 
//
// 
// 输入：num1 = 1, num2 = 2, num3 = 3 
// 
//
// 输出：1 
//
// 
//
// 提示： 
//
// 
// 1 <= num1, num2, num3 <= 9999 
// 
//
// Related Topics数学 
//
// 👍 0, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 求出数字答案
 * @author ambrose
 * @date 2024-09-22 15:51:05
 */
public class P3270_FindTheKeyOfTheNumbers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3270_FindTheKeyOfTheNumbers().new Solution();
		  int num1 = 987, num2 = 879, num3 = 798;
		  System.out.println(solution.generateKey(num1, num2, num3));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int generateKey(int num1, int num2, int num3) {
		int ans = 0;
		StringBuilder s = new StringBuilder();
		String s1 = String.valueOf(num1);
		String s2 = String.valueOf(num2);
		String s3 = String.valueOf(num3);
		s1 = toShape(s1);
		s2 = toShape(s2);
		s3 = toShape(s3);
		for(int i = 0; i < 4; i++){
			//注意类型转换，+ '0'再强制转。
			char c = (char) (Math.min(Math.min(s1.charAt(i) - '0',s2.charAt(i) - '0')
					,s3.charAt(i) - '0') + '0');
			s.append(c);
		}
		return Integer.parseInt(s.toString());
	}
	public String toShape(String s){
		// 将字符串长度不足4的前面补0
		StringBuilder ss = new StringBuilder(s);
		while (ss.length() < 4) {
			ss.insert(0, '0');
		}
		return ss.toString();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
