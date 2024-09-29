//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
//
// Related Topics数组 | 数学 
//
// 👍 1428, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 加一
 * @author ambrose
 * @date 2024-09-16 22:07:32
 */
public class P0066_PlusOne{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0066_PlusOne().new Solution();
		  int[] d = {9,8,7,6,5,4,3,2,1,0};
		  int[] ans = solution.plusOne(d);
		  for(int c: ans)
		  System.out.print(c);
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int[] plusOne(int[] digits) {
		//从后向前，如果有一次除余不为1，代表不进位直接返回，如果一直未返回，代表全部进位，9、99.999...,直接用原数组初始化，默认全为0.修改[0]=1即可。
		for(int i = digits.length - 1; i >= 0; i--){
			digits[i]++; digits[i] %= 10;
			if(digits[i] != 0) return digits;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

//	很麻烦，需优化
//	public int[] plusOne(int[] digits) {
//		int len = 0, flag = 0 ;
//		for(int i = digits.length - 1; i >= 0; i--){
//			if((digits[i] != 9 && i == digits.length - 1) || (digits[i] != 9 && flag == 1)){
//				digits[i] += 1; flag = 0;
//			}
//			else if((digits[i] == 9 && flag == 1) || (digits[i] == 9 && i == digits.length - 1) ){
//				digits[i] = 0; flag = 1;
//			}
//		}
//		int[] ans = new int[digits.length + 1];// 创建新的数组并复制旧的内容
//		if(flag == 1){
//			System.arraycopy(digits, 0, ans, 1, digits.length);// 从第1位开始复制旧数组内容
//			ans[0] = 1;// 设置进位
//		}
//		return flag == 1 ? ans : digits;
//	}

//    public int[] plusOne(int[] digits) {
//		//错误，未注意到1 <= digits.length <= 100
//		int ans = 0, temp = 0;
//		List<Integer> dig = new ArrayList<>();
//		for(int i = 0; i < digits.length; i++){
//			//不加(int)为double
//			temp += digits[i] * (int) Math.pow(10, digits.length-1-i);
//		}
//		temp++;
//		while(temp/10 > 0){
//			dig.add(0,temp % 10); temp /= 10;
//		}
//		dig.add(0,temp % 10);
//		return dig.stream().mapToInt(Integer::intValue).toArray();  // 转换为 int[]
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
