//给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。如果不能形成任何面积不为零的三角形，返回 0。
// 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,1,2]
//输出：5
//解释：你可以用三个边长组成一个三角形:1 2 2。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,1,10]
//输出：0
//解释：
//你不能用边长 1,1,2 来组成三角形。
//不能用边长 1,1,10 来构成三角形。
//不能用边长 1、2 和 10 来构成三角形。
//因为我们不能用任何三条边长来构成一个非零面积的三角形，所以我们返回 0。 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10⁴ 
// 1 <= nums[i] <= 10⁶ 
// 
//
// Related Topics贪心 | 数组 | 数学 | 排序 
//
// 👍 277, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 三角形的最大周长
 * @author ambrose
 * @date 2024-10-10 21:13:41
 */

public class P0976_LargestPerimeterTriangle{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0976_LargestPerimeterTriangle().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 1;  i > 1; i--) {
			if(nums[i] < nums[i - 1] + nums[i - 2])
				return nums[i] + nums[i - 1] + nums[i - 2];
		}
		return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}