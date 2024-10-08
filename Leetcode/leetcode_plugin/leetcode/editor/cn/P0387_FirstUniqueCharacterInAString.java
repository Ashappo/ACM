//给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "leetcode"
//输出: 0
// 
//
// 示例 2: 
//
// 
//输入: s = "loveleetcode"
//输出: 2
// 
//
// 示例 3: 
//
// 
//输入: s = "aabb"
//输出: -1
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含小写字母 
// 
//
// Related Topics队列 | 哈希表 | 字符串 | 计数 
//
// 👍 754, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 字符串中的第一个唯一字符
 * @author ambrose
 * @date 2024-09-17 09:37:47
 */
public class P0387_FirstUniqueCharacterInAString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0387_FirstUniqueCharacterInAString().new Solution();

	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
		int[] ans = new	int[26];
		Arrays.fill(ans, -1);
		for(int i = 0; i < s.length(); i++){
			if(ans[s.charAt(i) - 'a'] != -1) ans[s.charAt(i)  -'a'] = -2;
			else if(ans[s.charAt(i) - 'a'] == -1) ans[s.charAt(i)  -'a'] = i;
		}
		int res = Integer.MAX_VALUE;
		for(int c : ans){
			if(c > -1 && c < res) res = c;
		}
		return res == Integer.MAX_VALUE ? -1 : res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
