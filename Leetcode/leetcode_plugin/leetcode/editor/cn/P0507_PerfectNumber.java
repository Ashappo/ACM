//对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。 
//
// 给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 28
//输出：true
//解释：28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, 和 14 是 28 的所有正因子。 
//
// 示例 2： 
//
// 
//输入：num = 7
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10⁸ 
// 
//
// Related Topics数学 
//
// 👍 208, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashSet;

/**
 * 完美数
 * @author ambrose
 * @date 2024-09-29 15:06:47
 */
 
public class P0507_PerfectNumber{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0507_PerfectNumber().new Solution();
		  int num = 28;
		  System.out.println(solution.checkPerfectNumber(num));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkPerfectNumber(int num) {
		int ans = 0;
		if(num == 1) return false;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i <= num / 2; i++){
			if(num % i == 0){
				set.add(i); set.add(num / i);
			}
		}
		for(int c : set)
			ans += c;
		if(ans == num * 2)
			return true;
		else return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
