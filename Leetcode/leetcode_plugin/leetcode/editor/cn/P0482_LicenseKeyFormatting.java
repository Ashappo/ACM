//给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串由 n 个破折号分成 n + 1 组。你也会得到一个整数 k 。
//
// 我们想要重新格式化字符串 s，使每一组包含 k 个字符，除了第一组，它可以比 k 短，但仍然必须包含至少一个字符。此外，两组之间必须插入破折号，并且应该将
//所有小写字母转换为大写字母。
//
// 返回 重新格式化的许可密钥 。
//
//
//
// 示例 1：
//
//
//输入：S = "5F3Z-2e-9-w", k = 4
//输出："5F3Z-2E9W"
//解释：字符串 S 被分成了两个部分，每部分 4 个字符；
//     注意，两个额外的破折号需要删掉。
//
//
// 示例 2：
//
//
//输入：S = "2-5g-3-J", k = 2
//输出："2-5G-3J"
//解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
//
//
//
//
// 提示:
//
//
// 1 <= s.length <= 10⁵
// s 只包含字母、数字和破折号 '-'.
// 1 <= k <= 10⁴
//
//
// Related Topics字符串
//
// 👍 174, 👎 0bug 反馈 | 使用指南 | 更多配套插件
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 密钥格式化
 * @author ambrose
 * @date 2024-09-17 11:46:52
 */
public class P0482_LicenseKeyFormatting{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0482_LicenseKeyFormatting().new Solution();
		  String S1 = "5F3Z-2e-9-w"; int k1 = 4;
		  String S2 = "2-5g-3-J"; int k2 = 2;
		  System.out.println(solution.licenseKeyFormatting(S2, k2));
		 System.out.println(solution.licenseKeyFormatting(S1, k1));
	 }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public String licenseKeyFormatting(String s, int k) {
		// Step 1: 去除所有破折号，并将字母转换为大写
		s = s.toUpperCase().replaceAll("-", "");

		// Step 2: 创建一个 StringBuilder 来构造重新格式化后的字符串
		StringBuilder ss = new StringBuilder(s);

		// Step 3: 重新分组，每 k 个字符插入一个破折号
		for (int i = ss.length() - k; i > 0; i -= k) {
			ss.insert(i, '-');
		}

		// Step 4: 返回格式化后的字符串
		return ss.toString();
	}
}
/*
理解错误，不是从第一个'-'之前的就要视为一个整体。而是要将整个字符串中的字母视为整体，从后向前分割。剩余为第一组。
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase();
		StringBuilder ss = new StringBuilder();
		List<String> res = new ArrayList<>();
		if(s.length() < k) return s;
		String start = s.substring(0, k);
		if(start.contains("-")){
			start = s.substring(0, start.indexOf("-"));
			s = s.substring(start.indexOf("-") + 1);
		}
		else{
			start = s.substring(0, k);
			s = s.substring(k);
		}
		res.add(start);
		for(char  c : s.toCharArray()){
			if(c != '-') ss.append(c);
		}
		while(ss.length() > 0){
			if(ss.length() - k >= 0){
				res.add(ss.substring(0, k));
				ss.delete(0, k);
			}
			else{
				res.add(ss.substring(0, ss.length()));
				ss.delete(0, ss.length());
			}
		}
		return String.join("-", res);
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

}
