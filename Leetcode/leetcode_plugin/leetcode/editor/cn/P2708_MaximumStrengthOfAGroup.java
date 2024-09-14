//给你一个下标从 0 开始的整数数组 nums ，它表示一个班级中所有学生在一次考试中的成绩。老师想选出一部分同学组成一个 非空 小组，且这个小组的 实力值 
//最大，如果这个小组里的学生下标为 i0, i1, i2, ... , ik ，那么这个小组的实力值定义为 nums[i0] * nums[i1] * nums[
//i2] * ... * nums[ik] 。 
//
// 请你返回老师创建的小组能得到的最大实力值为多少。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [3,-1,-5,2,5,-9]
//输出：1350
//解释：一种构成最大实力值小组的方案是选择下标为 [0,2,3,4,5] 的学生。实力值为 3 * (-5) * 2 * 5 * (-9) = 1350 ，这
//是可以得到的最大实力值。
// 
//
// 示例 2： 
//
// 输入：nums = [-4,-5,-4]
//输出：20
//解释：选择下标为 [0, 1] 的学生。得到的实力值为 20 。我们没法得到更大的实力值。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 13 
// -9 <= nums[i] <= 9 
// 
//
// Related Topics贪心 | 位运算 | 数组 | 动态规划 | 回溯 | 枚举 | 排序 
//
// 👍 58, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 一个小组的最大实力值
 * @author ambrose
 * @date 2024-09-14 23:21:44
 */
public class P2708_MaximumStrengthOfAGroup{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2708_MaximumStrengthOfAGroup().new Solution();
		  int[] nums1 = {3,-1,-5,2,5,-9};
		  int[] nums2 = {-4,-5,-4};
		  int[] nums3 = {-4,-4,0};
		  int[] nums4 = {0,0,1};
		  int[] nums5 = {6,-3,-4,8,4,7,6,4,7,7,-3,6,9};
		  System.out.println(solution.maxStrength(nums1));
		  System.out.println(solution.maxStrength(nums2));
		  System.out.println(solution.maxStrength(nums3));
		  System.out.println(solution.maxStrength(nums4));
		  System.out.println(solution.maxStrength(nums5));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long maxStrength(int[] nums) {
		Arrays.sort(nums);
		int pos = 0, zero = 0, nega = 0;
		long cnt = 1;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				pos++;
			} else if (nums[i] == 0) {
				zero = 1;
			} else if (nums[i] < 0) {
				nega++;
			}
		}
		if(pos > 0){
			for(int j = nums.length - 1; j > nums.length - 1 - pos; j--){
				cnt *= nums[j];
			}
			if(nega > 1) {
				if(nega%2 == 0){
					for(int j = 0; j < nega; j++){
						cnt *= nums[j];
					}
				}
				else{
					for(int j = 0; j < nega - 1; j++){
						cnt *= nums[j];
					}
				}
			}
		}
		else if(nega <= 1){
			if(zero == 1)
				cnt = 0;
			else cnt *= nums[0];
		}
		else if (nega > 1) {
			if(nega%2 == 0){
				for(int j = 0; j < nega; j++){
					cnt *= nums[j];
				}
			}
			else{
				for(int j = 0; j < nega - 1; j++){
					cnt *= nums[j];
				}
			}
		}
		return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
