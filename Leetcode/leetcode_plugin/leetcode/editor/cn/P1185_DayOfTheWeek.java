//给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。 
//
// 输入为三个整数：day、month 和 year，分别表示日、月、年。 
//
// 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
//"Friday", "Saturday"}。 
//
// 
//
// 示例 1： 
//
// 输入：day = 31, month = 8, year = 2019
//输出："Saturday"
// 
//
// 示例 2： 
//
// 输入：day = 18, month = 7, year = 1999
//输出："Sunday"
// 
//
// 示例 3： 
//
// 输入：day = 15, month = 8, year = 1993
//输出："Sunday"
// 
//
// 
//
// 提示： 
//
// 
// 给出的日期一定是在 1971 到 2100 年之间的有效日期。 
// 
//
// Related Topics数学 
//
// 👍 176, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 一周中的第几天
 * @author ambrose
 * @date 2024-10-14 22:23:01
 */

public class P1185_DayOfTheWeek{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1185_DayOfTheWeek().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//		 Zeller公式：
//如果月份是 1月或2月，则将年份减1，月份分别改为 13或14。
//其中：
//h 是结果，表示日期对应的星期几。 h = 0 表示 Saturday，1 表示 Sunday，以此类推。
//day 是日期的天数。
//m 是月份，若为1月或2月则需要换算为13或14。
//K 是年份的后两位数（year % 100）。
//J 是年份的前两位数（year // 100）。
	public String dayOfTheWeek(int day, int month, int year) {
		// 如果月份是1月或2月，调整为13或14，年份减1
		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}

		int K = year % 100;  // 年份的后两位
		int J = year / 100;  // 年份的前两位

		// Zeller公式计算
		int h = (day + (13 * (month + 1)) / 5 + K + K / 4 + J / 4 - 2 * J) % 7;

		// 防止 h 出现负数
		h = (h + 7) % 7;

		// Zeller公式的结果映射到星期几
		String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

		return daysOfWeek[h];  // 返回计算出的星期几
	}
}

//class Solution {
//	public String dayOfTheWeek(int day, int month, int year) {
//		String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
//		/* 输入年份之前的年份的天数贡献 */
//		int days = 365 * (year - 1971) + (year - 1969) / 4;
//		/* 输入年份中，输入月份之前的月份的天数贡献 */
//		for (int i = 0; i < month - 1; ++i) {
//			days += monthDays[i];
//		}
//		if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
//			days += 1;
//		}
//		/* 输入月份中的天数贡献 */
//		days += day;
//		return week[(days + 3) % 7];
//	}
//}
//leetcode submit region end(Prohibit modification and deletion)

}