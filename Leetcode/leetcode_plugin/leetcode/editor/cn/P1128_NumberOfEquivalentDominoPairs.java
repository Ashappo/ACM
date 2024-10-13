//给你一组多米诺骨牌 dominoes 。
//
// 形式上，dominoes[i] = [a, b] 与 dominoes[j] = [c, d] 等价 当且仅当 (a == c 且 b == d) 或者 
//(a == d 且 b == c) 。即一张骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌。 
//
// 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i,
// j) 的数量。 
//
// 
//
// 示例 1： 
//
// 
//输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// 1 <= dominoes.length <= 4 * 10⁴ 
// dominoes[i].length == 2 
// 1 <= dominoes[i][j] <= 9 
// 
//
// Related Topics数组 | 哈希表 | 计数 
//
// 👍 163, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 等价多米诺骨牌对的数量
 * @author ambrose
 * @date 2024-10-13 21:17:30
 */

public class P1128_NumberOfEquivalentDominoPairs{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1128_NumberOfEquivalentDominoPairs().new Solution();
	 }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int numEquivDominoPairs(int[][] dominoes) {
//二元对中的元素均不大于 9，因此我们可以将每一个二元对拼接成一个两位的正整数，即 (x,y)→10x+y。这样就无需使用哈希表统计元素数量，而直接使用长度为 100 的数组即可。

		int[] num = new int[100];
		int ret = 0;
		for (int[] domino : dominoes) {
			int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
//组合：C(n,2) = n * (n - 1) / 2
//等差数列公式：0 + 1 + 2 + 3+...+ (n-1) = n * (n - 1) / 2
			ret += num[val];
			num[val]++;
		}
		return ret;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}