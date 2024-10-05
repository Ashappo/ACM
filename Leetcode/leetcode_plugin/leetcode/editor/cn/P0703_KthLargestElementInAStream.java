//设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。 
//
// 请实现 KthLargest 类： 
//
// 
// KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。 
// int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。 
// 
//
// 
//
// 示例 1： 
//
// 
// 输入： ["KthLargest", "add", "add", "add", "add", "add"] [[3, [4, 5, 8, 2]], [3]
//, [5], [10], [9], [4]] 
// 
//
// 输出：[null, 4, 5, 5, 8, 8] 
//
// 解释： 
//
// KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]); kthLargest.add(3); /
/// 返回 4 kthLargest.add(5); // 返回 5 kthLargest.add(10); // 返回 5 kthLargest.add(9);
// // 返回 8 kthLargest.add(4); // 返回 8 
//
// 
//
// 示例 2： 
//
// 
// 输入： ["KthLargest", "add", "add", "add", "add"] [[4, [7, 7, 7, 7, 8, 3]], [2],
// [10], [9], [9]] 
// 
//
// 输出：[null, 7, 7, 7, 8] 
//
// 解释： KthLargest kthLargest = new KthLargest(4, [7, 7, 7, 7, 8, 3]);
// kthLargest.add(2); // 返回 7
// kthLargest.add(10); // 返回 7
// kthLargest.add(9); // 返回 7
// kthLargest.add(9); // 返回 8
//
// 
//提示：
//
// 
// 0 <= nums.length <= 10⁴ 
// 1 <= k <= nums.length + 1 
// -10⁴ <= nums[i] <= 10⁴ 
// -10⁴ <= val <= 10⁴ 
// 最多调用 add 方法 10⁴ 次 
// 
//
// Related Topics树 | 设计 | 二叉搜索树 | 二叉树 | 数据流 | 堆（优先队列） 
//
// 👍 480, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.PriorityQueue;

/**
 * 数据流中的第 K 大元素
 * @author ambrose
 * @date 2024-10-02 17:30:19
 */

public class P0703_KthLargestElementInAStream{
	 public static void main(String[] args) {
	 	 //测试代码
//	 	 Solution solution = new P0703_KthLargestElementInAStream().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class KthLargest {
//    优先队列（PriorityQueue）的默认实现是一个最小堆，小顶堆存储k个元素，堆顶就是第K大的。
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k)
            pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}