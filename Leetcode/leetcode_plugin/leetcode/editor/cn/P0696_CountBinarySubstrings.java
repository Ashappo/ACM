//给定一个字符串 s，统计并返回具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是成组连续的。 
//
// 重复出现（不同位置）的子串也要统计它们出现的次数。 
//
// 示例 1： 
//
// 
//输入：s = "00110011"
//输出：6
//解释：6 个子串满足具有相同数量的连续 1 和 0 ："0011"、"01"、"1100"、"10"、"0011" 和 "01" 。
//注意，一些重复出现的子串（不同位置）要统计它们出现的次数。
//另外，"00110011" 不是有效的子串，因为所有的 0（还有 1 ）没有组合在一起。 
//
// 示例 2： 
//
// 
//输入：s = "10101"
//输出：4
//解释：有 4 个子串："10"、"01"、"10"、"01" ，具有相同数量的连续 1 和 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] 为 '0' 或 '1' 
// 
//
// Related Topics双指针 | 字符串 
//
// 👍 559, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 计数二进制子串
 * @author ambrose
 * @date 2024-09-17 20:31:21
 */
public class P0696_CountBinarySubstrings{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0696_CountBinarySubstrings().new Solution();
		 String s = "00110011";
		 System.out.println(solution.countBinarySubstrings(s));
	 }
	 
//力扣代码
//leetcode submit region begin(P0rohibit modification and deletion)
class Solution {
	public int countBinarySubstrings(String s) {
		int len = s.length();
		int preGroup = 0; // 记录上一组连续0或1的长度
		int curGroup = 1; // 记录当前组连续0或1的长度（最开始有一个字符）
		int cnt = 0;     // 记录满足条件的子字符串数量
		// Step 2: 从第二个字符开始遍历
		for(int i = 1; i < len; i++){
			if(s.charAt(i) == s.charAt(i - 1))
				curGroup++;
			else {
				// 当前字符与前一个字符不同，意味着开始了新的一组
				// 比较相邻的两组，取较小的组数作为合法子串数量
				// 更新 preGroup 为当前组的长度，并将当前组的长度重置为 1
				cnt += Math.min(curGroup, preGroup); preGroup = curGroup; curGroup = 1;
			}
		}
		// 最后一次处理相邻的组（因为循环结束后，最后一组没有被比较）
		cnt += Math.min(curGroup, preGroup);
		return cnt;
	}
}
//class Solution {
//    public int countBinarySubstrings(String s) {
//		int len = s.length(), temp = 0, cnt = 0;
//		for(int i = 0; i < len - 1; i++){
//			temp = s.charAt(i) == '0' ? -1 : 1;
//			int j = i + 1;
//			while(j < len){
//				temp += s.charAt(j) == '0' ? -1 : 1;
//				//因为需要连续的1和0序列,所以检测到temp=0就不需要继续了。但仍是错误的，无法保证过程中是连续的0/1.
//				if(temp == 0) {
//					cnt++; break;
//				}
//				j++;
//			}
//		}
//		return cnt;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}
