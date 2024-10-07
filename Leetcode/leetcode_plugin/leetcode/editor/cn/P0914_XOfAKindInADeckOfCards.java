//给定一副牌，每张牌上都写着一个整数。 
//
// 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组： 
//
// 
// 每组都有 X 张牌。 
// 组内所有的牌上都写着相同的整数。 
// 
//
// 仅当你可选的 X >= 2 时返回 true。 
//
// 
//
// 示例 1： 
//
// 
//输入：deck = [1,2,3,4,4,3,2,1]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
// 
//
// 示例 2： 
//
// 
//输入：deck = [1,1,1,2,2,2,3,3]
//输出：false
//解释：没有满足要求的分组。
// 
//
// 提示： 
//
// 
// 1 <= deck.length <= 10⁴ 
// 0 <= deck[i] < 10⁴ 
// 
//
// Related Topics数组 | 哈希表 | 数学 | 计数 | 数论 
//
// 👍 303, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

/**
 * 卡牌分组
 * @author ambrose
 * @date 2024-10-06 20:17:38
 */

public class P0914_XOfAKindInADeckOfCards{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0914_XOfAKindInADeckOfCards().new Solution();
		  int[] ans = new int[]{1,1,1,1,2,2,2,2,2,2};
		  System.out.println(solution.hasGroupsSizeX(ans));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int c : deck){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int min = map.entrySet().stream()
				.min(Comparator.comparing(Map.Entry::getValue))
				.get()
				.getValue();
		if(min < 2) return false;
		boolean flag = false;
		for (int i = 2; i <= min; i++) {
			flag = false;
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				if(entry.getValue() % i == 0){
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag)
				return true;
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}