//给你一个字符串 s ，根据下述规则反转字符串： 
//
// 
// 所有非英文字母保留在原有位置。 
// 所有英文字母（小写或大写）位置反转。 
// 
//
// 返回反转后的 s 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s = "ab-cd"
//输出："dc-ba"
// 
//
// 
// 
//
// 示例 2： 
//
// 
//输入：s = "a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 
// 
//
// 示例 3： 
//
// 
//输入：s = "Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示 
//
// 
// 1 <= s.length <= 100 
// s 仅由 ASCII 值在范围 [33, 122] 的字符组成 
// s 不含 '\"' 或 '\\' 
// 
//
// Related Topics双指针 | 字符串 
//
// 👍 215, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 仅仅反转字母
 * @author ambrose
 * @date 2024-10-06 21:32:56
 */

public class P0917_ReverseOnlyLetters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0917_ReverseOnlyLetters().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String s) {
		char[] arr = s.toCharArray();
		int left = 0, right = s.length() - 1;
		while(left < right){
			while(left < right && !Character.isLetter(arr[left])){
				left++;
			}
			while(left < right && !Character.isLetter(arr[right])){
				right--;
			}
			if(left < right){
				char c = arr[left];
				arr[left] = arr[right];
				arr[right] = c;
				left++; right--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char c : arr)
			sb.append(c);
		return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}