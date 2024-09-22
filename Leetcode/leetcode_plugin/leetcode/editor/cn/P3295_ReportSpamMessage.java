//给你一个字符串数组 message 和一个字符串数组 bannedWords。 
//
// 如果数组中 至少 存在两个单词与 bannedWords 中的任一单词 完全相同，则该数组被视为 垃圾信息。 
//
// 如果数组 message 是垃圾信息，则返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
// 输入： message = ["hello","world","leetcode"], bannedWords = ["world","hello"] 
// 
//
// 输出： true 
//
// 解释： 
//
// 数组 message 中的 "hello" 和 "world" 都出现在数组 bannedWords 中。 
//
// 示例 2： 
//
// 
// 输入： message = ["hello","programming","fun"], bannedWords = ["world",
//"programming","leetcode"] 
// 
//
// 输出： false 
//
// 解释： 
//
// 数组 message 中只有一个单词（"programming"）出现在数组 bannedWords 中。 
//
// 
//
// 提示： 
//
// 
// 1 <= message.length, bannedWords.length <= 10⁵ 
// 1 <= message[i].length, bannedWords[i].length <= 15 
// message[i] 和 bannedWords[i] 都只由小写英文字母组成。 
// 
//
// 👍 1, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 举报垃圾信息
 * @author ambrose
 * @date 2024-09-22 15:15:04
 */
public class P3295_ReportSpamMessage{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3295_ReportSpamMessage().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
		HashMap<String, Integer> table = new HashMap();
		int cnt = 0;
		for(String s : bannedWords){
			table.put(s, 1);
		}
		for(String ss : message){
			if(table.containsKey(ss))
				cnt++;
			if(cnt >= 2) return true;
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
