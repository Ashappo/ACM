<p>给定一个大小为 <code>n</code><em> </em>的数组&nbsp;<code>nums</code> ，返回其中的多数元素。多数元素是指在数组中出现次数 <strong>大于</strong>&nbsp;<code>⌊ n/2 ⌋</code>&nbsp;的元素。</p>

<p>你可以假设数组是非空的，并且给定的数组总是存在多数元素。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,2,3]
<strong>输出：</strong>3</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,2,1,1,1,2,2]
<strong>输出：</strong>2
</pre>

<p>&nbsp;</p> 
<strong>提示：</strong>

<ul> 
 <li><code>n == nums.length</code></li> 
 <li><code>1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li> 
 <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li> 
</ul>

<p>&nbsp;</p>

<p><strong>进阶：</strong>尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。</p>

<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 分治 | 计数 | 排序</details><br>

<div>👍 2286, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这道题的标准解法肯定是用一个哈希表作为计数器记录每个元素出现的次数，然后寻找出现次数最多的那个元素，时间和空间复杂度都是 `O(N)`。

但是由于题目说了这个目标元素（众数）出现的次数**过半**，这就有意思了，其实我们不需要用哈希表来做计数器就能把这个众数找出来。

你想象一下，比方说一群带正电的粒子和一群带负电的粒子，把它们混合起来，得到的这群混合粒子的带电性质是什么？这取决于正电离子多还是负电离子多，如果正负粒子数量恰好相等，则呈电中性。

回到这道题，题目告诉你一定存在一个众数，它出现的次数过半，那么如果你把这个众数元素想象成正电粒子，其他的所有元素都想象成负电粒子，那么它们混合起来会怎样？

**在正负粒子混合的过程中，整体的带电性可能在正负间波动，但最终的结果一定是正电**。

有了这个类比，你看下解法代码，我们是如何用 `O(1)` 的空间复杂度来计算众数的。

</div>

**标签：哈希表，[数组](https://labuladong.online/algo/)**

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
    int majorityElement(vector<int>& nums) {
        // 我们想寻找的那个众数
        int target = 0;
        // 计数器（类比带电粒子例子中的带电性）
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count == 0) {
                // 当计数器为 0 时，假设 nums[i] 就是众数
                target = nums[i];
                // 众数出现了一次
                count = 1;
            } else if (nums[i] == target) {
                // 如果遇到的是目标众数，计数器累加
                count++;
            } else {
                // 如果遇到的不是目标众数，计数器递减
                count--;
            }
        }
        // 回想带电粒子的例子
        // 此时的 count 必然大于 0，此时的 target 必然就是目标众数
        return target;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # 我们想寻找的那个众数
        target = 0
        # 计数器（类比带电粒子例子中的带电性）
        count = 0
        for i in range(len(nums)):
            if count == 0:
                # 当计数器为 0 时，假设 nums[i] 就是众数
                target = nums[i]
                # 众数出现了一次
                count = 1
            elif nums[i] == target:
                # 如果遇到的是目标众数，计数器累加
                count += 1
            else:
                # 如果遇到的不是目标众数，计数器递减
                count -= 1
        # 回想带电粒子的例子
        # 此时的 count 必然大于 0，此时的 target 必然就是目标众数
        return target
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int majorityElement(int[] nums) {
        // 我们想寻找的那个众数
        int target = 0;
        // 计数器（类比带电粒子例子中的带电性）
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                // 当计数器为 0 时，假设 nums[i] 就是众数
                target = nums[i];
                // 众数出现了一次
                count = 1;
            } else if (nums[i] == target) {
                // 如果遇到的是目标众数，计数器累加
                count++;
            } else {
                // 如果遇到的不是目标众数，计数器递减
                count--;
            }
        }
        // 回想带电粒子的例子
        // 此时的 count 必然大于 0，此时的 target 必然就是目标众数
        return target;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func majorityElement(nums []int) int {
    // 我们想寻找的那个众数
    var target int
    // 计数器（类比带电粒子例子中的带电性）
    var count int
    for _, num := range nums {
        if count == 0 {
            // 当计数器为 0 时，假设 nums[i] 就是众数
            target = num
            // 众数出现了一次
            count = 1
        } else if num == target {
            // 如果遇到的是目标众数，计数器累加
            count++
        } else {
            // 如果遇到的不是目标众数，计数器递减
            count--
        }
    }
    // 回想带电粒子的例子
    // 此时的 count 必然大于 0，此时的 target 必然就是目标众数
    return target
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var majorityElement = function(nums) {
    // 我们想寻找的那个众数
    let target = 0;
    // 计数器（类比带电粒子例子中的带电性）
    let count = 0;
    for (let i = 0; i < nums.length; i++) {
        if (count === 0) {
            // 当计数器为 0 时，假设 nums[i] 就是众数
            target = nums[i];
            // 众数出现了一次
            count = 1;
        } else if (nums[i] === target) {
            // 如果遇到的是目标众数，计数器累加
            count++;
        } else {
            // 如果遇到的不是目标众数，计数器递减
            count--;
        }
    }
    // 回想带电粒子的例子
    // 此时的 count 必然大于 0，此时的 target 必然就是目标众数
    return target;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌈🌈 算法可视化 🌈🌈</strong></summary><div id="data_majority-element" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_majority-element"></div></div>
</details><hr /><br />

**类似题目**：
  - [剑指 Offer 39. 数组中出现次数超过一半的数字 🟢](/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof)

</div>

</details>
</div>

