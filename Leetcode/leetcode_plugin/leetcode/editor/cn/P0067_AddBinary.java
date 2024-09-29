//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。 
//
// 
//
// 示例 1： 
//
// 
//输入:a = "11", b = "1"
//输出："100" 
//
// 示例 2： 
//
// 
//输入：a = "1010", b = "1011"
//输出："10101" 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a 和 b 仅由字符 '0' 或 '1' 组成 
// 字符串如果不是 "0" ，就不含前导零 
// 
//
// Related Topics位运算 | 数学 | 字符串 | 模拟 
//
// 👍 1230, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 二进制求和
 * @author ambrose
 * @date 2024-09-16 23:38:27
 */
public class P0067_AddBinary{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0067_AddBinary().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
		char[] c1 = a.toCharArray(), c2 = b.toCharArray();
		// 将 List<Character> 转换为字符串并输出
		StringBuilder result = new StringBuilder();
		int flag = 0, max = Math.max(b.length(), a.length());
		for(int i = 0; i < max; i++){
			// 处理当前位，若超出范围则为 0,开始忘记判断
			int cnt1 = (i < a.length()) ? a.charAt(a.length() - 1 - i) - '0' : 0;
			int cnt2 = (i < b.length()) ? b.charAt(b.length() - 1 - i) - '0' : 0;
			int cnt = (cnt1 + cnt2 + flag) % 2; flag = (cnt1 + cnt2 + flag) / 2;
			// 将结果存入 ans，添加到开头，类型转换
			result.insert(0, (char) (cnt + '0'));
		}
		// 如果最终还有进位，添加到最高位
		if (flag > 0) {
			result.insert(0, '1');
		}
		return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
