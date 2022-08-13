链接：https://leetcode.cn/problems/aMhZSa

pac：(1)寻找中间结点(奇数：中间位，偶数：第二个中间位)时while(fa && fa->n)
		寻找中间结点(奇数：中间位，偶数：第一个中间位)时while(fa-n && fa->n->n)
	(2)想清楚while循环内应该使用p还是!p ,||还是&&
	(3)！！！pac：不论是(1)中那种，**注意，要先判断前一位指针再判断后一位指针是否为空**
	**先判断f->n>n行不行？必须先判断f->n**,因为f->n可能已经为空，此时先判断f->n->n，判断的是空指针的next会出错，所以注意先判断前一位指针再判断后一位指针是否为空，同理**f要在f->n之前判断**

```

ListNode* middleNode(ListNode* head) {
        ListNode * fast = head, *slow = head;
        while(fast != nullptr && fast->next != nullptr){//第二位
            fast = fast->next->next;
            slow = slow->next;
        }
        return slow;
    }
    
ListNode* middleNode(ListNode* head) {
        ListNode * fast = head, *slow = head;
        while( fast->next != nullptr && fast->next->next != nullptr){//第一位
            fast = fast->next->next;
            slow = slow->next;
        }
        return slow;
    }    
```



```
给定一个链表的 头节点 head ，请判断其是否为回文链表。
如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
示例 1：
输入: head = [1,2,3,3,2,1]
输出: true
示例 2：
输入: head = [1,2]
输出: false
提示：

链表 L 的长度范围为 [1, 105]
0 <= node.val <= 9
进阶：能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
```

```cpp
#O(n)+O(n)，遍历一遍链表用数组存储节点值双指针头尾向中间判断是否相等，但是O(n)+O(n)不满足题目进阶要求，需要修改
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {//vector存储节点值，双指针头尾向中间判断是否相等，但是O(n)+O(n)不满足题目进阶要求
        vector<int> vals;
        while(head){
            vals.push_back(head->val);
            head = head->next;
        }
        int n = vals.size();
        for(int i = 0,j = n - 1;i < j;i++, j--)
            if(vals[i] != vals[j]) return false;
        return true;
    }
};
```

```cpp
#答案思想：采用了206反转链表+876寻找链表中间节点：寻找到中间结点，pac**将后半部分反转**，双指针从头+中间向后遍历
class Solution {
public:
    ListNode* reverse(ListNode* cur){
            ListNode *pre = nullptr;
            while(cur){
                ListNode* next = cur->next;
                cur->next= pre;
                pre = cur;
                cur = next;
            }//pre为头结点
            return pre;
    }
    bool isPalindrome(ListNode* head) {
        if(!head->next) return true;
        ListNode *fast = head, *slow = head;
        // while(!fast->next->next || !fast->next){//pac 这里是&&不是||
        while(fast->next && fast->next->next){//这里是f->n->n而非f->n，与之前寻找中间结点不同，这里找的是偶数个节点的第一位而不是第二位
            fast = fast->next->next;
            slow = slow->next;
        }
        ListNode* preend = slow, *backstart = slow->next;//奇偶统一操作，记录preend，backstart一会back两次反转再拼接回来
        backstart = reverse(slow->next);//后半段反转
        ListNode * comp1 = head, *comp2 = backstart;
        while(comp2){
            if(comp1->val != comp2->val) return false;
            comp1 = comp1->next; comp2 = comp2->next;
        }
        backstart = reverse(backstart);//后半部再反转回来
        preend->next = backstart;//插到原中间结点后面,还原链表
        return true;
    }
};
```

```cpp
答案：函数都封装看着简洁
    class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if (head == nullptr) {
            return true;
        }

        // 找到前半部分链表的尾节点并反转后半部分链表
        ListNode* firstHalfEnd = endOfFirstHalf(head);
        ListNode* secondHalfStart = reverseList(firstHalfEnd->next);

        // 判断是否回文
        ListNode* p1 = head;
        ListNode* p2 = secondHalfStart;
        bool result = true;
        while (result && p2 != nullptr) {
            if (p1->val != p2->val) {
                result = false;
            }
            p1 = p1->next;
            p2 = p2->next;
        }        

        // 还原链表并返回结果
        firstHalfEnd->next = reverseList(secondHalfStart);
        return result;
    }

    ListNode* reverseList(ListNode* head) {
        ListNode* prev = nullptr;
        ListNode* curr = head;
        while (curr != nullptr) {
            ListNode* nextTemp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    ListNode* endOfFirstHalf(ListNode* head) {
        ListNode* fast = head;
        ListNode* slow = head;
        while (fast->next->next != nullptr && fast->next != nullptr) {
            //fast->next != nullptr && fast->next->next != nullptr
            fast = fast->next->next;
            slow = slow->next;
        }
        return slow;
    }
};
```

