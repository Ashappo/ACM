//给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,0,1,1,1]
//输出：3
//解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
// 
//
// 示例 2: 
//
// 
//输入：nums = [1,0,1,1,0,1]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] 不是 0 就是 1. 
// 
//
// Related Topics数组 
//
// 👍 442, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 最大连续 1 的个数
 * @author ambrose
 * @date 2024-09-26 18:03:31
 */

public class P0485_MaxConsecutiveOnes{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0485_MaxConsecutiveOnes().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, temp = 0, flag = 0;
		for (int i = 0; i < nums.length; i++){
			if(flag == 0){
				if(nums[i] == 1) {
					temp += 1;
					flag = 1;
					max = Math.max(max, temp);
				}
				else {
					temp = 0;
				}
			}
			else{
				if(nums[i] == 0) {
					flag = 0;
					temp = 0;
				}
				else {
					temp += 1;
					max = Math.max(max, temp);
				}
			}
		}
		return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}