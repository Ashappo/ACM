<p>如果二叉树每个节点都具有相同的值，那么该二叉树就是<em>单值</em>二叉树。</p>

<p>只有给定的树是单值二叉树时，才返回&nbsp;<code>true</code>；否则返回 <code>false</code>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/screen-shot-2018-12-25-at-50104-pm.png" style="height: 159px; width: 200px;" /></p>

<pre><strong>输入：</strong>[1,1,1,1,1,null,1]
<strong>输出：</strong>true
</pre>

<p><strong>示例 2：</strong></p>

<p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/screen-shot-2018-12-25-at-50050-pm.png" style="height: 158px; width: 200px;" /></p>

<pre><strong>输入：</strong>[2,2,2,5,2]
<strong>输出：</strong>false
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol> 
 <li>给定树的节点数范围是&nbsp;<code>[1, 100]</code>。</li> 
 <li>每个节点的值都是整数，范围为&nbsp;<code>[0, 99]</code>&nbsp;。</li> 
</ol>

<details><summary><strong>Related Topics</strong></summary>树 | 深度优先搜索 | 广度优先搜索 | 二叉树</details><br>

<div>👍 204, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

前文 [手把手刷二叉树总结篇](https://labuladong.online/algo/essential-technique/binary-tree-summary/) 说过二叉树的递归分为「遍历」和「分解问题」两种思维模式，这道题需要用到「遍历」的思维。

用 `traverse` 遍历框架遍历一遍二叉树即可得出答案。

</div>

<div id="solution">

## 解法代码



<div class="tab-panel"><div class="tab-nav">
<button data-tab-item="cpp" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">cpp🤖</button>

<button data-tab-item="python" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">python🤖</button>

<button data-tab-item="java" class="tab-nav-button btn active" data-tab-group="default" onclick="switchTab(this)">java🟢</button>

<button data-tab-item="go" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">go🤖</button>

<button data-tab-item="javascript" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">javascript🤖</button>
</div><div class="tab-content">
<div data-tab-item="cpp" class="tab-item " data-tab-group="default"><div class="highlight">

```cpp
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

// Assuming that the TreeNode class is already defined in the LeetCode environment.
class Solution {
public:
    bool isUnivalTree(TreeNode* root) {
        if (root == nullptr) {
            return true;
        }
        prev = root->val;
        isUnival = true; // Initialize here to handle multiple calls to isUnivalTree
        traverse(root);
        return isUnival;
    }

private:
    int prev;
    bool isUnival; // Removed the assignment here to avoid reinitialization between calls

    void traverse(TreeNode* root) {
        if (root == nullptr || !isUnival) {
            return;
        }
        if (root->val != prev) {
            isUnival = false;
            return;
        }
        traverse(root->left);
        traverse(root->right);
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

class Solution:
    def isUnivalTree(self, root: TreeNode) -> bool:
        if root is None:
            return True
        self.prev = root.val
        self.traverse(root)
        return self.isUnival

    def __init__(self):
        self.prev = 0
        self.isUnival = True

    def traverse(self, root: TreeNode):
        if root is None or not self.isUnival:
            return
        if root.val != self.prev:
            self.isUnival = False
            return
        self.traverse(root.left)
        self.traverse(root.right)
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        prev = root.val;
        traverse(root);
        return isUnival;
    }

    int prev;
    boolean isUnival = true;

    void traverse(TreeNode root) {
        if (root == null || !isUnival) {
            return;
        }
        if (root.val != prev) {
            isUnival = false;
            return;
        }
        traverse(root.left);
        traverse(root.right);
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

func isUnivalTree(root *TreeNode) bool {
    if root == nil {
        return true
    }
    prev := root.Val
    isUnival := true
    traverse(root, &prev, &isUnival)
    return isUnival
}

func traverse(root *TreeNode, prev *int, isUnival *bool) {
    if root == nil || !*isUnival {
        return
    }
    if root.Val != *prev {
        *isUnival = false
        return
    }
    traverse(root.Left, prev, isUnival)
    traverse(root.Right, prev, isUnival)
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

var isUnivalTree = function(root) {
    let prev;
    let isUnival = true;

    var traverse = function(root) {
        if (root === null || !isUnival) {
            return;
        }
        if (root.val !== prev) {
            isUnival = false;
            return;
        }
        traverse(root.left);
        traverse(root.right);
    };

    if (root === null) {
        return true;
    }
    prev = root.val;
    traverse(root);
    return isUnival;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>👾👾 算法可视化 👾👾</strong></summary><div id="data_univalued-binary-tree" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_univalued-binary-tree"></div></div>
</details><hr /><br />

</div>

</details>
</div>

