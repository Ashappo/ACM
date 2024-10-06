//给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。 
//
// 返回一个整数数组 answer ，其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的
//字符 c 的 距离 。 
//
// 两个下标 i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "loveleetcode", c = "e"
//输出：[3,2,1,0,1,0,0,1,2,2,1,0]
//解释：字符 'e' 出现在下标 3、5、6 和 11 处（下标从 0 开始计数）。
//距下标 0 最近的 'e' 出现在下标 3 ，所以距离为 abs(0 - 3) = 3 。
//距下标 1 最近的 'e' 出现在下标 3 ，所以距离为 abs(1 - 3) = 2 。
//对于下标 4 ，出现在下标 3 和下标 5 处的 'e' 都离它最近，但距离是一样的 abs(4 - 3) == abs(4 - 5) = 1 。
//距下标 8 最近的 'e' 出现在下标 6 ，所以距离为 abs(8 - 6) = 2 。
// 
//
// 示例 2： 
//
// 
//输入：s = "aaab", c = "b"
//输出：[3,2,1,0]
// 
//
// 
//提示：
//
// 
// 1 <= s.length <= 10⁴ 
// s[i] 和 c 均为小写英文字母 
// 题目数据保证 c 在 s 中至少出现一次 
// 
//
// Related Topics数组 | 双指针 | 字符串 
//
// 👍 361, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Map;

/**
 * 字符的最短距离
 * @author ambrose
 * @date 2024-10-05 18:22:33
 */

public class P0821_ShortestDistanceToACharacter{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0821_ShortestDistanceToACharacter().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shortestToChar(String s, char c) {
		int n = s.length();
		int[] ans = new int[n];
		//从左到右i - temp(暂存当前的c的位置。初始时应该有个默认值，i<=[0,n-1], i - temp|| temp -i默认值都应该大于等于n（一个超出正常范围的值）,所以temp分别为-n和2n)
		for (int i = 0, temp = -n; i < n; i++) {
			if(s.charAt(i) == c)
				temp = i;
			ans[i] = i - temp;
		}
		for (int i = n - 1, temp = 2 * n; i >= 0; i--) {
			if(s.charAt(i) == c){
				temp = i;
			}
			ans[i] = Math.min(ans[i], temp - i);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}