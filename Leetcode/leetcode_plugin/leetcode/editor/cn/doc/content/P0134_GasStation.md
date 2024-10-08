<p>在一条环路上有 <code>n</code>&nbsp;个加油站，其中第 <code>i</code>&nbsp;个加油站有汽油&nbsp;<code>gas[i]</code><em>&nbsp;</em>升。</p>

<p>你有一辆油箱容量无限的的汽车，从第<em> </em><code>i</code><em> </em>个加油站开往第<em> </em><code>i+1</code><em>&nbsp;</em>个加油站需要消耗汽油&nbsp;<code>cost[i]</code><em>&nbsp;</em>升。你从其中的一个加油站出发，开始时油箱为空。</p>

<p>给定两个整数数组 <code>gas</code> 和 <code>cost</code> ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 <code>-1</code> 。如果存在解，则 <strong>保证</strong> 它是 <strong>唯一</strong> 的。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre>
<strong>输入:</strong> gas = [1,2,3,4,5], cost = [3,4,5,1,2]
<strong>输出:</strong> 3
<strong>解释:
</strong>从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油
开往 4 号加油站，此时油箱有 4 - 1 + 5 = 8 升汽油
开往 0 号加油站，此时油箱有 8 - 2 + 1 = 7 升汽油
开往 1 号加油站，此时油箱有 7 - 3 + 2 = 6 升汽油
开往 2 号加油站，此时油箱有 6 - 4 + 3 = 5 升汽油
开往 3 号加油站，你需要消耗 5 升汽油，正好足够你返回到 3 号加油站。
因此，3 可为起始索引。</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> gas = [2,3,4], cost = [3,4,3]
<strong>输出:</strong> -1
<strong>解释:
</strong>你不能从 0 号或 1 号加油站出发，因为没有足够的汽油可以让你行驶到下一个加油站。
我们从 2 号加油站出发，可以获得 4 升汽油。 此时油箱有 = 0 + 4 = 4 升汽油
开往 0 号加油站，此时油箱有 4 - 3 + 2 = 3 升汽油
开往 1 号加油站，此时油箱有 3 - 3 + 3 = 3 升汽油
你无法返回 2 号加油站，因为返程需要消耗 4 升汽油，但是你的油箱只有 3 升汽油。
因此，无论怎样，你都不可能绕环路行驶一周。</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul> 
 <li><code>gas.length == n</code></li> 
 <li><code>cost.length == n</code></li> 
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li> 
 <li><code>0 &lt;= gas[i], cost[i] &lt;= 10<sup>4</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>贪心 | 数组</details><br>

<div>👍 1710, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/frequency-interview/gas-station-greedy/" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题可以通过观察图像或者贪心算法解决，这里就说图像法，对贪心算法有兴趣的读者请看详细题解。

![](https://labuladong.online/algo/images/老司机/3.jpeg)

`sum` 代表路途中油箱的油量，如果把这个「最低点」作为起点，即把这个点作为坐标轴原点，就相当于把图像「最大限度」向上平移了：

![](https://labuladong.online/algo/images/老司机/4.jpeg)

如果经过平移后图像全部在 x 轴以上，就说明可以行使一周。

**详细题解：[老司机加油算法](https://labuladong.online/algo/frequency-interview/gas-station-greedy/)**

</div>

**标签：[数学](https://labuladong.online/algo/)，贪心算法**

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
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        // 相当于图像中的坐标点和最低点
        int sum = 0, minSum = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
            if (sum < minSum) {
                // 经过第 i 个站点后，使 sum 到达新低
                // 所以站点 i + 1 就是最低点（起点）
                start = i + 1;
                minSum = sum;
            }
        }
        if (sum < 0) {
            // 总油量小于总的消耗，无解
            return -1;
        }
        // 环形数组特性
        return start == n ? 0 : start;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n = len(gas)
        # 相当于图像中的坐标点和最低点
        sum = 0
        min_sum = 0
        start = 0
        for i in range(n):
            sum += gas[i] - cost[i]
            if sum < min_sum:
                # 经过第 i 个站点后，使 sum 到达新低
                # 所以站点 i + 1 就是最低点（起点）
                start = i + 1
                min_sum = sum
        if sum < 0:
            # 总油量小于总的消耗，无解
            return -1
        # 环形数组特性
        return 0 if start == n else start
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        // 相当于图像中的坐标点和最低点
        int sum = 0, minSum = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
            if (sum < minSum) {
                // 经过第 i 个站点后，使 sum 到达新低
                // 所以站点 i + 1 就是最低点（起点）
                start = i + 1;
                minSum = sum;
            }
        }
        if (sum < 0) {
            // 总油量小于总的消耗，无解
            return -1;
        }
        // 环形数组特性
        return start == n ? 0 : start;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func canCompleteCircuit(gas []int, cost []int) int {
    n := len(gas)
    // 相当于图像中的坐标点和最低点
    sum, minSum := 0, 0
    start := 0
    for i := 0; i < n; i++ {
        sum += gas[i] - cost[i]
        if sum < minSum {
            // 经过第 i 个站点后，使 sum 到达新低
            // 所以站点 i + 1 就是最低点（起点）
            start = i + 1
            minSum = sum
        }
    }
    if sum < 0 {
        // 总油量小于总的消耗，无解
        return -1
    }
    // 环形数组特性
    if start == n {
        return 0
    }
    return start
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var canCompleteCircuit = function(gas, cost) {
    let n = gas.length;
    // 相当于图像中的坐标点和最低点
    let sum = 0, minSum = 0;
    let start = 0;
    for (let i = 0; i < n; i++) {
        sum += gas[i] - cost[i];
        if (sum < minSum) {
            // 经过第 i 个站点后，使 sum 到达新低
            // 所以站点 i + 1 就是最低点（起点）
            start = i + 1;
            minSum = sum;
        }
    }
    if (sum < 0) {
        // 总油量小于总的消耗，无解
        return -1;
    }
    // 环形数组特性
    return start === n ? 0 : start;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🎃🎃 算法可视化 🎃🎃</strong></summary><div id="data_gas-station" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_gas-station"></div></div>
</details><hr /><br />

</div>

</details>
</div>

