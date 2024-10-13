//给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。返回该日期是当年的第几天。 
//
// 
//
// 示例 1： 
//
// 
//输入：date = "2019-01-09"
//输出：9
//解释：给定日期是2019年的第九天。 
//
// 示例 2： 
//
// 
//输入：date = "2019-02-10"
//输出：41
// 
//
// 
//
// 提示： 
//
// 
// date.length == 10 
// date[4] == date[7] == '-'，其他的 date[i] 都是数字 
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日 
// 
//
// Related Topics数学 | 字符串 
//
// 👍 145, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 一年中的第几天
 * @author ambrose
 * @date 2024-10-13 21:43:09
 */

public class P1154_DayOfTheYear{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1154_DayOfTheYear().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int dayOfYear(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8));
		int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			++amount[1];
		}
		int ans = 0;
		for (int i = 0; i < month - 1; i++) {
			ans += amount[i];
		}
		ans += day;
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}