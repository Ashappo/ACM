//给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。 
//
// 例如： 
//
// 
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28 
//... 
//
// 
//
// 示例 1: 
//
// 
//输入: columnTitle = "A"
//输出: 1
// 
//
// 示例 2: 
//
// 
//输入: columnTitle = "AB"
//输出: 28
// 
//
// 示例 3: 
//
// 
//输入: columnTitle = "ZY"
//输出: 701 
//
// 
//
// 提示： 
//
// 
// 1 <= columnTitle.length <= 7 
// columnTitle 仅由大写英文组成 
// columnTitle 在范围 ["A", "FXSHRXW"] 内 
// 
//
// Related Topics数学 | 字符串 
//
// 👍 412, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * Excel 表列序号
 * @author ambrose
 * @date 2024-09-22 19:42:27
 */
public class P171_ExcelSheetColumnNumber{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P171_ExcelSheetColumnNumber().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int titleToNumber(String columnTitle) {
		int len = columnTitle.length(), ans = 0;
		int[] res = new	int[len + 1];
		for(int i = 0; i < len; i++){
			res[len - i - 1] = columnTitle.charAt(i) - 'A' + 1;
			ans += res[len - i - 1] * (int)Math.pow(26, len - i - 1);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
