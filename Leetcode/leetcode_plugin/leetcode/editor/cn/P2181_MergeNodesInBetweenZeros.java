//给你一个链表的头节点 head ，该链表包含由 0 分隔开的一连串整数。链表的 开端 和 末尾 的节点都满足 Node.val == 0 。 
//
// 对于每两个相邻的 0 ，请你将它们之间的所有节点合并成一个节点，其值是所有已合并节点的值之和。然后将所有 0 移除，修改后的链表不应该含有任何 0 。 
//
// 返回修改后链表的头节点 head 。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [0,3,1,0,4,5,2,0]
//输出：[4,11]
//解释：
//上图表示输入的链表。修改后的链表包含：
//- 标记为绿色的节点之和：3 + 1 = 4
//- 标记为红色的节点之和：4 + 5 + 2 = 11
// 
//
// 示例 2： 
//
// 
//输入：head = [0,1,0,3,0,2,2,0]
//输出：[1,3,4]
//解释：
//上图表示输入的链表。修改后的链表包含：
//- 标记为绿色的节点之和：1 = 1
//- 标记为红色的节点之和：3 = 3
//- 标记为黄色的节点之和：2 + 2 = 4
// 
//
// 
//
// 提示： 
//
// 
// 列表中的节点数目在范围 [3, 2 * 10⁵] 内 
// 0 <= Node.val <= 1000 
// 不 存在连续两个 Node.val == 0 的节点 
// 链表的 开端 和 末尾 节点都满足 Node.val == 0 
// 
//
// Related Topics链表 | 模拟 
//
// 👍 56, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 合并零之间的节点
 * @author ambrose
 * @date 2024-09-14 21:24:06
 */
public class P2181_MergeNodesInBetweenZeros{
	 public static void main(String[] args) {
		 //测试代码
		 int[] h1 = {0,3,1,0,4,5,2,0}, h2 = {0,1,0,3,0,2,2,0};
		 P2181_MergeNodesInBetweenZeros p = new P2181_MergeNodesInBetweenZeros();
		 ListNode l1  = p.buildList(h1);
		 ListNode l2  = p.buildList(h2);
		 p.printList(l1);
		 p.printList(l2);
		 Solution solution = p.new Solution();
		 p.printList(solution.mergeNodes(l1));
		 p.printList(solution.mergeNodes(l2));
	 }
	// 辅助方法：根据数组构建链表
	public ListNode buildList(int[] nums) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		for (int num : nums) {
			current.next = new ListNode(num);
			current = current.next;
		}
		return dummy.next;
	}

	// 辅助方法：打印链表
	public void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}

	//  Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	//力扣代码
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public ListNode mergeNodes(ListNode head) {
			ListNode dummy = new ListNode(0), next = dummy;
			head = head.next;// 跳过第一个 0
			int cnt = 0;
			while(head != null){
				if(head.val != 0){
					cnt += head.val;
				}
				else {
					ListNode node = new ListNode(cnt, null);
					next.next = node; next = next.next;
					cnt = 0;
				}
				head = head.next;
			}
			return dummy.next;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
