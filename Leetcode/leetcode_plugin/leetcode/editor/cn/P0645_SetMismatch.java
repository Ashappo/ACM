//集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有
//一个数字重复 。 
//
// 给定一个数组 nums 代表了集合 S 发生错误后的结果。 
//
// 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,4]
//输出：[2,3]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,1]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// 1 <= nums[i] <= 10⁴ 
// 
//
// Related Topics位运算 | 数组 | 哈希表 | 排序 
//
// 👍 377, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 错误的集合
 * @author ambrose
 * @date 2024-09-29 19:09:03
 */

public class P0645_SetMismatch{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0645_SetMismatch().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findErrorNums(int[] nums) {
		int len = nums.length;
		int[] res = new int[len + 1], ans = new int[2];
		for (int i = 0; i < len; i++) {
			if(res[nums[i]] == 1){
				ans[0] = nums[i];
			}
			else {
				res[nums[i]] = 1;
			}
		}
		for (int i = 1; i < len + 1; i++) {
			if(res[i] == 0)
				ans[1] = i;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}