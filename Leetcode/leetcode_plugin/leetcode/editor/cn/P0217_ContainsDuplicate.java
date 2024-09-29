//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [1,2,3,1] 
// 
//
// 输出：true 
//
// 解释： 
//
// 元素 1 在下标 0 和 3 出现。 
//
// 示例 2： 
//
// 
// 输入：nums = [1,2,3,4] 
// 
//
// 输出：false 
//
// 解释： 
//
// 所有元素都不同。 
//
// 示例 3： 
//
// 
// 输入：nums = [1,1,1,3,3,4,3,2,4,2] 
// 
//
// 输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// Related Topics数组 | 哈希表 | 排序 
//
// 👍 1101, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashSet;

/**
 * 存在重复元素
 * @author ambrose
 * @date 2024-09-23 09:12:51
 */
public class P0217_ContainsDuplicate{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0217_ContainsDuplicate().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(int c: nums){
			if(set.contains(c)) return true;
			else{
				set.add(c);
			}
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
