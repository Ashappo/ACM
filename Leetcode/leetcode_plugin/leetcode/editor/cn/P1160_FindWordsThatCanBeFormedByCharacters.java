//给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。 
//
// 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。 
//
// 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。 
//
// 返回词汇表 words 中你掌握的所有单词的 长度之和。 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["cat","bt","hat","tree"], chars = "atach"
//输出：6
//解释： 
//可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
// 
//
// 示例 2： 
//
// 
//输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//输出：10
//解释：
//可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length, chars.length <= 100 
// 所有字符串中都仅包含小写英文字母 
// 
//
// Related Topics数组 | 哈希表 | 字符串 | 计数 
//
// 👍 190, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 拼写单词
 * @author ambrose
 * @date 2024-10-13 21:49:21
 */

public class P1160_FindWordsThatCanBeFormedByCharacters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1160_FindWordsThatCanBeFormedByCharacters().new Solution();
		  String[] words = new String[]{"cat","bt","hat","tree"};
		  String chars = "atach";
		  System.out.println(solution.countCharacters(words, chars));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countCharacters(String[] words, String chars) {
		int ans = 0;
		int[] alpet = new int[26];
		for (Character c : chars.toCharArray())
			alpet[c - 'a']++;
		for (int i = 0; i < words.length; i++) {
			int[] temp = Arrays.copyOf(alpet, 26);
//temp = alpet 这行实际上并没有创建一个新的 temp 数组，而是让 temp 指向了 alpet 的同一个内存地址。因此，当你修改 temp 时，alpet 也会同步改变，导致在后续的单词处理时 alpet 中的字符频次已经被修改，不能正确判断下一个单词。
//			int[] temp = alpet;
			int len = words[i].length();
			for (Character c : words[i].toCharArray()) {
				int cnt = c - 'a';
				if(--temp[cnt] < 0){
					len = 0;
					break;
				}
			}
			ans += len;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}