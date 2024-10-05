//给你一个字符串 paragraph 和一个表示禁用词的字符串数组 banned ，返回出现频率最高的非禁用词。题目数据 保证 至少存在一个非禁用词，且答案 
//唯一 。 
//
// paragraph 中的单词 不区分大小写 ，答案应以 小写 形式返回。 
//
// 
//
// 示例 1： 
//
// 
//输入：paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", 
//banned = ["hit"]
//输出："ball"
//解释：
//"hit" 出现了 3 次，但它是禁用词。
//"ball" 出现了两次（没有其他单词出现这么多次），因此它是段落中出现频率最高的非禁用词。
//请注意，段落中的单词不区分大小写，
//标点符号会被忽略（即使它们紧挨着单词，如 "ball,"），
//并且尽管 "hit" 出现的次数更多，但它不能作为答案，因为它是禁用词。
// 
//
// 示例 2： 
//
// 
//输入：paragraph = "a.", banned = []
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= paragraph.length <= 1000 
// paragraph 由英文字母、空格 ' '、和以下符号组成："!?',;." 
// 0 <= banned.length <= 100 
// 1 <= banned[i].length <= 10 
// banned[i] 仅由小写英文字母组成 
// 
//
// Related Topics数组 | 哈希表 | 字符串 | 计数 
//
// 👍 245, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

/**
 * 最常见的单词
 * @author ambrose
 * @date 2024-10-05 14:56:02
 */

public class P0819_MostCommonWord{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0819_MostCommonWord().new Solution();
		  String pa = "Bob. hIt, baLl";
		 String[] banned = {"bob", "hit"};
		 System.out.println(solution.mostCommonWord(pa, banned));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
		HashMap<String, Integer> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		for (String s:
			 banned) {
			set.add(s);
		}
		for (int i = 0; i < paragraph.length(); i++) {
			StringBuilder sb = new StringBuilder();
			while(i < paragraph.length() && Character.isLetter(paragraph.charAt(i))){
				sb.append(Character.toLowerCase(paragraph.charAt(i)));
				i++;
			}
			String ss = sb.toString();
			//这里缺一点判断，ss是否为空串。连续的.?.这种会一直插入空字符串，但是不加判断也会加入map中。
//			if(!set.contains(ss))
			if(ss.length() > 0 && !set.contains(ss))
				map.put(ss, map.getOrDefault(ss, 0) + 1);
		}
		// 将 HashMap 按值（出现次数）进行排序，获取出现最多的单词
		return map.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.get()
				.getKey();
//		过于麻烦
//		List<Map.Entry<String, Integer>> ls = new ArrayList<>(map.entrySet());
//		ls.sort((a, b) -> b.getValue() - a.getValue());
//		for(Map.Entry<String, Integer> entry : ls){
//			return entry.getKey();
//		}
//		return "-1";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}