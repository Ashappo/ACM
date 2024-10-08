//句子 是一串由空格分隔的单词。每个 单词 仅由小写字母组成。 
//
// 如果某个单词在其中一个句子中恰好出现一次，在另一个句子中却 没有出现 ，那么这个单词就是 不常见的 。 
//
// 给你两个 句子 s1 和 s2 ，返回所有 不常用单词 的列表。返回列表中单词可以按 任意顺序 组织。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s1 = "this apple is sweet", s2 = "this apple is sour"
//输出：["sweet","sour"]
// 
//
// 示例 2： 
//
// 
//输入：s1 = "apple apple", s2 = "banana"
//输出：["banana"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s1.length, s2.length <= 200 
// s1 和 s2 由小写英文字母和空格组成 
// s1 和 s2 都不含前导或尾随空格 
// s1 和 s2 中的所有单词间均由单个空格分隔 
// 
//
// Related Topics哈希表 | 字符串 | 计数 
//
// 👍 201, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

/**
 * 两句话中的不常见单词
 * @author ambrose
 * @date 2024-10-06 17:41:37
 */

public class P0884_UncommonWordsFromTwoSentences{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0884_UncommonWordsFromTwoSentences().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	//其中一个为1，另一个为0，所以可以放在一个map里，直接算=1的就是。
class Solution {
	public String[] uncommonFromSentences(String s1, String s2) {
		Map<String, Integer> freq = new HashMap<String, Integer>();
		insert(s1, freq);
		insert(s2, freq);
		List<String> ans = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
			if (entry.getValue() == 1) {
				ans.add(entry.getKey());
			}
		}
		return ans.toArray(new String[0]);
	}

	public void insert(String s, Map<String, Integer> freq) {
//		基于空白字符（如空格、制表符、换行符等）分割字符串的正则表达式。让我们详细说明：
// \\s 是正则表达式中的一个元字符：
// \\s 匹配任何空白字符，包括：
//		空格 ( )
//		制表符 (\t)
//		换行符 (\n)
//		回车符 (\r)
//		换页符 (\f)
//		它是正则表达式中的一个预定义字符类。
//		+ 表示“一个或多个”：
//		在正则表达式中，+ 是量词，表示前面的元素可以匹配一个或多个。也就是说，\\s+ 可以匹配连续出现的一个或多个空白字符。
//		split("\\s+") 的作用：
//		当使用 split("\\s+") 时，Java 会将输入字符串中的一个或多个连续的空白字符视为分隔符，并将字符串按这些分隔符分割成多个子字符串。
//		比如 "hello world" 中有三个连续的空格，如果使用 split(" ") 会导致产生空字符串（因为空格之间没有字符），但使用 split("\\s+") 可以忽略多余的空格，正确分割为 ["hello", "world"]。
		String[] arr = s.split("\\s+");
//		String[] arr = s.split(" ");
		for (String word : arr) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}
	}
}

//class Solution {
//    public String[] uncommonFromSentences(String s1, String s2) {
//		HashMap<String, Integer> table1 = new HashMap<>();
//		HashMap<String, Integer> table2 = new HashMap<>();
//		List<String> ans = new ArrayList<>();
//		for (int i = 0; i < s1.length(); i++) {
//			StringBuilder sb = new StringBuilder();
//			while(i < s1.length() && Character.isLetter(s1.charAt(i))){
//				sb.append(s1.charAt(i));
//				i++;
//			}
//			if(sb.length() > 0)
//				table1.put(sb.toString(), table1.getOrDefault(sb.toString(), 0) + 1);
//		}
//		for (int i = 0; i < s2.length(); i++) {
//			StringBuilder sb = new StringBuilder();
//			while(i < s2.length() && Character.isLetter(s2.charAt(i))){
//				sb.append(s2.charAt(i));
//				i++;
//			}
//			if(sb.length() > 0)
//				table2.put(sb.toString(), table2.getOrDefault(sb.toString(), 0) + 1);
//		}
//		for(Map.Entry<String, Integer> entry : table1.entrySet()){
//			if(entry.getValue() == 1 && !table2.containsKey(entry.getKey()))
//				ans.add(entry.getKey());
//		}
//		for(Map.Entry<String, Integer> entry : table2.entrySet()){
//			if(entry.getValue() == 1 && !table1.containsKey(entry.getKey()))
//				ans.add(entry.getKey());
//		}
//		return ans.toArray(new String[0]);
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}