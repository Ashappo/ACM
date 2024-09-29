//给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: num = -7
//输出: "-10"
// 
//
// 
//
// 提示： 
//
// 
// -10⁷ <= num <= 10⁷ 
// 
//
// Related Topics数学 
//
// 👍 223, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 七进制数
 * @author ambrose
 * @date 2024-09-29 14:52:07
 */
 
public class P0504_Base7{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0504_Base7().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToBase7(int num) {
		if (num == 0) return "0";
		String temp = "";
		StringBuilder sb = new StringBuilder();
		int res = 0;
		if(num < 0){
			num = Math.abs(num);
			temp = "-";
		}
		while(num > 0){
			res = num % 7;
			num /= 7;
			sb.insert(0, res);
		}
		return temp + sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
