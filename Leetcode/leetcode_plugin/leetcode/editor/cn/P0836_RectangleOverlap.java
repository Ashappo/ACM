//矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。矩形的上下边平行于 x 
//轴，左右边平行于 y 轴。 
//
// 如果相交的面积为 正 ，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。 
//
// 给出两个矩形 rec1 和 rec2 。如果它们重叠，返回 true；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：rec1 = [0,0,1,1], rec2 = [2,2,3,3]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// rect1.length == 4 
// rect2.length == 4 
// -10⁹ <= rec1[i], rec2[i] <= 10⁹ 
// rec1 和 rec2 表示一个面积不为零的有效矩形 
// 
//
// Related Topics几何 | 数学 
//
// 👍 309, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 矩形重叠
 * @author ambrose
 * @date 2024-10-05 22:00:29
 */

public class P0836_RectangleOverlap{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0836_RectangleOverlap().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//	首先判断矩形 rec1 和 rec2 的面积是否为 0。
//	对于矩形 rec1 而言，其面积为 0 当且仅当 rec1[0] == rec1[2] 或 rec1[1] == rec1[3]；
//	对于矩形 rec2 而言，其面积为 0 当且仅当 rec2[0] == rec2[2] 或 rec2[1] == rec2[3]。
//	如果至少有一个矩形的面积为 0，则一定没有重叠。
//	如果矩形 rec1 和 rec2 的面积都大于 0，则考虑两个矩形的位置。我们将上述四种情况翻译成代码。具体地，我们用 (rec[0], rec[1]) 表示矩形的左下角，(rec[2], rec[3]) 表示矩形的右上角，与题目描述一致。对于「左侧」，即矩形 rec1 在 x 轴上的最大值不能大于矩形 rec2 在 x 轴上最小值。对于「右侧」、「上方」以及「下方」同理。因此我们可以翻译成如下的代码：
//	左侧：rec1[2] <= rec2[0]；
//	右侧：rec1[0] >= rec2[2]；
//	上方：rec1[1] >= rec2[3]；
//	下方：rec1[3] <= rec2[1]。
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
			return false;
		}
		return !(rec1[2] <= rec2[0] ||   // left
				rec1[3] <= rec2[1] ||   // bottom
				rec1[0] >= rec2[2] ||   // right
				rec1[1] >= rec2[3]);    // top
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}