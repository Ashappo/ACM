//给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。 
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
//
// 示例 1： 
//
// 
//输入：columnNumber = 1
//输出："A"
// 
//
// 示例 2： 
//
// 
//输入：columnNumber = 28
//输出："AB"
// 
//
// 示例 3： 
//
// 
//输入：columnNumber = 701
//输出："ZY"
// 
//
// 示例 4： 
//
// 
//输入：columnNumber = 2147483647
//输出："FXSHRXW"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= columnNumber <= 2³¹ - 1 
// 
//
// Related Topics数学 | 字符串 
//
// 👍 693, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * Excel表列名称
 * @author ambrose
 * @date 2024-09-22 17:59:28
 */
public class P168_ExcelSheetColumnTitle{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P168_ExcelSheetColumnTitle().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//	调整对应关系，让0对应A，25对应Z，26对应AA，这样就构成了一个正常的26进位。
//这样对于A：0%26=0， 对于AA：26%26=0，在余数这里可以保持一致。
//新的对应关系是原先对应关系-1得到，所以在每次操作的时候，都要让columnNumber-1，得到新的对应关系。
    public String convertToTitle(int columnNumber) {
		StringBuilder str = new StringBuilder();
		while(columnNumber > 0){
			int c = (columnNumber - 1) % 26;
			str.insert(0, (char)(c + 'A'));
			columnNumber = (columnNumber - 1)/ 26;
		}
		return str.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
