//有一堆石头，每块石头的重量都是正整数。 
//
// 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下： 
//
// 
// 如果 x == y，那么两块石头都会被完全粉碎； 
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。 
// 
//
// 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。 
//
// 
//
// 示例： 
//
// 
//输入：[2,7,4,1,8,1]
//输出：1
//解释：
//先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
//再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
//接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
//最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。 
//
// 
//
// 提示： 
//
// 
// 1 <= stones.length <= 30 
// 1 <= stones[i] <= 1000 
// 
//
// Related Topics数组 | 堆（优先队列） 
//
// 👍 315, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 最后一块石头的重量
 * @author ambrose
 * @date 2024-10-13 18:50:20
 */

public class P1046_LastStoneWeight{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1046_LastStoneWeight().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastStoneWeight(int[] stones) {
//		最大堆
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
//		PriorityQueue 是 Java 中的一个优先队列实现，默认情况下，它是一个最小堆
//		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }
		while(pq.size() > 1){
			int a = pq.poll();
			int b = pq.poll();
			if(a > b)
				pq.offer(a - b);
		}
		return pq.isEmpty() ? 0 : pq.poll();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}