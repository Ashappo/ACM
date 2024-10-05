//给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。 
//
// 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
//输出：true
//解释：
//在上述矩阵中, 其对角线为: 
//"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。 
//各条对角线上的所有元素均相同, 因此答案是 True 。
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[1,2],[2,2]]
//输出：false
//解释：
//对角线 "[1, 2]" 上的元素不同。 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 20 
// 0 <= matrix[i][j] <= 99 
// 
//
// 
//
// 进阶： 
//
// 
// 如果矩阵存储在磁盘上，并且内存有限，以至于一次最多只能将矩阵的一行加载到内存中，该怎么办？ 
// 如果矩阵太大，以至于一次只能将不完整的一行加载到内存中，该怎么办？ 
// 
//
// Related Topics数组 | 矩阵 
//
// 👍 322, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 托普利茨矩阵
 * @author ambrose
 * @date 2024-10-03 01:40:34
 */

public class P0766_ToeplitzMatrix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0766_ToeplitzMatrix().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length, dx = 1, dy = 1;
		for (int i = 0; i < m; i++) {
			int temp = matrix[i][0], x = 0, y = i;
			int mx = x + dx, my = y + dy;
			while(mx < n && my < m){
				if(matrix[my][mx] != temp){
					return false;
				}
				mx += dx; my += dy;
			}
		}

		for (int i = 1; i < n; i++) {
			int temp = matrix[0][i], x = i, y = 0;
			int mx = x + dx, my = y + dy;
			while(mx < n && my < m){
				if(matrix[my][mx] != temp){
					return false;
				}
				mx += dx; my += dy;
			}
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}