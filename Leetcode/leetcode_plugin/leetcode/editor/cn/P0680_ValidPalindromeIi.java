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
		  String s = "cbbcc";
		  System.out.println(solution.validPalindrome(s));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while(left < right){
			if(s.charAt(left) != s.charAt(right)){
				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right -1);
			}
			left++; right--;
		}
		return true;
    }
	public boolean isPalindrome(String s, int left, int right){
		while(left < right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++; right--;
		}
		return true;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}