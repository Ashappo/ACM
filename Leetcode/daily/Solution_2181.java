class Solution_2181 {
    // 定义链表节点结构
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeNodes(ListNode head) {
        // 虚拟节点，用于构建结果链表
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode temp = head.next; // 跳过第一个 0

        int sum = 0;

        // 遍历链表
        while (temp != null) {
            if (temp.val != 0) {
                sum += temp.val; // 不是 0 时，累加节点值
            } else {
                // 遇到 0 时，将累加的值作为新节点插入
                current.next = new ListNode(sum);
                current = current.next; // 更新当前节点指针
                sum = 0; // 重置累加值
            }
            temp = temp.next;
        }

        return dummy.next; // 返回结果链表的头节点
    }

    // 测试方法
    public static void main(String[] args) {
        Solution_2181 solution = new Solution_2181();

        // 构建测试链表
        int[] input1 = {0, 3, 1, 0, 4, 5, 2, 0};
        int[] input2 = {0, 1, 0, 3, 0, 2, 2, 0};

        ListNode head1 = solution.buildList(input1);
        ListNode head2 = solution.buildList(input2);

        // 打印合并结果
        solution.printList(solution.mergeNodes(head1)); // 输出：[4, 11]
        solution.printList(solution.mergeNodes(head2)); // 输出：[1, 3, 4]
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
}
