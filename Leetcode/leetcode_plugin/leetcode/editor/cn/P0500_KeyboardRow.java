//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
//
// Related Topics数组 | 哈希表 | 字符串 
//
// 👍 265, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 键盘行
 * @author ambrose
 * @date 2024-09-26 23:13:50
 */

public class P0500_KeyboardRow{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0500_KeyboardRow().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findWords(String[] words) {
		/**
		 * 我们为每一个英文字母标记其对应键盘上的行号，然后检测字符串中所有字符对应的行号是否相同。
		 * 我们可以预处理计算出每个字符对应的行号。
		 * 遍历字符串时，统一将大写字母转化为小写字母方便计算。
		* */
		List<String> ans = new ArrayList<String>();
		String pos = "12210111011122000010020202";
		for(int i = 0; i < words.length; i++){
			boolean flag = true;
			char c = pos.charAt(Character.toLowerCase(words[i].charAt(0)) - 'a');
			for(int j = 1; j < words[i].length(); j++){
				if(c != pos.charAt(Character.toLowerCase(words[i].charAt(j)) - 'a')){
					flag = false;
					break;
				}
			}
			if(flag)
				ans.add(words[i]);
		}
		String[] res = new String[ans.size()];
		for(int i = 0; i < ans.size(); i++)
			res[i] = ans.get(i);
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}