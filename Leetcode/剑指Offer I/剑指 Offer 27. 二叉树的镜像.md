> 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/
> 链接：https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof
>
> 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
>
> 例如输入：
>
>      4
>    /   \
>   2     7
>  / \   / \
> 1   3 6   9
> 镜像输出：
>
>      4
>    /   \
>   7     2
>  / \   / \
> 9   6 3   1
>
>  
>
> 示例 1：
>
> 输入：root = [4,2,7,1,3,6,9]
> 输出：[4,7,2,9,6,3,1]
>
>
> 限制：
>
> 0 <= 节点个数 <= 1000
>
> 
> 
>

```cpp
#递归方法还是不熟练：能在自身本函数递归，就直接写，不要放到外面更麻烦。pac暂存节点，递归结束之前不能直接赋值给r|
l
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* mirrorTree(TreeNode* root) {
        if(!root) return nullptr;
        // node->left = mirrorTree(node->right);//pac 错的，应该先将mirrorTree(node->right)暂存，左右都递归完再给左右赋值
        // node->right = mirrorTree(node->left);
        TreeNode * left = mirrorTree(root->right);
        TreeNode * right = mirrorTree(root->left);
        root->left = left; root->right = right; 
        return root;
    }
};
```

```cpp
queue :pac front.pop
class Solution {
public:

    TreeNode* mirrorTree(TreeNode* root) {
        queue<TreeNode*> q;
        if(!root)   return root;
        q.push(root);
        while(!q.empty()){
            TreeNode * node = q.front(), *tem; q.pop();
            if(node->left)  q.push(node->left);
            if(node->right)  q.push(node->right);
            tem = node ->right;
            node->right = node->left;
            node->left = tem;
        }
        return root;
    }
};
```

```cpp
#stack pac:pop.top
class Solution {
public:

    TreeNode* mirrorTree(TreeNode* root) {
        stack<TreeNode*> q;
        if(!root)   return root;
        q.push(root);
        while(!q.empty()){
            TreeNode * node = q.top(), *tem; q.pop();
            if(node->left)  q.push(node->left);
            if(node->right)  q.push(node->right);
            tem = node ->right;
            node->right = node->left;
            node->left = tem;
        }
        return root;
    }
};
```

