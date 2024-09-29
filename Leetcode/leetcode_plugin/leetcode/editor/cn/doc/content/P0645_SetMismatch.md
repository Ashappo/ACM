<p>集合 <code>s</code> 包含从 <code>1</code> 到&nbsp;<code>n</code>&nbsp;的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 <strong>丢失了一个数字</strong> 并且 <strong>有一个数字重复</strong> 。</p>

<p>给定一个数组 <code>nums</code> 代表了集合 <code>S</code> 发生错误后的结果。</p>

<p>请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,2,2,4]
<strong>输出：</strong>[2,3]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,1]
<strong>输出：</strong>[1,2]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>位运算 | 数组 | 哈希表 | 排序</details><br>

<div>👍 377, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/frequency-interview/mismatch-set/" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题的核心思路是将每个索引对应的元素变成负数，以表示这个索引被对应过一次。

如果出现重复元素 `4`，直观结果就是，索引 `4` 所对应的元素已经是负数了：

![](https://labuladong.online/algo/images/dupmissing/2.jpg)

对于缺失元素 `3`，直观结果就是，索引 `3` 所对应的元素是正数：

![](https://labuladong.online/algo/images/dupmissing/3.jpg)

依据这个特点，就能找到缺失和重复的元素了。

**详细题解：[如何同时寻找缺失和重复的元素](https://labuladong.online/algo/frequency-interview/mismatch-set/)**

</div>

**标签：[数学](https://labuladong.online/algo/)，[数组](https://labuladong.online/algo/)**

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
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();
        int dup = -1;
        for (int i = 0; i < n; i++) {
            // 现在的元素是从 1 开始的
            int index = abs(nums[i]) - 1;
            if (nums[index] < 0)
                dup = abs(nums[i]);
            else
                nums[index] *= -1;
        }

        int missing = -1;
        for (int i = 0; i < n; i++)
            if (nums[i] > 0)
                // 将索引转换成元素
                missing = i + 1;

        return vector<int>{dup, missing};
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def findErrorNums(self, nums):
        n = len(nums)
        dup = -1
        for i in range(n):
            # 现在的元素是从 1 开始的
            index = abs(nums[i]) - 1
            if nums[index] < 0:
                dup = abs(nums[i])
            else:
                nums[index] *= -1

        missing = -1
        for i in range(n):
            if nums[i] > 0:
                # 将索引转换成元素
                missing = i + 1

        return [dup, missing]
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dup = -1;
        for (int i = 0; i < n; i++) {
            // 现在的元素是从 1 开始的
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                dup = Math.abs(nums[i]);
            else
                nums[index] *= -1;
        }

        int missing = -1;
        for (int i = 0; i < n; i++)
            if (nums[i] > 0)
                // 将索引转换成元素
                missing = i + 1;

        return new int[]{dup, missing};
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func findErrorNums(nums []int) []int {
    n := len(nums)
    dup := -1
    for i := 0; i < n; i++ {
        // 现在的元素是从 1 开始的
        index := abs(nums[i]) - 1
        if nums[index] < 0 {
            dup = abs(nums[i])
        } else {
            nums[index] *= -1
        }
    }

    missing := -1
    for i := 0; i < n; i++ {
        if nums[i] > 0 {
            // 将索引转换成元素
            missing = i + 1
        }
    }

    return []int{dup, missing}
}

// Helper function to calculate absolute value
func abs(x int) int {
    if x < 0 {
        return -x
    }
    return x
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var findErrorNums = function(nums) {
    let n = nums.length;
    let dup = -1;
    for (let i = 0; i < n; i++) {
        // 现在的元素是从 1 开始的
        let index = Math.abs(nums[i]) - 1;
        if (nums[index] < 0)
            dup = Math.abs(nums[i]);
        else
            nums[index] *= -1;
    }

    let missing = -1;
    for (let i = 0; i < n; i++)
        if (nums[i] > 0)
            // 将索引转换成元素
            missing = i + 1;

    return [dup, missing];
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌟🌟 算法可视化 🌟🌟</strong></summary><div id="data_set-mismatch" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_set-mismatch"></div></div>
</details><hr /><br />

</div>

</details>
</div>

