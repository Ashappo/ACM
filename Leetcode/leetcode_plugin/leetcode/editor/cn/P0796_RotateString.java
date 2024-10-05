//给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。 
//
// s 的 旋转操作 就是将 s 最左边的字符移动到最右边。 
//
// 
// 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcde", goal = "cdeab"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abcde", goal = "abced"
//输出: false
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, goal.length <= 100 
// s 和 goal 由小写英文字母组成 
// 
//
// Related Topics字符串 | 字符串匹配 
//
// 👍 319, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 旋转字符串
 * @author ambrose
 * @date 2024-10-03 12:04:22
 */

public class P0796_RotateString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0796_RotateString().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean rotateString(String s, String goal) {
		if(s.length() != goal.length()) return false;
		if(s.equals(goal)) return true;
		for (int i = 0; i < s.length(); i++) {
			String temp = s.substring(i) + s.substring(0, i);
			if(temp.equals(goal))
				return true;
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}