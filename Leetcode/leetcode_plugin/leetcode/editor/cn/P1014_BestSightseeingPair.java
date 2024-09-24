//给你一个正整数数组 values，其中 values[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的 距离 为 j - i。 
//
// 一对景点（i < j）组成的观光组合的得分为 values[i] + values[j] + i - j ，也就是景点的评分之和 减去 它们两者之间的距离
//。 
//
// 返回一对观光景点能取得的最高分。 
//
// 
//
// 示例 1： 
//
// 
//输入：values = [8,1,5,2,6]
//输出：11
//解释：i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11
// 
//
// 示例 2： 
//
// 
//输入：values = [1,2]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 2 <= values.length <= 5 * 10⁴ 
// 1 <= values[i] <= 1000 
// 
//
// Related Topics数组 | 动态规划 
//
// 👍 402, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 最佳观光组合
 * @author ambrose
 * @date 2024-09-23 08:33:44
 */
public class P1014_BestSightseeingPair{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1014_BestSightseeingPair().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
		//将结果分为（value[i] + i） + (value[j] - j),可拆分为取两个数的最大值，需注意i<j，
		// 但是在for循环中，先更新maxAns，再更新maxI即可确保i<j.
		int maxI = values[0], maxAns = 0;//初始化maxI为value[0] + 0
		for(int i = 1; i < values.length; i++){
			maxAns = Math.max(maxAns, maxI + values[i] - i);//先更新结果
			maxI = Math.max(maxI, values[i] + i);//再更新maxI
		}
		return maxAns;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
