//给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，它们分别含有 n 和 m 个元素。请你计算以下两个数值： 
//
// 
// answer1：使得 nums1[i] 在 nums2 中出现的下标 i 的数量。 
// answer2：使得 nums2[i] 在 nums1 中出现的下标 i 的数量。 
// 
//
// 返回 [answer1, answer2]。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums1 = [2,3,2], nums2 = [1,2] 
// 
//
// 输出：[2,1] 
//
// 解释： 
//
// 
//
// 示例 2： 
//
// 
// 输入：nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6] 
// 
//
// 输出：[3,4] 
//
// 解释： 
//
// nums1 中下标在 1，2，3 的元素在 nums2 中也存在。所以 answer1 为 3。 
//
// nums2 中下标在 0，1，3，4 的元素在 nums1 中也存在。所以 answer2 为 4。 
//
// 示例 3： 
//
// 
// 输入：nums1 = [3,4,2,3], nums2 = [1,5] 
// 
//
// 输出：[0,0] 
//
// 解释： 
//
// nums1 和 nums2 中没有相同的数字，所以答案是 [0,0]。 
//
// 
//
// 提示： 
//
// 
// n == nums1.length 
// m == nums2.length 
// 1 <= n, m <= 100 
// 1 <= nums1[i], nums2[i] <= 100 
// 
//
// Related Topics数组 | 哈希表 
//
// 👍 36, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 找到两个数组中的公共元素
 * @author ambrose
 * @date 2024-09-25 20:24:45
 */
public class P2956_FindCommonElementsBetweenTwoArrays{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2956_FindCommonElementsBetweenTwoArrays().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> table1 = new HashMap<>();
		HashMap<Integer, Integer> table2 = new HashMap<>();
		int cnt1 = 0, cnt2 = 0;
		for(int i = 0; i < nums1.length; i++){
			table1.put(nums1[i], table1.getOrDefault(nums1[i], 0) + 1);
    	}
		for(int i = 0; i < nums2.length; i++){
			table2.put(nums2[i], table2.getOrDefault(nums2[i], 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : table2.entrySet()){
			if(table1.containsKey(entry.getKey())){
				cnt1 += table1.get(entry.getKey());
				cnt2 += entry.getValue();
			}
		}
		return new int[]{cnt1, cnt2};
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
