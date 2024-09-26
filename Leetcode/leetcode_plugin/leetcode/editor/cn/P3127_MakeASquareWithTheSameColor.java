//给你一个二维 3 x 3 的矩阵 grid ，每个格子都是一个字符，要么是 'B' ，要么是 'W' 。字符 'W' 表示白色，字符 'B' 表示黑色。 
//
// 你的任务是改变 至多一个 格子的颜色，使得矩阵中存在一个 2 x 2 颜色完全相同的正方形。
// 
//
// 如果可以得到一个相同颜色的 2 x 2 正方形，那么返回 true ，否则返回 false 。 
//
// 
// 
// 
// 示例 1： 
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
// 输入：grid = [["B","W","B"],["B","W","W"],["B","W","B"]] 
// 
//
// 输出：true 
//
// 解释： 
//
// 修改 grid[0][2] 的颜色，可以满足要求。 
//
// 示例 2： 
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
// 输入：grid = [["B","W","B"],["W","B","W"],["B","W","B"]] 
// 
//
// 输出：false 
//
// 解释： 
//
// 只改变一个格子颜色无法满足要求。 
//
// 示例 3： 
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
// 输入：grid = [["B","W","B"],["B","W","W"],["B","W","W"]] 
// 
//
// 输出：true 
//
// 解释： 
//
// grid 已经包含一个 2 x 2 颜色相同的正方形了。
// 
//
// 
//
// 提示： 
//
// 
// grid.length == 3 
// grid[i].length == 3 
// grid[i][j] 要么是 'W' ，要么是 'B' 。 
// 
//
// Related Topics数组 | 枚举 | 矩阵 
//
// 👍 20, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 构造相同颜色的正方形
 * @author ambrose
 * @date 2024-09-25 18:40:18
 */
public class P3127_MakeASquareWithTheSameColor{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3127_MakeASquareWithTheSameColor().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public boolean canMakeSquare(char[][] grid) {
	int length = grid.length, width = grid[0].length;
	for(int i = 0; i < width - 1; i++){
		for(int j = 0; j < length - 1; j++){
			int countB = 0, countW = 0;
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					if (grid[i + x][j + y] == 'B') countB++;
					else countW++;
				}
			}
			// 检查是否存在相同颜色的格子
			if (countB >= 3 || countW >= 3) return true;
		}
	}
	return false;
	}
	 }
/*	异或操作对不同字符不会返回 0
	字符型变量的异或操作（^）会将字符的 Unicode 值进行逐位比较。如果两个相应的位相同，结果为 0；如果不同，结果为 1。最后，结果将转换回字符。
	例如，假设有两个字符：
	  01000001  (A)
	^ 01000010  (B)
	------------
	  00000011  (C)
	*/
//    public boolean canMakeSquare(char[][] grid) {
//		int length = grid.length, width = grid[0].length;
//		for(int i = 0; i < width - 1; i++){
//			for(int j = 0; j < length - 1; j++){
//				if(grid[i][j]^grid[i][j + 1]^grid[i + 1][j]^grid[i + 1][j + 1] == 0)
//					return true;
//			}
//		}
//		return false;
//    }

//leetcode submit region end(Prohibit modification and deletion)

}
