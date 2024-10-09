//某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。 
//
// 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 
//false。 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//输出：true
//解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。 
//
// 示例 2： 
//
// 
//输入：words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
//输出：false
//解释：在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。 
//
// 示例 3： 
//
// 
//输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
//输出：false
//解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅
//' 是空白字符，定义为比任何其他字符都小（更多信息）。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 20 
// order.length == 26 
// 在 words[i] 和 order 中的所有字符都是英文小写字母。 
// 
//
// Related Topics数组 | 哈希表 | 字符串 
//
// 👍 270, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 验证外星语词典
 * @author ambrose
 * @date 2024-10-08 22:25:17
 */

public class P0953_VerifyingAnAlienDictionary{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0953_VerifyingAnAlienDictionary().new Solution();
		  String[] words = {"hello","leetcode"};
		  String order = "hlabcdefgijkmnopqrstuvwxyz";
		  System.out.println(solution.isAlienSorted(words, order));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public boolean isAlienSorted(String[] words, String order) {
			HashMap<Character, Integer> map = new HashMap<>();

			// 创建字母表顺序的映射表
			for (int i = 0; i < order.length(); i++) {
				map.put(order.charAt(i), i);
			}

			// 遍历每一对相邻单词，检查它们是否按字典序排列
			for (int i = 1; i < words.length; i++) {
				String word1 = words[i - 1];
				String word2 = words[i];
				int len = Math.min(word1.length(), word2.length());

				boolean foundDifference = false;
				for (int j = 0; j < len; j++) {
					int pos1 = map.get(word1.charAt(j));
					int pos2 = map.get(word2.charAt(j));

					if (pos1 < pos2) {
						foundDifference = true;  // 找到正确的顺序
						break; // 继续比较下一个单词
					} else if (pos1 > pos2) {
						return false; // 找到不正确的顺序
					}
				}

				// 如果没有找到不同的字符但 word1 更长且是 word2 的前缀，返回 false
				if (!foundDifference && word1.length() > word2.length()) {
					return false;
				}
			}
			return true; // 所有单词都按顺序排列
		}
	}

//class Solution {
//    public boolean isAlienSorted(String[] words, String order) {
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < order.length(); i++) {
//			map.put(order.charAt(i), i);
//		}
//		for (int i = 1; i < words.length; i++) {
//			int len = Math.min(words[i].length(), words[i - 1].length());
//			for (int j = 0; j < len; j++) {
//				if (map.get(words[i].charAt(j)) - map.get(words[i - 1].charAt(j)) < 0){
//					return false;
//				}
//			}
//			if (words[i].length() < words[i - 1].length() && words[i].equals(words[i - 1].substring(0, len)))
//				return false;
//		}
//		return true;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}