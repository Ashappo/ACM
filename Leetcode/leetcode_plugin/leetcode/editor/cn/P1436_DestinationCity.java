//给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 
//cityAi 直接前往 cityBi 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。 
//
// 题目数据保证线路图会形成一条不存在循环的线路，因此恰有一个旅行终点站。 
//
// 
//
// 示例 1： 
//
// 
//输入：paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
//输出："Sao Paulo" 
//解释：从 "London" 出发，最后抵达终点站 "Sao Paulo" 。本次旅行的路线是 "London" -> "New York" -> 
//"Lima" -> "Sao Paulo" 。
// 
//
// 示例 2： 
//
// 
//输入：paths = [["B","C"],["D","B"],["C","A"]]
//输出："A"
//解释：所有可能的线路是：
//"D" -> "B" -> "C" -> "A". 
//"B" -> "C" -> "A". 
//"C" -> "A". 
//"A". 
//显然，旅行终点站是 "A" 。
// 
//
// 示例 3： 
//
// 
//输入：paths = [["A","Z"]]
//输出："Z"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= paths.length <= 100 
// paths[i].length == 2 
// 1 <= cityAi.length, cityBi.length <= 10 
// cityAi != cityBi 
// 所有字符串均由大小写英文字母和空格字符组成。 
// 
//
// Related Topics数组 | 哈希表 | 字符串 
//
// 👍 157, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

/**
 * 旅行终点站
 * @author ambrose
 * @date 2024-10-08 19:57:06
 */

public class P1436_DestinationCity{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1436_DestinationCity().new Solution();
		 List<List<String>> paths = new ArrayList<>();
		 paths.add(Arrays.asList("London", "New York"));
		 paths.add(Arrays.asList("New York", "Lima"));
		 paths.add(Arrays.asList("Lima","Sao Paulo"));
		 System.out.println(solution.destCity(paths));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String destCity(List<List<String>> paths) {
		HashSet<String> map = new HashSet<>();
		for (List<String> s : paths){
			map.add(s.get(0));
		}
		String ans = "";
		for (List<String> s : paths){
			if(!map.contains(s.get(1)))
				return s.get(1);
		}
		return "";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}