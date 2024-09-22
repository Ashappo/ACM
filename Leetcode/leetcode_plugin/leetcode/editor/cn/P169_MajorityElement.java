//给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,2,3]
//输出：3 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,1,1,1,2,2]
//输出：2
// 
//
// 
//提示：
//
// 
// n == nums.length 
// 1 <= n <= 5 * 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。 
//
// Related Topics数组 | 哈希表 | 分治 | 计数 | 排序 
//
// 👍 2286, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 多数元素
 * @author ambrose
 * @date 2024-09-22 19:34:39
 */
public class P169_MajorityElement{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P169_MajorityElement().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
		int len = nums.length / 2;
		HashMap<Integer, Integer> table = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			int res = table.getOrDefault(nums[i], 0);
			if(res >= len)
				return nums[i];
			table.put(nums[i], res + 1);
		}
		return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
