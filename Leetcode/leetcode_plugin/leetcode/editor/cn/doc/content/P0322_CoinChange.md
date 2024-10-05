<p>给你一个整数数组 <code>coins</code> ，表示不同面额的硬币；以及一个整数 <code>amount</code> ，表示总金额。</p>

<p>计算并返回可以凑成总金额所需的 <strong>最少的硬币个数</strong> 。如果没有任何一种硬币组合能组成总金额，返回&nbsp;<code>-1</code> 。</p>

<p>你可以认为每种硬币的数量是无限的。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1：</strong></p>

<pre>
<strong>输入：</strong>coins = <span><code>[1, 2, 5]</code></span>, amount = <span><code>11</code></span>
<strong>输出：</strong><span><code>3</code></span> 
<strong>解释：</strong>11 = 5 + 5 + 1</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>coins = <span><code>[2]</code></span>, amount = <span><code>3</code></span>
<strong>输出：</strong>-1</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>coins = [1], amount = 0
<strong>输出：</strong>0
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= coins.length &lt;= 12</code></li> 
 <li><code>1 &lt;= coins[i] &lt;= 2<sup>31</sup> - 1</code></li> 
 <li><code>0 &lt;= amount &lt;= 10<sup>4</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>广度优先搜索 | 数组 | 动态规划</details><br>

<div>👍 2900, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/essential-technique/dynamic-programming-framework/" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

> 本文有视频版：[动态规划框架套路详解](https://www.bilibili.com/video/BV1XV411Y7oE)

1、**确定 base case**，显然目标金额 `amount` 为 0 时算法返回 0，因为不需要任何硬币就已经凑出目标金额了。

2、**确定「状态」，也就是原问题和子问题中会变化的变量**。由于硬币数量无限，硬币的面额也是题目给定的，只有目标金额会不断地向 base case 靠近，所以唯一的「状态」就是目标金额 `amount`。

3、**确定「选择」，也就是导致「状态」产生变化的行为**。目标金额为什么变化呢，因为你在选择硬币，你每选择一枚硬币，就相当于减少了目标金额。所以说所有硬币的面值，就是你的「选择」。

4、**明确 `dp` 函数/数组的定义**：输入一个目标金额 `n`，返回凑出目标金额 `n` 的最少硬币数量。

按照 `dp` 函数的定义描述「选择」，得到最终答案 `dp(amount)`。

**详细题解：[动态规划解题套路框架](https://labuladong.online/algo/essential-technique/dynamic-programming-framework/)**

</div>

**标签：[一维动态规划](https://labuladong.online/algo/)，[动态规划](https://labuladong.online/algo/)，最短路径算法**

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
#include <algorithm>
#include <climits>

using namespace std;

class Solution {
public:
    vector<int> memo;

    int coinChange(vector<int>& coins, int amount) {
        // dp 数组全都初始化为特殊值
        memo.resize(amount + 1, -666);
        return dp(coins, amount);
    }

    int dp(vector<int>& coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        // 查备忘录，防止重复计算
        if (memo[amount] != -666)
            return memo[amount];

        int res = INT_MAX;
        for (int coin : coins) {
            // 计算子问题的结果
            int subProblem = dp(coins, amount - coin);
            // 子问题无解则跳过
            if (subProblem == -1) continue;
            // 在子问题中选择最优解，然后加一
            res = min(res, subProblem + 1);
        }
        // 把计算结果存入备忘录
        memo[amount] = (res == INT_MAX) ? -1 : res;
        return memo[amount];
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def __init__(self):
        self.memo = None

    def coinChange(self, coins: List[int], amount: int) -> int:
        self.memo = [-666] * (amount + 1)
        # dp 数组全都初始化为特殊值
        return self.dp(coins, amount)

    def dp(self, coins, amount):
        if amount == 0:
            return 0
        if amount < 0:
            return -1
        # 查备忘录，防止重复计算
        if self.memo[amount] != -666:
            return self.memo[amount]

        res = float('inf')
        for coin in coins:
            # 计算子问题的结果
            subProblem = self.dp(coins, amount - coin) # <extend up -200>![](https://labuladong.online/algo/images/动态规划详解进阶/5.jpg) #
            # 子问题无解则跳过
            if subProblem == -1:
                continue
            # 在子问题中选择最优解，然后加一
            res = min(res, subProblem + 1)

        # 把计算结果存入备忘录
        self.memo[amount] = -1 if res == float('inf') else res
        return self.memo[amount]
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        // dp 数组全都初始化为特殊值
        Arrays.fill(memo, -666);
        return dp(coins, amount);
    }

    int dp(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        // 查备忘录，防止重复计算
        if (memo[amount] != -666)
            return memo[amount];

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            // 计算子问题的结果
            int subProblem = dp(coins, amount - coin);/**<extend up -200>![](https://labuladong.online/algo/images/动态规划详解进阶/5.jpg) */
            // 子问题无解则跳过
            if (subProblem == -1) continue;
            // 在子问题中选择最优解，然后加一
            res = Math.min(res, subProblem + 1);
        }
        // 把计算结果存入备忘录
        memo[amount] = (res == Integer.MAX_VALUE) ? -1 : res;
        return memo[amount];
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func coinChange(coins []int, amount int) int {
    memo := make([]int, amount+1)
    // dp 数组全都初始化为特殊值
    for i := range memo {
        memo[i] = -666
    }
    return dp(coins, amount, memo)
}

func dp(coins []int, amount int, memo []int) int {
    if amount == 0 {
        return 0
    }
    if amount < 0 {
        return -1
    }
    // 查备忘录，防止重复计算
    if memo[amount] != -666 {
        return memo[amount]
    }

    res := math.MaxInt32
    for _, coin := range coins {
        // 计算子问题的结果
        subProblem := dp(coins, amount-coin, memo)
        // 子问题无解则跳过
        if subProblem == -1 {
            continue
        }
        // 在子问题中选择最优解，然后加一
        res = min(res, subProblem+1)
    }
    // 把计算结果存入备忘录
    memo[amount] = -1
    if res != math.MaxInt32 {
        memo[amount] = res
    }
    return memo[amount]
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var coinChange = function(coins, amount) {
    // dp 数组全都初始化为特殊值
    let memo = new Array(amount + 1).fill(-666);
    // @visualize status(amount)
    var dp = function(amount) {
        if (amount === 0) return 0;
        if (amount < 0) return -1;
        // 查备忘录，防止重复计算
        if (memo[amount] !== -666)
            return memo[amount];

        let res = Number.MAX_VALUE;
        for (let coin of coins) {
            // 计算子问题的结果
            // @visualize choose(coin)
            let subProblem = dp(amount - coin);
            // @visualize unchoose()
            // 子问题无解则跳过
            if (subProblem === -1) continue;
            // 在子问题中选择最优解，然后加一
            res = Math.min(res, subProblem + 1);
        }
        // 把计算结果存入备忘录
        memo[amount] = (res === Number.MAX_VALUE) ? -1 : res;
        return memo[amount];
    }
    return dp(amount);
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌟🌟 算法可视化 🌟🌟</strong></summary><div id="data_coin-change" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_coin-change"></div></div>
</details><hr /><br />

**类似题目**：
  - [279. 完全平方数 🟠](/problems/perfect-squares)
  - [509. 斐波那契数 🟢](/problems/fibonacci-number)
  - [剑指 Offer II 103. 最少的硬币数目 🟠](/problems/gaM7Ch)

</div>

</details>
</div>

