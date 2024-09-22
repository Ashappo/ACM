//给定两个数组 nums1 和 nums2 ，返回 它们的 交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4]
//解释：[4,9] 也是可通过的
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
//
// Related Topics数组 | 哈希表 | 双指针 | 二分查找 | 排序 
//
// 👍 935, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 两个数组的交集
 * @author ambrose
 * @date 2024-09-22 20:16:44
 */
public class P349_IntersectionOfTwoArrays{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P349_IntersectionOfTwoArrays().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int c : nums1)
			set.add(c);

/*		for (int c : nums2) {
			if (set.contains(c)) {
				ans.add(c);
				//避免重复添加元素
				set.remove(c);
			}
		}
		// 将 ArrayList 转换为 int[] 数组
		int[] result = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			result[i] = ans.get(i);
		}
		return result;*/

		// 或者使用 Stream 处理 nums2，并找出交集
		return Arrays.stream(nums2)
				.filter(set::remove)  // 过滤 nums2 中存在于 set 中的元素，并从 set 中移除
				.distinct()            // 确保结果中的元素唯一
				.toArray();            // 转换为 int[] 数组
	}
}
//leetcode submit region end(Prohibit modification and deletion)
}
