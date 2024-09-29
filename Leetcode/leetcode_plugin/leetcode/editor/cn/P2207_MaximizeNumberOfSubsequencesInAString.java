//给你一个下标从 0 开始的字符串 text 和另一个下标从 0 开始且长度为 2 的字符串 pattern ，两者都只包含小写英文字母。 
//
// 你可以在 text 中任意位置插入 一个 字符，这个插入的字符必须是 pattern[0] 或者 pattern[1] 。注意，这个字符可以插入在 
//text 开头或者结尾的位置。 
//
// 请你返回插入一个字符后，text 中最多包含多少个等于 pattern 的 子序列 。 
//
// 子序列 指的是将一个字符串删除若干个字符后（也可以不删除），剩余字符保持原本顺序得到的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：text = "abdcdbc", pattern = "ac"
//输出：4
//解释：
//如果我们在 text[1] 和 text[2] 之间添加 pattern[0] = 'a' ，那么我们得到 "abadcdbc" 。那么 "ac" 作为子序
//列出现 4 次。
//其他得到 4 个 "ac" 子序列的方案还有 "aabdcdbc" 和 "abdacdbc" 。
//但是，"abdcadbc" ，"abdccdbc" 和 "abdcdbcc" 这些字符串虽然是可行的插入方案，但是只出现了 3 次 "ac" 子序列，所以不
//是最优解。
//可以证明插入一个字符后，无法得到超过 4 个 "ac" 子序列。
// 
//
// 示例 2： 
//
// 
//输入：text = "aabb", pattern = "ab"
//输出：6
//解释：
//可以得到 6 个 "ab" 子序列的部分方案为 "aaabb" ，"aaabb" 和 "aabbb" 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10⁵ 
// pattern.length == 2 
// text 和 pattern 都只包含小写英文字母。 
// 
//
// Related Topics贪心 | 字符串 | 前缀和 
//
// 👍 47, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 字符串中最多数目的子序列
 * @author ambrose
 * @date 2024-09-24 15:20:01
 */
public class P2207_MaximizeNumberOfSubsequencesInAString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2207_MaximizeNumberOfSubsequencesInAString().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	/**
	 * 关键在于考虑到pattern[0]插入最左侧是最多可能，以及pattern[1]插入最右侧是最多可能,所以计算Math.max(p0Cnt, p1Cnt)就是插入增加的最多可能。
	 * 以及先+再更新cnt，避免pattern[0] == pattern[1]时更新错误
	 *
	 * 首先计算插入之前的 pattern 子序列的个数，然后计算因为插入字母额外增加的 pattern 子序列的个数。
	 * 设 x=pattern[0], y=pattern[1]。
	 * 遍历 text 统计答案：遇到 y 时，如果左边出现了 3 个 x，那么就意味着我们找到了 3 个 pattern 子序列，把 3 加入答案。一般地，在遍历 text 的同时，维护 x 的出现次数 cntX。遇到 y 时，把 cntX 加入答案。
	 * 然后考虑插入字母。
	 * 根据题意，x 插入的位置越靠左，pattern 子序列的个数越多；y 插入的位置越靠右，pattern 子序列的个数越多。那么 x 应插在 text 最左侧，y 应插在 text 最右侧。
	 * 分类讨论：
	 * 把 x 插在 text 最左侧：答案额外增加 cntY，其中 cntY 是 y 在 text 中的出现次数。
	 * 把 y 插在 text 最右侧：答案额外增加 cntX，其中 cntX 是 x 在 text 中的出现次数。
	 * ⚠注意：代码没有特判 x=y 的情况，要先更新答案，再更新 cntX，这可以保证更新答案时 cntX 表示的是当前字母左边的 x 的出现次数，cntX 尚未计入当前字母。
	 * */
	public long maximumSubsequenceCount(String text, String pattern) {
		char p0 = pattern.charAt(0), p1 = pattern.charAt(1);
		int p0Cnt = 0, p1Cnt = 0;
		long cnt = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == p1){
				cnt += p0Cnt;
				p1Cnt++;
			}
			if(text.charAt(i) == p0)
				p0Cnt++;
		}
		return Math.max(p0Cnt, p1Cnt) + cnt;
	}
//TLE超时
/*    public long maximumSubsequenceCount(String text, String pattern) {
		char p0 = pattern.charAt(0);
		char p1 = pattern.charAt(1);
		// 计算当前的子序列数
		long initialCount = maxHalfCount(text, p0, p1);
		long maxCount = initialCount;

		for(int i = 0; i <= text.length(); i++){
			String s0 = text.substring(0, i) + p0 + text.substring(i);
			String s1 = text.substring(0, i) + p1 + text.substring(i);
			maxCount = Math.max(maxCount,maxHalfCount(s0, p0, p1));
			maxCount = Math.max(maxCount,maxHalfCount(s1, p0, p1));
		}
		return maxCount;
    }

	public long maxHalfCount(String text, char p0, char p1){
		int p0Count = 0, cnt = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == p1){
				cnt += p0Count;
			}
			if(text.charAt(i) == p0){
				p0Count++;
			}
		}
		return cnt;
	}*/
}
//leetcode submit region end(Prohibit modification and deletion)

}
