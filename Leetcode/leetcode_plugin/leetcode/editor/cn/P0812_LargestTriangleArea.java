//给你一个由 X-Y 平面上的点组成的数组 points ，其中 points[i] = [xi, yi] 。从其中取任意三个不同的点组成三角形，返回能组成的
//最大三角形的面积。与真实值误差在 10⁻⁵ 内的答案将会视为正确答案。 
//
// 
//
// 示例 1： 
// 
// 
//输入：points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//输出：2.00000
//解释：输入中的 5 个点如上图所示，红色的三角形面积最大。
// 
//
// 示例 2： 
//
// 
//输入：points = [[1,0],[0,0],[0,1]]
//输出：0.50000
// 
//
// 
//
// 提示： 
//
// 
// 3 <= points.length <= 50 
// -50 <= xi, yi <= 50 
// 给出的所有点 互不相同 
// 
//
// Related Topics几何 | 数组 | 数学 
//
// 👍 200, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 最大三角形面积
 * @author ambrose
 * @date 2024-10-05 14:37:25
 */

public class P0812_LargestTriangleArea{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0812_LargestTriangleArea().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double largestTriangleArea(int[][] points) {
		double ans = 0.0;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				for (int k = j + 1; k < points.length; k++) {
					ans = Math.max(ans, cnt(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));
				}
			}
		}
		return ans;
    }
	public double cnt(int x1, int y1, int x2, int y2, int x3, int y3){
		return Math.abs(0.5 * (x1 * y2 + x2 * y3 + x3 * y1 - x3 * y2 - x2 * y1 - x1 * y3));
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}