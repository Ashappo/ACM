//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。 
//
// 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。 
//
// 
//
// 示例 1： 
//
// 
//输入：num1 = "11", num2 = "123"
//输出："134"
// 
//
// 示例 2： 
//
// 
//输入：num1 = "456", num2 = "77"
//输出："533"
// 
//
// 示例 3： 
//
// 
//输入：num1 = "0", num2 = "0"
//输出："0"
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num1.length, num2.length <= 10⁴ 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 
//
// Related Topics数学 | 字符串 | 模拟 
//
// 👍 851, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 字符串相加
 * @author ambrose
 * @date 2024-09-17 10:19:54
 */
public class P415_AddStrings{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P415_AddStrings().new Solution();
		 String num1 = "11", num2 = "123";
		 String num3 = "456", num4 = "77";
		 System.out.println(solution.addStrings(num1, num2));
		 System.out.println(solution.addStrings(num3, num4));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
		int len1 = num1.length() - 1, len2 = num2.length() - 1, flag = 0;
		int max = Integer.max(len1, len2);
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i <= max; i++){
			int x = i > len1 ? 0 : num1.charAt(len1 - i) - '0';
			int y = i > len2 ? 0 : num2.charAt(len2 - i) - '0';
			str.insert(0, (x + y + flag) % 10);
			flag = (x + y + flag) / 10;
		}
		if(flag == 1){
			str.insert(0, '1');
		}
		return str.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
