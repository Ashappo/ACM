//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。 
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
//
// Related Topics哈希表 | 字符串 | 计数 
//
// 👍 914, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 赎金信
 * @author ambrose
 * @date 2024-09-17 09:33:53
 */
public class P0383_RansomNote{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0383_RansomNote().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		int[] ans = new int[26];
		for(char c : magazine.toCharArray()){
			ans[c - 'a']++;
		}
		for(char c : ransomNote.toCharArray()){
			if(--ans[c - 'a'] < 0) return false;
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
