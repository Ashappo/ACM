//在
// n x n 的网格
// grid 中，我们放置了一些与 x，y，z 三轴对齐的
// 1 x 1 x 1 立方体。 
//
// 每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格 (i, j) 上。 
//
// 现在，我们查看这些立方体在 xy 、yz 和 zx 平面上的投影。 
//
// 投影 就像影子，将 三维 形体映射到一个 二维 平面上。从顶部、前面和侧面看立方体时，我们会看到“影子”。 
//
// 返回 所有三个投影的总面积 。 
//
// 
//
// 
// 
//
// 
// 
//
// 
// 
//
// 
// 
//
// 示例 1： 
//
// 
//
// 
//输入：[[1,2],[3,4]]
//输出：17
//解释：这里有该形体在三个轴对齐平面上的三个投影(“阴影部分”)。
// 
//
// 示例 2: 
//
// 
//输入：grid = [[2]]
//输出：5
// 
//
// 示例 3： 
//
// 
//输入：[[1,0],[0,2]]
//输出：8
// 
//
// 
//
// 提示： 
//
// 
// n == grid.length == grid[i].length 
// 1 <= n <= 50 
// 0 <= grid[i][j] <= 50 
// 
//
// Related Topics几何 | 数组 | 数学 | 矩阵 
//
// 👍 151, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 三维形体投影面积
 * @author ambrose
 * @date 2024-10-06 15:24:07
 */

public class P0883_ProjectionAreaOf3dShapes{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0883_ProjectionAreaOf3dShapes().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int projectionArea(int[][] grid) {
		int m = grid.length, n = grid[0].length, ans = 0, x = 0;
		int[] y = new int[m], z = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(grid[i][j] > 0){
					x++;
					y[i] = Math.max(y[i], grid[i][j]);
					z[j] = Math.max(z[j], grid[i][j]);
				}
			}
		}
		return Arrays.stream(y).sum() + Arrays.stream(z).sum() + x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}