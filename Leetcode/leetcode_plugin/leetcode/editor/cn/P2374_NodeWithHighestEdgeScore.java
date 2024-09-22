//给你一个有向图，图中有 n 个节点，节点编号从 0 到 n - 1 ，其中每个节点都 恰有一条 出边。 
//
// 图由一个下标从 0 开始、长度为 n 的整数数组 edges 表示，其中 edges[i] 表示存在一条从节点 i 到节点 edges[i] 的 有向 边
//。 
//
// 节点 i 的 边积分 定义为：所有存在一条指向节点 i 的边的节点的 编号 总和。 
//
// 返回 边积分 最高的节点。如果多个节点的 边积分 相同，返回编号 最小 的那个。 
//
// 
//
// 示例 1： 
// 输入：edges = [1,0,0,0,0,7,7,5]
//输出：7
//解释：
//- 节点 1、2、3 和 4 都有指向节点 0 的边，节点 0 的边积分等于 1 + 2 + 3 + 4 = 10 。
//- 节点 0 有一条指向节点 1 的边，节点 1 的边积分等于 0 。
//- 节点 7 有一条指向节点 5 的边，节点 5 的边积分等于 7 。
//- 节点 5 和 6 都有指向节点 7 的边，节点 7 的边积分等于 5 + 6 = 11 。
//节点 7 的边积分最高，所以返回 7 。
// 
//
// 示例 2： 
// 输入：edges = [2,0,0,2]
//输出：0
//解释：
//- 节点 1 和 2 都有指向节点 0 的边，节点 0 的边积分等于 1 + 2 = 3 。
//- 节点 0 和 3 都有指向节点 2 的边，节点 2 的边积分等于 0 + 3 = 3 。
//节点 0 和 2 的边积分都是 3 。由于节点 0 的编号更小，返回 0 。
// 
//
// 
//
// 提示： 
//
// 
// n == edges.length 
// 2 <= n <= 10⁵ 
// 0 <= edges[i] < n 
// edges[i] != i 
// 
//
// Related Topics图 | 哈希表 
//
// 👍 18, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 边积分最高的节点
 * @author ambrose
 * @date 2024-09-21 11:00:21
 */
public class P2374_NodeWithHighestEdgeScore{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2374_NodeWithHighestEdgeScore().new Solution();
		 int[] edges1 = {1,0,0,0,0,7,7,5};
		 int[] edges2 = {2,0,0,2};
		 int[] edges3 = {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		 System.out.println(solution.edgeScore(edges3));
		 System.out.println(solution.edgeScore(edges1));
		 System.out.println(solution.edgeScore(edges2));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int edgeScore(int[] edges) {
		int n = edges.length;
		HashMap<Integer, Long> table = new HashMap<>(); // 使用 Long 类型,10^5个数，累加有可能溢出。

		// 累加得分
		for (int i = 0; i < n; i++) {
			table.put(edges[i], table.getOrDefault(edges[i], 0L) + i); // 使用 0L 以确保是 long 类型
		}

		// 创建一个列表并排序
		List<Map.Entry<Integer, Long>> sortedEntries = new ArrayList<>(table.entrySet());
		sortedEntries.sort((e1, e2) -> {
			int valueCompare = e2.getValue().compareTo(e1.getValue()); // 降序比较值
			return valueCompare != 0 ? valueCompare : e1.getKey().compareTo(e2.getKey()); // 升序比较键
		});

		// 返回得分最高的节点
		return sortedEntries.get(0).getKey();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
