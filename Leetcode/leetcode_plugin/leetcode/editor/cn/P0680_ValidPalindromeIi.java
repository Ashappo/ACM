//给你一个字符串 s，最多 可以从中删除一个字符。 
//
// 请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "aba"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "abca"
//输出：true
//解释：你可以删除字符 'c' 。
// 
//
// 示例 3： 
//
// 
//输入：s = "abc"
//输出：false 
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
// Related Topics贪心 | 双指针 | 字符串 
//
// 👍 652, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Stack;

/**
 * 验证回文串 II
 * @author ambrose
 * @date 2024-09-29 22:00:58
 */

public class P0680_ValidPalindromeIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0680_ValidPalindromeIi().new Solution();
		  String s = "abc";
		  System.out.println(solution.isPalindrome(s));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
		boolean flag = false;
		for(int i = 0; i < s.length(); i++){
			s = s.substring(0, i) + s.substring(i + 1);
			if(isPalindrome(s))
				return true;
		}
		return flag;
    }
	public boolean isPalindrome(String s){
		Stack<Character> stack = new Stack<>();
		if(s.length() == 2 && s.charAt(0) != s.charAt(1))
			return false;
		for(int i = 0; i < s.length(); i++){
			if(i < s.length() / 2)
				stack.push(s.charAt(i));
			if(i > s.length() / 2){
				if(s.charAt(i) != stack.pop())
					return false;
			}
		}
		return true;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}