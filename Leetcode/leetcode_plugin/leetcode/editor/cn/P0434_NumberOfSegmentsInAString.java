//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
//
// Related Topics字符串 
//
// 👍 226, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 字符串中的单词数
 * @author ambrose
 * @date 2024-09-17 11:02:01
 */
public class P0434_NumberOfSegmentsInAString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0434_NumberOfSegmentsInAString().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSegments(String s) {
		int cnt = 0, flag = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' ') flag = 1;
			else if(s.charAt(i) == ' '){
				if(flag == 1){
					cnt++; flag = 0;
				}
			}
		}
		if(flag == 1) cnt++;
		return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
