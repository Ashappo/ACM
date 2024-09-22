//有 `N` 位扣友参加了微软与力扣举办了「以扣会友」线下活动。主办方提供了 `2*N` 道题目，整型数组 `questions` 中每个数字对应了每道题目所
//涉及的知识点类型。
//若每位扣友选择不同的一题，请返回被选的 `N` 道题目至少包含多少种知识点类型。
//
//**示例 1：**
//
//> 输入：`questions = [2,1,6,2]`
//>
//> 输出：`1`
//>
//> 解释：有 2 位扣友在 4 道题目中选择 2 题。
//> 可选择完成知识点类型为 2 的题目时，此时仅一种知识点类型
//> 因此至少包含 1 种知识点类型。
//
//**示例 2：**
//
//> 输入：`questions = [1,5,1,3,4,5,2,5,3,3,8,6]`
//>
//> 输出：`2`
//>
//> 解释：有 6 位扣友在 12 道题目中选择题目，需要选择 6 题。
//> 选择完成知识点类型为 3、5 的题目，因此至少包含 2 种知识点类型。
//
//**提示：**
//- `questions.length == 2*n`
//- `2 <= questions.length <= 10^5`
//- `1 <= questions[i] <= 1000`
//
// Related Topics贪心 | 数组 | 哈希表 | 排序 
//
// 👍 22, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 完成一半题目
 * @author ambrose
 * @date 2024-09-22 16:13:27
 */
public class PLCS02_WqXACV{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new PLCS02_WqXACV().new Solution();
		  int[ ] questions = {1,5,1,3,4,5,2,5,3,3,8,6};
		  System.out.println(solution.halfQuestions(questions));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int halfQuestions(int[] questions) {
		int len = questions.length / 2;
		HashMap<Integer, Integer> table = new HashMap<>();
		for(int num : questions){
			table.put(num, table.getOrDefault(num, 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(table.entrySet());
		sortedList.sort((a1, a2) -> a2.getValue().compareTo(a1.getValue()));
		int res = 0;
		for(Map.Entry<Integer, Integer> list : sortedList){
			if(len <= 0) {
				return res;
			}
			len -= list.getValue();
			res++;
		}
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
