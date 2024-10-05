//有两种特殊字符： 
//
// 
// 第一种字符可以用一比特 0 表示 
// 第二种字符可以用两比特（10 或 11）表示 
// 
//
// 给你一个以 0 结尾的二进制数组 bits ，如果最后一个字符必须是一个一比特字符，则返回 true 。 
//
// 
//
// 示例 1: 
//
// 
//输入: bits = [1, 0, 0]
//输出: true
//解释: 唯一的解码方式是将其解析为一个两比特字符和一个一比特字符。
//所以最后一个字符是一比特字符。
// 
//
// 示例 2: 
//
// 
//输入：bits = [1,1,1,0]
//输出：false
//解释：唯一的解码方式是将其解析为两比特字符和两比特字符。
//所以最后一个字符不是一比特字符。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= bits.length <= 1000 
// bits[i] 为 0 或 1 
// 
//
// Related Topics数组 
//
// 👍 304, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 1 比特与 2 比特字符
 * @author ambrose
 * @date 2024-10-02 18:59:28
 */

public class P0717_OneBitAnd2BitCharacters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0717_OneBitAnd2BitCharacters().new Solution();
		  int[] bits = {1,1,1,0};
		  System.out.println(solution.isOneBitCharacter(bits));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
// 我们可以对 bits 数组从左到右遍历。当遍历到 bits[i] 时，如果 bits[i]=0，说明遇到了第一种字符，将 i 的值增加 1；如果 bits[i]=1，说明遇到了第二种字符，可以跳过 bits[i+1]（注意题目保证 bits 一定以 0 结尾，所以 bits[i] 一定不是末尾比特，因此 bits[i+1] 必然存在），将 i 的值增加 2。
//上述流程也说明 bits 的编码方式是唯一确定的，因此若遍历到 i=n−1，那么说明最后一个字符一定是第一种字符。

    public boolean isOneBitCharacter(int[] bits) {
		int n = bits.length, temp = 0;
		while(temp < n - 1){
			 temp += bits[temp] + 1;
		}
		return temp == n - 1 ? true : false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}