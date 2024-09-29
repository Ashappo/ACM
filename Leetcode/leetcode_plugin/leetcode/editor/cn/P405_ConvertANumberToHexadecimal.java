//给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。 
//
// 答案字符串中的所有字母都应该是小写字符，并且除了 0 本身之外，答案中不应该有任何前置零。 
//
// 注意: 不允许使用任何由库提供的将数字直接转换或格式化为十六进制的方法来解决这个问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 26
//输出："1a"
// 
//
// 示例 2： 
//
// 
//输入：num = -1
//输出："ffffffff"
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= num <= 2³¹ - 1 
// 
//
// Related Topics位运算 | 数学 
//
// 👍 306, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 数字转换为十六进制数
 * @author ambrose
 * @date 2024-09-26 12:31:31
 */
 
public class P405_ConvertANumberToHexadecimal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P405_ConvertANumberToHexadecimal().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toHex(int num) {
		//用二进制与运算，并且无符号移位，可以利用计算机中二进制自带的符号位进行处理。无需特别补码处理。
		if(num == 0) return "0";
		StringBuilder sb = new StringBuilder();
		while(num != 0){
			int cnt = num & 15;
			char c = cnt < 10 ? (char) (cnt + '0') : (char) (cnt - 10 + 'a');
			sb.insert(0, c);
			num >>>= 4;
		}
		return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
