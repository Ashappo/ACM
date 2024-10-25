//给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符： 
//
// 
// 字符（'a' - 'i'）分别用（'1' - '9'）表示。 
// 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
// 
//
// 返回映射之后形成的新字符串。 
//
// 题目数据保证映射始终唯一。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "10#11#12"
//输出："jkab"
//解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 
//
// 示例 2： 
//
// 
//输入：s = "1326#"
//输出："acz"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s[i] 只包含数字（'0'-'9'）和 '#' 字符。 
// s 是映射始终存在的有效字符串。 
// 
//
// Related Topics字符串 
//
// 👍 89, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 解码字母到整数映射
 * @author ambrose
 * @date 2024-10-25 22:06:54
 */

public class P1309_DecryptStringFromAlphabetToIntegerMapping{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1309_DecryptStringFromAlphabetToIntegerMapping().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String freqAlphabets(String s) {
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = n - 1; i >= 0; i--) {
			if(s.charAt(i) == '#'){
				Character temp = (char) (((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') - 1) + 'a');
				sb.insert(0, temp);
				i -= 2;
			} else {
				sb.insert(0, (char)(s.charAt(i) - '1' + 'a'));
			}
		}
		return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}