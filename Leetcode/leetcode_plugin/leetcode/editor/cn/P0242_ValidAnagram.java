//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的 字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
//
// Related Topics哈希表 | 字符串 | 排序 
//
// 👍 949, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的字母异位词
 * @author ambrose
 * @date 2024-09-17 09:20:00
 */
public class P0242_ValidAnagram{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0242_ValidAnagram().new Solution();
		  String s = "anagram", t = "nagaram";
		  System.out.println(solution.isAnagram(s, t));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		Map<Character, Integer> table = new HashMap<>();
		int value = 0;
		for(char c : s.toCharArray()){
			if(table.containsKey(c))
				table.put(c, table.get(c) + 1);
			else table.put(c, 1);
		}
		for(char c : t.toCharArray()){
			if(!table.containsKey(c)) return false;
			else if(table.get(c) != 1){
				table.put(c, table.get(c) - 1);
			}
			else if(table.get(c) == 1){
				table.remove(c);
			}
		}
		if(!table.isEmpty()) return false;
		else return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
