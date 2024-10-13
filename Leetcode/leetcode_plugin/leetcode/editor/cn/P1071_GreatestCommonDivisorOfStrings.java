//对于字符串 s 和 t，只有在 s = t + t + t + ... + t + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。 
//
// 给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 x 能除尽 str2 。 
//
// 
//
// 示例 1： 
//
// 
//输入：str1 = "ABCABC", str2 = "ABC"
//输出："ABC"
// 
//
// 示例 2： 
//
// 
//输入：str1 = "ABABAB", str2 = "ABAB"
//输出："AB"
// 
//
// 示例 3： 
//
// 
//输入：str1 = "LEET", str2 = "CODE"
//输出：""
// 
//
// 
//
// 提示： 
//
// 
// 1 <= str1.length, str2.length <= 1000 
// str1 和 str2 由大写英文字母组成 
// 
//
// Related Topics数学 | 字符串 
//
// 👍 416, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 字符串的最大公因子
 * @author ambrose
 * @date 2024-10-13 19:23:06
 */

public class P1071_GreatestCommonDivisorOfStrings{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1071_GreatestCommonDivisorOfStrings().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String gcdOfStrings(String str1, String str2) {
		int len1= str1.length(), len2 = str2.length();
		for (int i = Math.min(len1, len2); i > 0; i--) {
			if(len1 % i == 0 && len2 % i == 0){
				String s = str1.substring(0, i);
				if(check(s, str1) && check(s, str2))
					return s;
			}
		}
		return "";
    }
	public Boolean check(String s, String str){
		int cnt = str.length() / s.length();
		StringBuilder sb = new StringBuilder();
		while (cnt-- > 0){
			sb.append(s);
		}
		return str.contentEquals(sb);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}