> 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/
> 链接：https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
>
> 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
>
> 示例1：
>
> 输入：1->2->4, 1->3->4
> 输出：1->1->2->3->4->4
> 限制：
>
> 0 <= 链表长度 <= 1000
>

```cpp
#pac设置虚拟节头点，ListNode *dummy = new ListNode(0)
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode *dummy = new ListNode(0), *head, *node = dummy;//pac
        while(l1 && l2){
            if(l1->val <= l2->val) {
                node->next = l1;  node = node->next; l1 = l1->next;
            }
            else{
                node->next = l2;  node = node->next;  l2 = l2->next;
            }
        }
        if(l1)  node->next = l1;
        if(l2)  node->next = l2;
        head = dummy->next;
        delete dummy;
        return head;
    }
};
```

