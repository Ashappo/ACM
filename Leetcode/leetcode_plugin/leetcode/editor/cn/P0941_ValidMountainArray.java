//给定一个整数数组 arr，如果它是有效的山脉数组就返回 true，否则返回 false。 
//
// 让我们回顾一下，如果 arr 满足下述条件，那么它是一个山脉数组： 
//
// 
// arr.length >= 3 
// 在 0 < i < arr.length - 1 条件下，存在 i 使得： 
// 
// arr[0] < arr[1] < ... arr[i-1] < arr[i] 
// arr[i] > arr[i+1] > ... > arr[arr.length - 1] 
// 
// 
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
//输入：arr = [2,1]
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：arr = [3,5,5]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：arr = [0,3,2,1]
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10⁴ 
// 0 <= arr[i] <= 10⁴ 
// 
//
// Related Topics数组 
//
// 👍 239, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 有效的山脉数组
 * @author ambrose
 * @date 2024-10-07 23:46:42
 */

public class P0941_ValidMountainArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0941_ValidMountainArray().new Solution();
		  int[] arr = new int[]{0,3,2,1};
		  System.out.println(solution.validMountainArray(arr));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validMountainArray(int[] arr) {
		int flag = 0;
		if(arr.length < 3)
			return false;
		int i = 1;
		while (i < arr.length && arr[i] - arr[i - 1] > 0){
			i++;
			if(flag == 0)
				flag++;
		}
		while (i < arr.length && arr[i] - arr[i - 1] < 0){
			i++;
			if(flag == 1)
				flag++;
		}
		return i == arr.length && flag == 2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}