//给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。 
//
// 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello World"
//输出：5
//解释：最后一个单词是“World”，长度为 5。
// 
//
// 示例 2： 
//
// 
//输入：s = "   fly me   to   the moon  "
//输出：4
//解释：最后一个单词是“moon”，长度为 4。
// 
//
// 示例 3： 
//
// 
//输入：s = "luffy is still joyboy"
//输出：6
//解释：最后一个单词是长度为 6 的“joyboy”。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅有英文字母和空格 ' ' 组成 
// s 中至少存在一个单词 
// 
//
// Related Topics字符串 
//
// 👍 720, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 最后一个单词的长度
 * @author ambrose
 * @date 2024-09-14 15:57:14
 */
public class P0058_LengthOfLastWord{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0058_LengthOfLastWord().new Solution();
		  String s1 = "Hello World", s2 = " fly me to the moon ", s3 = "luffy is still joyboy";
		  System.out.println(solution.lengthOfLastWord(s1));
		  System.out.println(solution.lengthOfLastWord(s2));
		  System.out.println(solution.lengthOfLastWord(s3));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
		String ss = new StringBuilder(s).reverse().toString();
		int cnt = 0;
		for(int i = 0, j = 0; i < ss.length(); i++){
			if(j == 1 & ss.charAt(i) == ' '){
				break;
			}else if(ss.charAt(i) != ' '){
				j = 1; cnt++;
			}
		}
		return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
