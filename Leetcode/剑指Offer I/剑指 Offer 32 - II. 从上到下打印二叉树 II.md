> 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
> 链接：https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
>
> 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
>
>  
>
> 例如:
> 给定二叉树: [3,9,20,null,null,15,7],
>
>     3
>    / \
>   9  20
>     /  \
>    15   7
> 返回其层次遍历结果：
>
> [
>   [3],
>   [9,20],
>   [15,7]
> ]
>
>
> 提示：
>
> 节点总数 <= 1000
> 
>

```cpp
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
    vector<vector<int>> levelOrder(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> ans;
        if(!root) return ans;
        q.push(root);
        while(!q.empty()){
            int n = q.size();
            ans.push_back(vector<int>());//给空不能给ans.push_back(vector<int>(n));
            while(n--){
                TreeNode * node = q.front(); q.pop();
                if(node->left)  q.push(node->left); 
                if(node->right)  q.push(node->right);
                ans.back().push_back(node->val);
            }
        }
        return ans;
    }
};
```

