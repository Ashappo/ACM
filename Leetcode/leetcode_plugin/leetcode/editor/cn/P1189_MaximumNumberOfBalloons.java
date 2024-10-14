//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 
//输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 
//输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10⁴ 
// text 全部由小写英文字母组成 
// 
//
// 
//
// 注意：本题与 2287. 重排字符形成目标字符串 相同。 
//
// Related Topics哈希表 | 字符串 | 计数 
//
// 👍 141, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

/**
 * “气球” 的最大数量
 * @author ambrose
 * @date 2024-10-14 22:32:31
 */

public class P1189_MaximumNumberOfBalloons{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1189_MaximumNumberOfBalloons().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxNumberOfBalloons(String text) {
		int ans = Integer.MAX_VALUE;
		int[] temp = new int[5];
		for (Character c: text.toCharArray()){
			if(c == 'a')
				temp[0]++;
			else if(c == 'b')
				temp[1]++;
			else if(c == 'l')
				temp[2]++;
			else if(c == 'o')
				temp[3]++;
			else if(c == 'n')
				temp[4]++;
		}
		for (int i = 0; i < temp.length; i++) {
			if(i == 2 || i == 3)
				ans = Math.min(ans, temp[i] / 2);
			else ans = Math.min(ans, temp[i]);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}