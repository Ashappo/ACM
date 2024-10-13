//给出由小写字母组成的字符串 s，重复项删除操作会选择两个相邻且相同的字母，并删除它们。 
//
// 在 s 上反复执行重复项删除操作，直到无法继续删除。 
//
// 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。 
//
// 
//
// 示例： 
//
// 
//输入："abbaca"
//输出："ca"
//解释：
//例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又
//只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s 仅由小写英文字母组成。 
// 
//
// Related Topics栈 | 字符串 
//
// 👍 651, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Stack;

/**
 * 删除字符串中的所有相邻重复项
 * @author ambrose
 * @date 2024-10-13 19:13:27
 */

public class P1047_RemoveAllAdjacentDuplicatesInString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1047_RemoveAllAdjacentDuplicatesInString().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
		for (Character c : s.toCharArray()){
			if(!stack.isEmpty() && stack.peek() == c)
				stack.pop();
			else stack.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
//		for (Character c : stack) 这种增强的 for 循环实际上是从栈顶开始遍历的。虽然 for-each 循环遍历的是集合中的每个元素，但在 Java 中，栈 Stack 是基于 Vector 实现的，for-each 遍历的是元素的插入顺序。
//		因此，遍历顺序和栈的特点无关，而是按照 Stack 元素的存储顺序进行遍历，等效于从栈底到栈顶的顺序进行访问。
//		for (Character c : stack){
//			sb.append(c);
//		}
//		return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}