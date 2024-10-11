//整数的 数组形式 num 是按照从左到右的顺序表示其数字的数组。 
//
// 
// 例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。 
// 
//
// 给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：num = [1,2,0,0], k = 34
//输出：[1,2,3,4]
//解释：1200 + 34 = 1234
// 
//
// 示例 2： 
//
// 
//输入：num = [2,7,4], k = 181
//输出：[4,5,5]
//解释：274 + 181 = 455
// 
//
// 示例 3： 
//
// 
//输入：num = [2,1,5], k = 806
//输出：[1,0,2,1]
//解释：215 + 806 = 1021
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num.length <= 10⁴ 
// 0 <= num[i] <= 9 
// num 不包含任何前导零，除了零本身 
// 1 <= k <= 10⁴ 
// 
//
// Related Topics数组 | 数学 
//
// 👍 255, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 数组形式的整数加法
 * @author ambrose
 * @date 2024-10-10 21:39:53
 */

public class P0989_AddToArrayFormOfInteger{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0989_AddToArrayFormOfInteger().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
 // 2024/10/10 21:56:00
 //解答成功:
 //	执行耗时:3 ms,击败了84.00% 的Java用户
 //	内存消耗:44.7 MB,击败了53.82% 的Java用户
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> ans = new ArrayList<>();
		int n = num.length;
		for (int i = n - 1; i >= 0; i--) {
			int sum = num[i] + k % 10;
			k /= 10;
			if(sum >= 10){
				k++;//对k++，省去一个flag位进行判断。且直接可用于下面的while
				ans.add(sum % 10);
			}else ans.add( sum);
		}
		while (k > 0){
			ans.add(k % 10);
			k /= 10;
		}
		Collections.reverse(ans);
		return ans;
	}
}
//直接在List add(idx, element)比add(ele) 再翻转时间多。
// 2024/10/10 21:55:27
//	解答成功:
//	执行耗时:35 ms,击败了19.27% 的Java用户
//	内存消耗:44.9 MB,击败了30.55% 的Java用户
//class Solution {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//		List<Integer> ans = new ArrayList<>();
//		int n = num.length;
//		for (int i = n - 1; i >= 0; i--) {
//			int sum = num[i] + k % 10;
//			k /= 10;
//			if(sum >= 10){
//				k++;//对k++，省去一个flag位进行判断。且直接可用于下面的while
//				ans.add(0, sum % 10);
//			}else ans.add(0, sum);
//		}
//		while (k > 0){
//			ans.add(0, k % 10);
//			k /= 10;
//		}
//		return ans;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}