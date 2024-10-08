//我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
//
// Related Topics字符串 
//
// 👍 290, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 检测大写字母
 * @author ambrose
 * @date 2024-09-17 18:52:53
 */
public class P0520_DetectCapital{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0520_DetectCapital().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public boolean detectCapitalUse(String word) {
		//- 无论第 1个字母是否大写，其他字母必须与第 2个字母的大小写相同；
		//- 若第 1 个字母为小写，则需额外判断第 2 个字母是否为小写。
		if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			return false;
		}
		// 无论第 1 个字母是否大写，其他字母必须与第 2 个字母的大小写相同，不需考虑len=2，不会进入循环，=2时只需上面的判断即可。
		for (int i = 2; i < word.length(); ++i) {
			if (Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1))) {
				return false;
			}
		}
		return true;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
