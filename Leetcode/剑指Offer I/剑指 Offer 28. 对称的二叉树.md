> 注意：本题与主站 101 题相同：https://leetcode-cn.com/problems/symmetric-tree/
> 链接：https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof
>
> 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
>
> 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
>
>     1
>    / \
>   2   2
>  / \ / \
> 3  4 4  3
> 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
>
>     1
>    / \
>   2   2
>    \   \
>    3    3
>
>  
>
> 示例 1：
>
> 输入：root = [1,2,2,3,4,4,3]
> 输出：true
> 示例 2：
>
> 输入：root = [1,2,2,null,3,null,3]
> 输出：false
>
>
> 限制：
>
> 0 <= 节点个数 <= 1000
>



```cpp
#迭代
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool eq(TreeNode * q, TreeNode * p){
        queue<TreeNode *> que;   
        que.push(q); que.push(p);//每次推入两个节点
        while(!que.empty()){
            TreeNode * p = que.front(); que.pop();//每次拿出两个pq
            TreeNode * q = que.front(); que.pop();
            if(!p && !q)    continue;//pac不能缺，不然没法处理nullptr
            // if((p && !q) || (!p && q) || (p->val != q->val)) return false;
            if((!p || !q)|| p->val != q->val) return false;
            que.push(p->left);  que.push(q->right);//每次连续推入两个节点p->l+q->r,下面亦然
            que.push(p->right);  que.push(q->left);
        }
        return true;
    }
    bool isSymmetric(TreeNode* root) {
        return eq(root, root);
    }
};
```

```cpp
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool eq(TreeNode* p, TreeNode * q){
        if(!p && !q)    return true;
        if(!p || !q)    return false;
        return (p->val == q->val && eq(p->left,q->right) && eq(p->right, q->left));
    }
    bool isSymmetric(TreeNode* root) {
        return eq(root,root);
    }
};
```

