//给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。 
//
// 注意：如果对空文本输入退格字符，文本继续为空。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ab#c", t = "ad#c"
//输出：true
//解释：s 和 t 都会变成 "ac"。
// 
//
// 示例 2： 
//
// 
//输入：s = "ab##", t = "c#d#"
//输出：true
//解释：s 和 t 都会变成 ""。
// 
//
// 示例 3： 
//
// 
//输入：s = "a#c", t = "b"
//输出：false
//解释：s 会变成 "c"，但 t 仍然是 "b"。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length, t.length <= 200 
// s 和 t 只含有小写字母以及字符 '#' 
// 
//
// 
//
// 进阶： 
//
// 
// 你可以用 O(n) 的时间复杂度和 O(1) 的空间复杂度解决该问题吗？ 
// 
//
// Related Topics栈 | 双指针 | 字符串 | 模拟 
//
// 👍 759, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Stack;

/**
 * 比较含退格的字符串
 * @author ambrose
 * @date 2024-10-05 22:45:04
 */

public class P0844_BackspaceStringCompare{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0844_BackspaceStringCompare().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
		Stack<Character> stackS = new Stack<>();
		Stack<Character> stackT = new Stack<>();
		for (char c:
				s.toCharArray()) {
			if(c != '#')
				stackS.push(c);
			else{
				if(!stackS.empty()){
					stackS.pop();
				}
			}
		}
		for (char c:
				t.toCharArray()) {
			if(c != '#')
				stackT.push(c);
			else{
				if(!stackT.empty()){
					stackT.pop();
				}
			}
		}
		if(stackS.stream().count() != stackT.stream().count())
			return false;
		while(!stackS.empty()){
			if(stackS.pop() != stackT.pop())
				return false;
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}