//给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答案
//。
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 100 
// words[i] 由小写英文字母组成 
// 
//
// Related Topics数组 | 哈希表 | 字符串 
//
// 👍 377, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 查找共用字符
 * @author ambrose
 * @date 2024-10-10 22:59:01
 */

public class P1002_FindCommonCharacters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1002_FindCommonCharacters().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> commonChars(String[] words) {
		List<String> ls = new ArrayList<>();
		int[] ans = new int[26];
		Arrays.fill(ans, Integer.MAX_VALUE);
		for (int i = 0; i < words.length; i++) {
			int[] temp = new int[26];
			for (int j = 0; j < words[i].length(); j++) {
				temp[words[i].charAt(j) - 'a']++;
			}
			for (int j = 0; j < 26; j++) {
				ans[j] = Math.min(ans[j], temp[j]);
			}
		}
		for (int i = 0; i < 26; i++) {
			while(ans[i]-- != 0){
				ls.add(Character.toString((char) (i + 'a')));
			}
		}
		return ls;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}