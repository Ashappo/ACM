//给你一个整数数组 arr，如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [1,2,2,1,1,3]
//输出：true
//解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。 
//
// 示例 2： 
//
// 
//输入：arr = [1,2]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 1000 
// -1000 <= arr[i] <= 1000 
// 
//
// Related Topics数组 | 哈希表 
//
// 👍 232, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 独一无二的出现次数
 * @author ambrose
 * @date 2024-10-14 22:51:23
 */

public class P1207_UniqueNumberOfOccurrences{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1207_UniqueNumberOfOccurrences().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
		for (int c : arr){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(!set.contains(entry.getValue()))
				set.add(entry.getValue());
			else return false;
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}