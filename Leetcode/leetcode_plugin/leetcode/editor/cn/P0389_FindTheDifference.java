//给定两个字符串 s 和 t ，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abcd", t = "abcde"
//输出："e"
//解释：'e' 是那个被添加的字母。
// 
//
// 示例 2： 
//
// 
//输入：s = "", t = "y"
//输出："y"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 1000 
// t.length == s.length + 1 
// s 和 t 只包含小写字母 
// 
//
// Related Topics位运算 | 哈希表 | 字符串 | 排序 
//
// 👍 483, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 找不同
 *
 * @author ambrose
 * @date 2024-09-17 09:56:49
 */
public class P0389_FindTheDifference {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P0389_FindTheDifference().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char findTheDifference(String s, String t) {
            int[] ans = new int[26];
            for (char c : t.toCharArray()) {
                ans[c - 'a']++;
            }
            for (char c : s.toCharArray()) {
                ans[c - 'a']--;
            }
            char res;
            for (int i = 0; i < 26; i++) {
                if (ans[i] == 1)
                    return (char) ('a' + i);
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
