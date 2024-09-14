//给你一个下标从 0 开始的整数数组 nums 。 
//
// 一开始，所有下标都没有被标记。你可以执行以下操作任意次： 
//
// 
// 选择两个 互不相同且未标记 的下标 i 和 j ，满足 2 * nums[i] <= nums[j] ，标记下标 i 和 j 。 
// 
//
// 请你执行上述操作任意次，返回 nums 中最多可以标记的下标数目。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,5,2,4]
//输出：2
//解释：第一次操作中，选择 i = 2 和 j = 1 ，操作可以执行的原因是 2 * nums[2] <= nums[1] ，标记下标 2 和 1 。
//没有其他更多可执行的操作，所以答案为 2 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [9,2,5,4]
//输出：4
//解释：第一次操作中，选择 i = 3 和 j = 0 ，操作可以执行的原因是 2 * nums[3] <= nums[0] ，标记下标 3 和 0 。
//第二次操作中，选择 i = 1 和 j = 2 ，操作可以执行的原因是 2 * nums[1] <= nums[2] ，标记下标 1 和 2 。
//没有其他更多可执行的操作，所以答案为 4 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [7,6,8]
//输出：0
//解释：没有任何可以执行的操作，所以答案为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// 1 <= nums[i] <= 10⁹ 
// 
//
// Related Topics贪心 | 数组 | 双指针 | 二分查找 | 排序 
//
// 👍 63, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 求出最多标记下标
 * @author ambrose
 * @date 2024-09-12 09:30:56
 */
import java.util.Arrays;

public class P2576_FindTheMaximumNumberOfMarkedIndices {
	public static void main(String[] args) {
		Solution solution = new P2576_FindTheMaximumNumberOfMarkedIndices().new Solution();
		int[] nums1 = {3, 5, 2, 4};
		int[] nums2 = {9, 2, 5, 4};
		int[] nums3 = {7, 6, 8};

		System.out.println(solution.maxNumOfMarkedIndices(nums1)); // 输出: 2
		System.out.println(solution.maxNumOfMarkedIndices(nums2)); // 输出: 4
		System.out.println(solution.maxNumOfMarkedIndices(nums3)); // 输出: 0
	}

	class Solution {
		public int maxNumOfMarkedIndices(int[] nums) {
			Arrays.sort(nums);  // 首先将数组排序
			int left = 0;  // 左指针
			int right = nums.length / 2;  // 右指针从数组中间开始
			int markedCount = 0;  // 记录标记的下标数目

			// 双指针遍历
			while (left < nums.length / 2 && right < nums.length) {
				if (2 * nums[left] <= nums[right]) {
					// 如果满足条件，标记一对下标
					markedCount += 2;  // 每次标记两对下标
					left++;
					right++;
				} else {
					// 否则，只移动右指针
					right++;
				}
			}

			return markedCount;
		}
	}
}

