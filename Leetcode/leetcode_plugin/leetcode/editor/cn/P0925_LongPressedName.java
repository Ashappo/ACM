//你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。 
//
// 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。 
//
// 
//
// 示例 1： 
//
// 
//输入：name = "alex", typed = "aaleex"
//输出：true
//解释：'alex' 中的 'a' 和 'e' 被长按。
// 
//
// 示例 2： 
//
// 
//输入：name = "saeed", typed = "ssaaedd"
//输出：false
//解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= name.length, typed.length <= 1000 
// name 和 typed 的字符都是小写字母 
// 
//
// Related Topics双指针 | 字符串 
//
// 👍 307, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 长按键入
 * @author ambrose
 * @date 2024-10-07 23:26:53
 */

public class P0925_LongPressedName{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0925_LongPressedName().new Solution();
		  String name = "alex" , typed = "aaleexa";
		  System.out.println(solution.isLongPressedName(name, typed));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isLongPressedName(String name, String typed) {
		int i = 0, j = 0;
//		应该遍历typed，String name = "alex" , typed = "aaleexa"这种，最后的a不符合规则，但是从name便利，扫描不到typed的最后一个a就结束了
//		while(i < name.length()){
//			if(name.charAt(i) == typed.charAt(j)){
//				i++; j++;
//			}
//			else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
//				j++;
//			}
//			else return false;
//		}
//		return true;
		while(j < typed.length()){
			if(i < name.length() && name.charAt(i) == typed.charAt(j)){
				i++; j++;
			}
			else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
				j++;
			}
			else return false;
		}
		return i == name.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}