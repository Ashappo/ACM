<p>给你一个二维整数数组 <code>matrix</code>，&nbsp;返回 <code>matrix</code> 的 <strong>转置矩阵</strong> 。</p>

<p>矩阵的 <strong>转置</strong> 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。</p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2021/02/10/hint_transpose.png" style="width: 600px; height: 197px;" /></p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>matrix = [[1,2,3],[4,5,6],[7,8,9]]
<strong>输出：</strong>[[1,4,7],[2,5,8],[3,6,9]]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>matrix = [[1,2,3],[4,5,6]]
<strong>输出：</strong>[[1,4],[2,5],[3,6]]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>m == matrix.length</code></li> 
 <li><code>n == matrix[i].length</code></li> 
 <li><code>1 &lt;= m, n &lt;= 1000</code></li> 
 <li><code>1 &lt;= m * n &lt;= 10<sup>5</sup></code></li> 
 <li><code>-10<sup>9</sup> &lt;= matrix[i][j] &lt;= 10<sup>9</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 矩阵 | 模拟</details><br>

<div>👍 267, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这道题没啥特别的技巧，new 出来一个新的转置矩阵，其中 `(x, y)` 的值为原矩阵的 `(y, x)` 的值，直接写代码就行了。

我知道有些优秀的读者会思考如何原地转置，但是矩阵转置这种问题肯定是做不到的，因为数组的维度都不同。比方说 3x2 的矩阵，转置之后会变成 2x3 的，你不 new 一个新数组出来怎么可能做到呢？

当然，原地修改数组是非常考验技术的，一些有技巧性的二维矩阵操作参见 [二维数组的花式遍历](https://labuladong.online/algo/practice-in-action/2d-array-traversal-summary/)。

</div>

**标签：二维矩阵，[数组](https://labuladong.online/algo/)**

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
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
        // 转置矩阵的长和宽颠倒
        vector<vector<int>> res(n, vector<int>(m));
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        return res;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        m = len(matrix)
        n = len(matrix[0])
        # 转置矩阵的长和宽颠倒
        res = [[0] * m for _ in range(n)]
        for i in range(m):
            for j in range(n):
                res[j][i] = matrix[i][j]
        return res
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        // 转置矩阵的长和宽颠倒
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        return res;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func transpose(matrix [][]int) [][]int {
    m := len(matrix)
    n := len(matrix[0])
    // 转置矩阵的长和宽颠倒
    res := make([][]int, n)
    for i := 0; i < n; i++ {
        res[i] = make([]int, m)
    }
    for i := 0; i < m; i++ {
        for j := 0; j < n; j++ {
            res[j][i] = matrix[i][j]
        }
    }
    return res
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var transpose = function(matrix) {
    let m = matrix.length, n = matrix[0].length;
    // 转置矩阵的长和宽颠倒
    let res = Array.from({length: n}, () => Array(m).fill(0));
    for (let i = 0; i < m; i++)
        for (let j = 0; j < n; j++) {
            res[j][i] = matrix[i][j];
        }
    return res;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌟🌟 算法可视化 🌟🌟</strong></summary><div id="data_transpose-matrix" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_transpose-matrix"></div></div>
</details><hr /><br />

</div>

</details>
</div>

