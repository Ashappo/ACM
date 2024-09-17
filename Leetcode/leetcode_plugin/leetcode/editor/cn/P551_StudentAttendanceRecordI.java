//给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符： 
//
// 
// 'A'：Absent，缺勤 
// 'L'：Late，迟到 
// 'P'：Present，到场 
// 
//
// 如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励： 
//
// 
// 按 总出勤 计，学生缺勤（'A'）严格 少于两天。 
// 学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。 
// 
//
// 如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PPALLP"
//输出：true
//解释：学生缺勤次数少于 2 次，且不存在 3 天或以上的连续迟到记录。
// 
//
// 示例 2： 
//
// 
//输入：s = "PPALLL"
//输出：false
//解释：学生最后三天连续迟到，所以不满足出勤奖励的条件。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s[i] 为 'A'、'L' 或 'P' 
// 
//
// Related Topics字符串 
//
// 👍 168, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 学生出勤记录 I
 * @author ambrose
 * @date 2024-09-17 19:31:55
 */
public class P551_StudentAttendanceRecordI{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P551_StudentAttendanceRecordI().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkRecord(String s) {
		int a = 0, p = 0;
		for(char c: s.toCharArray()){
			if(c == 'A'){
				a++; p = 0;
			}
			else if(c == 'L'){
				p++;
			}
			else p = 0;
			if(a > 1 || p >= 3) return false;
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
