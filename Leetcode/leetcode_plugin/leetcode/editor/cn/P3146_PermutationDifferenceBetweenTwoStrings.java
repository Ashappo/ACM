//给你两个字符串 s 和 t，每个字符串中的字符都不重复，且 t 是 s 的一个排列。 
//
// 排列差 定义为 s 和 t 中每个字符在两个字符串中位置的绝对差值之和。 
//
// 返回 s 和 t 之间的 排列差 。 
//
// 
//
// 示例 1： 
//
// 
// 输入：s = "abc", t = "bac" 
// 
//
// 输出：2 
//
// 解释： 
//
// 对于 s = "abc" 和 t = "bac"，排列差是： 
//
// 
// "a" 在 s 中的位置与在 t 中的位置之差的绝对值。 
// "b" 在 s 中的位置与在 t 中的位置之差的绝对值。 
// "c" 在 s 中的位置与在 t 中的位置之差的绝对值。 
// 
//
// 即，s 和 t 的排列差等于 |0 - 1| + |1 - 0| + |2 - 2| = 2。 
//
// 示例 2： 
//
// 
// 输入：s = "abcde", t = "edbac" 
// 
//
// 输出：12 
//
// 解释： s 和 t 的排列差等于 |0 - 3| + |1 - 2| + |2 - 4| + |3 - 1| + |4 - 0| = 12。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 26 
// 每个字符在 s 中最多出现一次。 
// t 是 s 的一个排列。 
// s 仅由小写英文字母组成。 
// 
//
// Related Topics哈希表 | 字符串 
//
// 👍 14, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 两个字符串的排列差
 * @author ambrose
 * @date 2024-09-25 19:33:42
 */
public class P3146_PermutationDifferenceBetweenTwoStrings{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3146_PermutationDifferenceBetweenTwoStrings().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPermutationDifference(String s, String t) {
		HashMap<Character, Integer> table = new HashMap<>();
		int cnt = 0;
		for(int i = 0; i < s.length(); i++){
			table.put(s.charAt(i), i);
		}
		for(int i = 0; i < t.length(); i++){
			cnt += (i >= table.get(t.charAt(i)) ? i - table.get(t.charAt(i)) : table.get(t.charAt(i)) - i);
		}
		return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
