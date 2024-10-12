//给你一个整数数组 arr，只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。 
//
// 形式上，如果可以找出索引 i + 1 < j 且满足 (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + 
//arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1]) 
//就可以将数组三等分。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [0,2,1,-6,6,-7,9,1,2,0,1]
//输出：true
//解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
// 
//
// 示例 2： 
//
// 
//输入：arr = [0,2,1,-6,6,7,9,-1,2,0,1]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：arr = [3,3,6,5,-2,2,5,1,-9,4]
//输出：true
//解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
// 
//
// 
//
// 提示： 
//
// 
// 3 <= arr.length <= 5 * 10⁴ 
// -10⁴ <= arr[i] <= 10⁴ 
// 
//
// Related Topics贪心 | 数组 
//
// 👍 211, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 将数组分成和相等的三个部分
 * @author ambrose
 * @date 2024-10-12 23:03:40
 */

public class P1013_PartitionArrayIntoThreePartsWithEqualSum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1013_PartitionArrayIntoThreePartsWithEqualSum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
		int sum = 0, first = -1, temp = 0;
		for(int c : arr)
			sum += c;
		if(sum % 3 != 0)
			return false;
		for (int i = 0; i < arr.length - 2; i++) {
			temp += arr[i];
			if(temp == sum / 3){
				for (int j = i + 1, temp1 = 0; j < arr.length - 1; j++) {
					temp1 += arr[j];
					if(temp1 == sum / 3)
						return true;
				}
			}
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}