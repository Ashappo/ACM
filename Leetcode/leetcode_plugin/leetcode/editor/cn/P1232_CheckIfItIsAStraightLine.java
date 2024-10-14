//给定一个数组 coordinates ，其中 coordinates[i] = [x, y] ，
// [x, y] 表示横坐标为 x、纵坐标为 y 的点。请你来判断，这些点是否在该坐标系中属于同一条直线上。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//输出：true
// 
//
// 示例 2： 
//
// 
//
// 
//输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 2 <= coordinates.length <= 1000 
// coordinates[i].length == 2 
// -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4 
// coordinates 中不含重复的点 
// 
//
// Related Topics几何 | 数组 | 数学 
//
// 👍 150, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 缀点成线
 * @author ambrose
 * @date 2024-10-14 22:55:23
 */

public class P1232_CheckIfItIsAStraightLine{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1232_CheckIfItIsAStraightLine().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//		 记数组 coordinates 中的点为 P 。为方便后续计算，将所有点向 (−P) 方向平移。记平移后的点为 P，其中 P位于坐标系原点 O 上。
//由于经过两点的直线有且仅有一条，我们以 P来确定这条直线。位于坐标系原点 O 上，直线过原点，故设其方程为 Ax+By=0，将 P坐标代入可得 A=P
//  是否在这条直线上，将其坐标代入直线方程即可。
	public boolean checkStraightLine(int[][] coordinates) {
		int deltaX = coordinates[0][0], deltaY = coordinates[0][1];
		int n = coordinates.length;
		for (int i = 0; i < n; i++) {
			coordinates[i][0] -= deltaX;
			coordinates[i][1] -= deltaY;
		}
		int A = coordinates[1][1], B = -coordinates[1][0];
		for (int i = 2; i < n; i++) {
			int x = coordinates[i][0], y = coordinates[i][1];
			if (A * x + B * y != 0) {
				return false;
			}
		}
		return true;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}