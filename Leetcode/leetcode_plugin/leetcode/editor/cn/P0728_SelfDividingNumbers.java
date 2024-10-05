//自除数 是指可以被它包含的每一位数整除的数。 
//
// 
// 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。 
// 
//
// 自除数 不允许包含 0 。 
//
// 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right]（包括两个端点）内所有的 自除数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：left = 1, right = 22
//输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// 
//
// 示例 2: 
//
// 
//输入：left = 47, right = 85
//输出：[48,55,66,77]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= left <= right <= 10⁴ 
// 
//
// Related Topics数学 
//
// 👍 271, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 * @author ambrose
 * @date 2024-10-02 21:21:35
 */

public class P0728_SelfDividingNumbers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0728_SelfDividingNumbers().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> ls = new ArrayList<>();
		for(int i = left; i <= right; i++){
			int temp = i, a = 0;
			boolean flag = true;
			while(temp > 0){
				 a = temp % 10;
//				 if( i % a != 0){
				 if(a == 0 || i % a != 0){
					 flag = false;
					 break;
				 }
				 temp /= 10;
			}
			if(flag)
				ls.add(i);
		}
		return ls;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}