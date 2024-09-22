//小镇里有 n 个人，按从 1 到 n 的顺序编号。传言称，这些人中有一个暗地里是小镇法官。 
//
// 如果小镇法官真的存在，那么： 
//
// 
// 小镇法官不会信任任何人。 
// 每个人（除了小镇法官）都信任这位小镇法官。 
// 只有一个人同时满足属性 1 和属性 2 。 
// 
//
// 给你一个数组 trust ，其中 trust[i] = [ai, bi] 表示编号为 ai 的人信任编号为 bi 的人。 
//
// 如果小镇法官存在并且可以确定他的身份，请返回该法官的编号；否则，返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2, trust = [[1,2]]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：n = 3, trust = [[1,3],[2,3]]
//输出：3
// 
//
// 示例 3： 
//
// 
//输入：n = 3, trust = [[1,3],[2,3],[3,1]]
//输出：-1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 0 <= trust.length <= 10⁴ 
// trust[i].length == 2 
// trust 中的所有trust[i] = [ai, bi] 互不相同 
// ai != bi 
// 1 <= ai, bi <= n 
// 
//
// Related Topics图 | 数组 | 哈希表 
//
// 👍 339, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 找到小镇的法官
 * @author ambrose
 * @date 2024-09-22 08:13:41
 */
public class P997_FindTheTownJudge{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P997_FindTheTownJudge().new Solution();
		 int n1 = 2;
		 int[][] trust1 = {{1, 2}};
		 int n2 = 3;
		 int[][] trust2 = {{1,3},{2,3},{3,1}};
		 System.out.println(solution.findJudge(n2, trust2));
		 System.out.println(solution.findJudge(n1, trust1));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int findJudge(int n, int[][] trust) {
		int len = trust.length, cnt = 0, res = -1;
		int[] ans = new int[n + 1];
		if(n == 1 && len == 0) return 1;
		for(int i = 0 ; i < len; i++){
			if(ans[trust[i][1]] != -1) {
				ans[trust[i][1]]++;
				if(ans[trust[i][1]] == n - 1) {
					++cnt;
					if(cnt > 1) return res;
					res = trust[i][1];
				}
			}
			if(trust[i][0] != res)
				ans[trust[i][0]] = -1;
			else{
				ans[trust[i][0]] = -1; res = -1;
			}
		}
		return res;
	}
		 //没说每个人只能信任一个。所以下面都错。
//    public int findJudge(int n, int[][] trust) {
//		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
//		int ans = -1;
//		if(trust.length != n - 1) return ans;
//		for(int[] c : trust){
//			if(c[1] == c[0] || c[0] > n || c[1] > n) return ans;
//			table.put(c[1], table.getOrDefault(c[1], 0) + 1);
//		}
//		if(table.size() != 1)
//			return ans;
//		else{
//			ans = table.keySet().iterator().next();
//		}
//		return ans;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
