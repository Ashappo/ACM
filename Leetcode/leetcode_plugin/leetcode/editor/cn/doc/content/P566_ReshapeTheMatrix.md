<p>在 MATLAB 中，有一个非常有用的函数 <code>reshape</code> ，它可以将一个&nbsp;<code>m x n</code> 矩阵重塑为另一个大小不同（<code>r x c</code>）的新矩阵，但保留其原始数据。</p>

<p>给你一个由二维数组 <code>mat</code> 表示的&nbsp;<code>m x n</code> 矩阵，以及两个正整数 <code>r</code> 和 <code>c</code> ，分别表示想要的重构的矩阵的行数和列数。</p>

<p>重构后的矩阵需要将原始矩阵的所有元素以相同的<strong> 行遍历顺序 </strong>填充。</p>

<p>如果具有给定参数的 <code>reshape</code> 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/reshape1-grid.jpg" style="width: 613px; height: 173px;" /> 
<pre>
<strong>输入：</strong>mat = [[1,2],[3,4]], r = 1, c = 4
<strong>输出：</strong>[[1,2,3,4]]
</pre>

<p><strong>示例 2：</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/reshape2-grid.jpg" style="width: 453px; height: 173px;" /> 
<pre>
<strong>输入：</strong>mat = [[1,2],[3,4]], r = 2, c = 4
<strong>输出：</strong>[[1,2],[3,4]]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>m == mat.length</code></li> 
 <li><code>n == mat[i].length</code></li> 
 <li><code>1 &lt;= m, n &lt;= 100</code></li> 
 <li><code>-1000 &lt;= mat[i][j] &lt;= 1000</code></li> 
 <li><code>1 &lt;= r, c &lt;= 300</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 矩阵 | 模拟</details><br>

<div>👍 426, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题不难，但指出了一个必知必会的算法技巧：**多维坐标之间的映射转换**。

我直接说结论：**任何多维数组都可以被映射到一维，所以甭管几维数组，你统一把多维的坐标转化成一维，然后再从一维坐标转化到多维**。

所以这道题，我们先把二维坐标转化成一维，然后再转化成不同 shape 的二维坐标即可。

我这里实现了通用的 `get/set` 函数，关于坐标维度转化的运用，还可以看下 [74. 搜索二维矩阵](/problems/search-a-2d-matrix)。

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

#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        int m = mat.size(), n = mat[0].size();
        // 如果想成功 reshape，元素个数应该相同
        if (r * c != m * n) {
            return mat;
        }

        vector<vector<int>> res(r, vector<int>(c));
        for (int i = 0; i < m * n; i++) {
            set(res, i, get(mat, i));
        }
        return res;
    }

    // 通过一维坐标访问二维数组中的元素
    int get(vector<vector<int>>& matrix, int index) {
        int m = matrix.size(), n = matrix[0].size();
        // 计算二维中的横纵坐标
        int i = index / n, j = index % n;
        return matrix[i][j];
    }

    // 通过一维坐标设置二维数组中的元素
    void set(vector<vector<int>>& matrix, int index, int value) {
        int m = matrix.size(), n = matrix[0].size();
        // 计算二维中的横纵坐标
        int i = index / n, j = index % n;
        matrix[i][j] = value;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        m, n = len(mat), len(mat[0])
        # 如果想成功 reshape，元素个数应该相同
        if r * c != m * n:
            return mat

        res = [[0] * c for _ in range(r)]
        for i in range(m * n):
            self.set(res, i, self.get(mat, i))
        return res

    # 通过一维坐标访问二维数组中的元素
    def get(self, matrix: List[List[int]], index: int) -> int:
        m, n = len(matrix), len(matrix[0])
        # 计算二维中的横纵坐标
        i, j = divmod(index, n)
        return matrix[i][j]

    # 通过一维坐标设置二维数组中的元素
    def set(self, matrix: List[List[int]], index: int, value: int) -> None:
        m, n = len(matrix), len(matrix[0])
        # 计算二维中的横纵坐标
        i, j = divmod(index, n)
        matrix[i][j] = value
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        // 如果想成功 reshape，元素个数应该相同
        if (r * c != m * n) {
            return mat;
        }

        int[][] res = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            set(res, i, get(mat, i));
        }
        return res;
    }

    // 通过一维坐标访问二维数组中的元素
    int get(int[][] matrix, int index) {
        int m = matrix.length, n = matrix[0].length;
        // 计算二维中的横纵坐标
        int i = index / n, j = index % n;
        return matrix[i][j];
    }

    // 通过一维坐标设置二维数组中的元素
    void set(int[][] matrix, int index, int value) {
        int m = matrix.length, n = matrix[0].length;
        // 计算二维中的横纵坐标
        int i = index / n, j = index % n;
        matrix[i][j] = value;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func matrixReshape(mat [][]int, r int, c int) [][]int {
    n := len(mat[0])
    // 如果想成功 reshape，元素个数应该相同
    if r*c != len(mat)*n {
        return mat
    }

    res := make([][]int, r)
    for i := range res {
        res[i] = make([]int, c)
    }
    
    for i := 0; i < len(mat)*n; i++ {
        set(&res, i, get(&mat, i, n))
    }
    return res
}

// 通过一维坐标访问二维数组中的元素
func get(matrix *[][]int, index int, n int) int {
    // 计算二维中的横纵坐标
    i := index / n
    j := index % n
    return (*matrix)[i][j]
}

// 通过一维坐标设置二维数组中的元素
func set(matrix *[][]int, index int, value int) {
    n := len((*matrix)[0])
    // 计算二维中的横纵坐标
    i := index / n
    j := index % n
    (*matrix)[i][j] = value
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var matrixReshape = function(mat, r, c) {
    const m = mat.length, n = mat[0].length;
    // 如果想成功 reshape，元素个数应该相同
    if (r * c !== m * n) {
        return mat;
    }

    const res = new Array(r).fill(0).map(() => new Array(c));
    for (let i = 0; i < m * n; i++) {
        set(res, i, get(mat, i));
    }
    return res;
};

// 通过一维坐标访问二维数组中的元素
function get(matrix, index) {
    const m = matrix.length, n = matrix[0].length;
    // 计算二维中的横纵坐标
    const i = Math.floor(index / n), j = index % n;
    return matrix[i][j];
}

// 通过一维坐标设置二维数组中的元素
function set(matrix, index, value) {
    const m = matrix.length, n = matrix[0].length;
    // 计算二维中的横纵坐标
    const i = Math.floor(index / n), j = index % n;
    matrix[i][j] = value;
}
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌈🌈 算法可视化 🌈🌈</strong></summary><div id="data_reshape-the-matrix" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_reshape-the-matrix"></div></div>
</details><hr /><br />

**类似题目**：
  - [519. 随机翻转矩阵 🟠](/problems/random-flip-matrix)

</div>

</details>
</div>

