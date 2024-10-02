//给定一个非空且只包含非负数的整数数组 nums，数组的 度 的定义是指数组里任一元素出现频数的最大值。 
//
// 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,3,1]
//输出：2
//解释：
//输入数组的度是 2 ，因为元素 1 和 2 的出现频数最大，均为 2 。
//连续子数组里面拥有相同度的有如下所示：
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组 [2, 2] 的长度为 2 ，所以返回 2 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,2,3,1,4,2]
//输出：6
//解释：
//数组的度是 3 ，因为元素 2 重复出现 3 次。
//所以 [2,2,3,1,4,2] 是最短子数组，因此返回 6 。
// 
//
// 
//
// 提示： 
//
// 
// nums.length 在 1 到 50,000 范围内。 
// nums[i] 是一个在 0 到 49,999 范围内的整数。 
// 
//
// Related Topics数组 | 哈希表 
//
// 👍 511, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组的度
 * @author ambrose
 * @date 2024-10-02 17:06:34
 */

public class P0697_DegreeOfAnArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0697_DegreeOfAnArray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findShortestSubArray(int[] nums) {
		HashMap<Integer, int[]> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				map.get(nums[i])[0]++;
				map.get(nums[i])[2] = i;
			}
			else{
				map.put(nums[i], new int[]{1, i, i});
			}
		}
		int minLen = 0, maxNum = 0;
		for(Map.Entry<Integer, int[]> entry : map.entrySet()){
			if(entry.getValue()[0] > maxNum){
				minLen = entry.getValue()[2] - entry.getValue()[1] + 1;
				maxNum = entry.getValue()[0];
			}
			else if(entry.getValue()[0] == maxNum && entry.getValue()[2] - entry.getValue()[1] + 1 < minLen){
				minLen = entry.getValue()[2] - entry.getValue()[1] + 1;
			}
		}
		return minLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}