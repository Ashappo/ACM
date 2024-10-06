//你正在维护一个项目，该项目有 n 个方法，编号从 0 到 n - 1。 
//
// 给你两个整数 n 和 k，以及一个二维整数数组 invocations，其中 invocations[i] = [ai, bi] 表示方法 ai 调用了方
//法 bi。 
//
// 已知如果方法 k 存在一个已知的 bug。那么方法 k 以及它直接或间接调用的任何方法都被视为 可疑方法 ，我们需要从项目中移除这些方法。 
//
// 只有当一组方法没有被这组之外的任何方法调用时，这组方法才能被移除。 
//
// 返回一个数组，包含移除所有 可疑方法 后剩下的所有方法。你可以以任意顺序返回答案。如果无法移除 所有 可疑方法，则 不 移除任何方法。 
//
// 
//
// 示例 1: 
//
// 
// 输入: n = 4, k = 1, invocations = [[1,2],[0,1],[3,2]] 
// 
//
// 输出: [0,1,2,3] 
//
// 解释: 
//
// 
//
// 方法 2 和方法 1 是可疑方法，但它们分别直接被方法 3 和方法 0 调用。由于方法 3 和方法 0 不是可疑方法，我们无法移除任何方法，故返回所有方法
//。 
//
// 示例 2: 
//
// 
// 输入: n = 5, k = 0, invocations = [[1,2],[0,2],[0,1],[3,4]] 
// 
//
// 输出: [3,4] 
//
// 解释: 
//
// 
//
// 方法 0、方法 1 和方法 2 是可疑方法，且没有被任何其他方法直接调用。我们可以移除它们。 
//
// 示例 3: 
//
// 
// 输入: n = 3, k = 2, invocations = [[1,2],[0,1],[2,0]] 
// 
//
// 输出: [] 
//
// 解释: 
//
// 
//
// 所有方法都是可疑方法。我们可以移除它们。 
//
// 
//
// 提示: 
//
// 
// 1 <= n <= 10⁵ 
// 0 <= k <= n - 1 
// 0 <= invocations.length <= 2 * 10⁵ 
// invocations[i] == [ai, bi] 
// 0 <= ai, bi <= n - 1 
// ai != bi 
// invocations[i] != invocations[j] 
// 
//
// 👍 0, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 移除可疑的方法
 * @author ambrose
 * @date 2024-10-06 13:07:36
 */

public class P3310_RemoveMethodsFromProject{
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P3310_RemoveMethodsFromProject().new Solution();
		int n = 4;
		int k = 1;
		int[][] invocations = {{1,2},{0,1},{3,2}};
		System.out.println(solution.remainingMethods(n, k, invocations));  // 输出 [0, 1, 2, 3]
	}

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
			// 建图
			List<List<Integer>> graph = new ArrayList<>();
			List<List<Integer>> reverseGraph = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				graph.add(new ArrayList<>());
				reverseGraph.add(new ArrayList<>());
			}

			// 构建正向图和反向图
			for (int[] invocation : invocations) {
				int a = invocation[0];
				int b = invocation[1];
				graph.get(a).add(b);
				reverseGraph.get(b).add(a);
			}

			// 用DFS找到所有可疑方法
			Set<Integer> suspiciousSet = new HashSet<>();
			dfs(graph, k, suspiciousSet);

			// 检查是否有外部调用可疑方法
			for (int m : suspiciousSet) {
				for (int caller : reverseGraph.get(m)) {
					if (!suspiciousSet.contains(caller)) {
						// 有外部调用，无法移除任何可疑方法
						List<Integer> allMethods = new ArrayList<>();
						for (int i = 0; i < n; i++) {
							allMethods.add(i);
						}
						return allMethods;
					}
				}
			}

			// 没有外部调用，返回剩余方法
			List<Integer> result = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				if (!suspiciousSet.contains(i)) {
					result.add(i);
				}
			}

			return result;
		}

		private void dfs(List<List<Integer>> graph, int method, Set<Integer> suspiciousSet) {
			if (suspiciousSet.contains(method)) return;
			suspiciousSet.add(method);
			for (int nextMethod : graph.get(method)) {
				dfs(graph, nextMethod, suspiciousSet);
			}
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}