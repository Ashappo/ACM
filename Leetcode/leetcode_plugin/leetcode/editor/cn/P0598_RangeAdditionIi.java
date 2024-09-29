//给你一个 m x n 的矩阵 M 和一个操作数组 op 。矩阵初始化时所有的单元格都为 0 。ops[i] = [ai, bi] 意味着当所有的 0 <= 
//x < ai 和 0 <= y < bi 时， M[x][y] 应该加 1。 
//
// 在 执行完所有操作后 ，计算并返回 矩阵中最大整数的个数 。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入: m = 3, n = 3，ops = [[2,2],[3,3]]
//输出: 4
//解释: M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
// 
//
// 示例 2: 
//
// 
//输入: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2]
//,[3,3],[3,3],[3,3]]
//输出: 4
// 
//
// 示例 3: 
//
// 
//输入: m = 3, n = 3, ops = []
//输出: 9
// 
//
// 
//
// 提示: 
//
// 
// 
//
// 
// 1 <= m, n <= 4 * 10⁴ 
// 0 <= ops.length <= 10⁴ 
// ops[i].length == 2 
// 1 <= ai <= m 
// 1 <= bi <= n 
// 
//
// Related Topics数组 | 数学 
//
// 👍 207, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 区间加法 II
 * @author ambrose
 * @date 2024-09-29 15:45:12
 */
 
public class P0598_RangeAdditionIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0598_RangeAdditionIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
		int[] cols = new int[n], rows = new int[m];
		for(int i = 0; i < ops.length; i++){
			for(int j = 0; j < 2; j++){
				if(j == 0){
					for(int k = 0; k < ops[i][0]; k++){
						rows[k] += 1;
					}
				}
				if(j == 1){
					for(int k = 0; k < ops[i][1]; k++){
						cols[k] += 1;
					}
				}
			}
		}
		int colCnt  = 1, rowCnt = 1, tempCol = rows[0], tempRow = cols[0];
		for(int i = 1; i < m; i++){
			if(tempRow == rows[i])
				rowCnt++;
			else break;
		}
		for(int i = 1; i < n; i++){
			if(tempCol == cols[i])
				colCnt++;
			else break;
		}
		return rowCnt * colCnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
