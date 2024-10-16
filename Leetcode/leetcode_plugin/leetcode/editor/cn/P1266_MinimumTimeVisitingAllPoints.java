//平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi] 。请你计算访问所有这些点需要的 最小时间（以秒为单位）。 
//
// 你需要按照下面的规则在平面上移动： 
//
// 
// 每一秒内，你可以： 
// 
// 沿水平方向移动一个单位长度，或者 
// 沿竖直方向移动一个单位长度，或者 
// 跨过对角线移动 sqrt(2) 个单位长度（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。 
// 
// 必须按照数组中出现的顺序来访问这些点。 
// 在访问某个点时，可以经过该点后面出现的点，但经过的那些点不算作有效访问。 
// 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：points = [[1,1],[3,4],[-1,0]]
//输出：7
//解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> 
//[-1,0]   
//从 [1,1] 到 [3,4] 需要 3 秒 
//从 [3,4] 到 [-1,0] 需要 4 秒
//一共需要 7 秒 
//
// 示例 2： 
//
// 
//输入：points = [[3,2],[-2,2]]
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// points.length == n 
// 1 <= n <= 100 
// points[i].length == 2 
// -1000 <= points[i][0], points[i][1] <= 1000 
// 
//
// Related Topics几何 | 数组 | 数学 
//
// 👍 110, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 访问所有点的最小时间
 * @author ambrose
 * @date 2024-10-14 23:01:13
 */

public class P1266_MinimumTimeVisitingAllPoints{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1266_MinimumTimeVisitingAllPoints().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
		int ans = 0;
		for (int i = 1; i < points.length; i++) {
			int min = Math.min(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
			int add = Math.abs(Math.abs(points[i][0] - points[i - 1][0]) - Math.abs(points[i][1] - points[i - 1][1]));
			ans += min + add;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}