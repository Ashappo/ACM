//字母序连续字符串 是由字母表中连续字母组成的字符串。换句话说，字符串 "abcdefghijklmnopqrstuvwxyz" 的任意子字符串都是 字母序连
//续字符串 。 
//
// 
// 例如，"abc" 是一个字母序连续字符串，而 "acb" 和 "za" 不是。 
// 
//
// 给你一个仅由小写英文字母组成的字符串 s ，返回其 最长 的 字母序连续子字符串 的长度。 
//
// 
//
// 示例 1： 
//
// 输入：s = "abacaba"
//输出：2
//解释：共有 4 个不同的字母序连续子字符串 "a"、"b"、"c" 和 "ab" 。
//"ab" 是最长的字母序连续子字符串。
// 
//
// 示例 2： 
//
// 输入：s = "abcde"
//输出：5
//解释："abcde" 是最长的字母序连续子字符串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s 由小写英文字母组成 
// 
//
// Related Topics字符串 
//
// 👍 27, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import javax.swing.plaf.metal.MetalTabbedPaneUI;

/**
 * 最长的字母序连续子字符串的长度
 * @author ambrose
 * @date 2024-09-19 09:07:34
 */
public class P2414_LengthOfTheLongestAlphabeticalContinuousSubstring{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2414_LengthOfTheLongestAlphabeticalContinuousSubstring().new Solution();
		 String s = "abacaba";
		 System.out.println(solution.longestContinuousSubstring(s));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestContinuousSubstring(String s) {
		int len = s.length(), left = 0, right = 0, res = 1;
		for(; left < len - 1; left++){
			int temp = 1;//初始为1而非0
			right = left + 1;
			while(right < len && s.charAt(right) == s.charAt(right - 1) + 1){
				temp++; right++;
			}
			left = right - 1;//不能left = right,会漏不连续的第一个元素
			res = Math.max(res, temp);
		}
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
