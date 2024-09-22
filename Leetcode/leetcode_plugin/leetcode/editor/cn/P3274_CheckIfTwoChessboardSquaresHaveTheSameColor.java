//给你两个字符串 coordinate1 和 coordinate2，代表 8 x 8 国际象棋棋盘上的两个方格的坐标。 
//
// 以下是棋盘的参考图。 
//
// 
//
// 如果这两个方格颜色相同，返回 true，否则返回 false。 
//
// 坐标总是表示有效的棋盘方格。坐标的格式总是先字母（表示列），再数字（表示行）。 
//
// 
//
// 示例 1： 
//
// 
// 输入： coordinate1 = "a1", coordinate2 = "c3" 
// 
//
// 输出： true 
//
// 解释： 
//
// 两个方格均为黑色。 
//
// 示例 2： 
//
// 
// 输入： coordinate1 = "a1", coordinate2 = "h3" 
// 
//
// 输出： false 
//
// 解释： 
//
// 方格 "a1" 是黑色，而 "h3" 是白色。 
//
// 
//
// 提示： 
//
// 
// coordinate1.length == coordinate2.length == 2 
// 'a' <= coordinate1[0], coordinate2[0] <= 'h' 
// '1' <= coordinate1[1], coordinate2[1] <= '8' 
// 
//
// Related Topics数学 | 字符串 
//
// 👍 2, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 检查棋盘方格颜色是否相同
 * @author ambrose
 * @date 2024-09-22 15:31:37
 */
public class P3274_CheckIfTwoChessboardSquaresHaveTheSameColor{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P3274_CheckIfTwoChessboardSquaresHaveTheSameColor().new Solution();
		 String coordinate1 = "a1", coordinate2 = "c3";
		 String coordinate3 = "a1", coordinate4 = "h3";
		 String coordinate5 = "h7", coordinate6 = "c8";
		 System.out.println(solution.checkTwoChessboards(coordinate1,coordinate2));
		 System.out.println(solution.checkTwoChessboards(coordinate3,coordinate4));
		 System.out.println(solution.checkTwoChessboards(coordinate5,coordinate6));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
		char s0 = coordinate1.charAt(0);
		char ss0 = coordinate2.charAt(0);
		char s1 = coordinate1.charAt(1);
		char ss1 = coordinate2.charAt(1);
		return check(s0, s1) == check(ss0, ss1);
    }
	public int check(char s0, char s1){
		int a0 = s0 - 'a';
		int a1 = s1 - '1';
		return (a0 + a1)%2;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
