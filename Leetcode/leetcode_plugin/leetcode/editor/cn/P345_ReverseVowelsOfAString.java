//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。 
//
// 
//
// 示例 1： 
//
// 
// 输入：s = "IceCreAm" 
// 
//
// 输出："AceCreIm" 
//
// 解释： 
//
// s 中的元音是 ['I', 'e', 'e', 'A']。反转这些元音，s 变为 "AceCreIm". 
//
// 示例 2： 
//
// 
// 输入：s = "leetcode" 
// 
//
// 输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
//
// Related Topics双指针 | 字符串 
//
// 👍 362, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * 反转字符串中的元音字母
 * @author ambrose
 * @date 2024-09-22 20:03:28
 */
public class P345_ReverseVowelsOfAString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P345_ReverseVowelsOfAString().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
		StringBuilder ss = new StringBuilder();
		Stack<Character> stack = new Stack<>();
        Character[] temp = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
        HashSet<Character> set = new HashSet<>(Arrays.asList(temp));
		// 压入元音字母（原大小写）
		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				stack.push(c);
			}
		}
		// 重建字符串
		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				ss.append(stack.pop()); // 从栈中弹出元音
			} else {
				ss.append(c); // 保留其他字符
			}
		}
		return ss.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
