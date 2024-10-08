<p>给你一个 <strong>非严格递增排列</strong> 的数组 <code>nums</code> ，请你<strong><a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank"> 原地</a></strong> 删除重复出现的元素，使每个元素 <strong>只出现一次</strong> ，返回删除后数组的新长度。元素的 <strong>相对顺序</strong> 应该保持 <strong>一致</strong> 。然后返回 <code>nums</code> 中唯一元素的个数。</p>

<p>考虑 <code>nums</code> 的唯一元素的数量为 <code>k</code> ，你需要做以下事情确保你的题解可以被通过：</p>

<ul> 
 <li>更改数组 <code>nums</code> ，使 <code>nums</code> 的前 <code>k</code> 个元素包含唯一元素，并按照它们最初在 <code>nums</code> 中出现的顺序排列。<code>nums</code>&nbsp;的其余元素与 <code>nums</code> 的大小不重要。</li> 
 <li>返回 <code>k</code>&nbsp;。</li> 
</ul>

<p><strong>判题标准:</strong></p>

<p>系统会用下面的代码来测试你的题解:</p>

<pre>
int[] nums = [...]; // 输入数组
int[] expectedNums = [...]; // 长度正确的期望答案

int k = removeDuplicates(nums); // 调用

assert k == expectedNums.length;
for (int i = 0; i &lt; k; i++) {
    assert nums[i] == expectedNums[i];
}</pre>

<p>如果所有断言都通过，那么您的题解将被 <strong>通过</strong>。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,1,2]
<strong>输出：</strong>2, nums = [1,2,_]
<strong>解释：</strong>函数应该返回新的长度 <strong><code>2</code></strong> ，并且原数组 <em>nums </em>的前两个元素被修改为 <strong><code>1</code></strong>, <strong><code>2 </code></strong><span><code>。</code></span>不需要考虑数组中超出新长度后面的元素。
</pre>

<p><strong class="example">示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [0,0,1,1,1,2,2,3,3,4]
<strong>输出：</strong>5, nums = [0,1,2,3,4]
<strong>解释：</strong>函数应该返回新的长度 <strong><code>5</code></strong> ， 并且原数组 <em>nums </em>的前五个元素被修改为 <strong><code>0</code></strong>, <strong><code>1</code></strong>, <strong><code>2</code></strong>, <strong><code>3</code></strong>, <strong><code>4</code></strong> 。不需要考虑数组中超出新长度后面的元素。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>nums</code> 已按 <strong>非严格递增</strong>&nbsp;排列</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 双指针</details><br>

<div>👍 3652, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/essential-technique/array-two-pointers-summary/" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

> 本文有视频版：[数组双指针技巧汇总](https://www.bilibili.com/video/BV1iG411W7Wm)

有序序列去重的通用解法就是我们前文 [双指针技巧](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/) 中的快慢指针技巧。

我们让慢指针 `slow` 走在后面，快指针 `fast` 走在前面探路，找到一个不重复的元素就告诉 `slow` 并让 `slow` 前进一步。这样当 `fast` 指针遍历完整个数组 `nums` 后，**`nums[0..slow]` 就是不重复元素**。

![](https://labuladong.online/algo/images/数组去重/1.gif)

**详细题解：[双指针技巧秒杀七道数组题目](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/)**

</div>

**标签：[数组](https://labuladong.online/algo/)，[数组双指针](https://labuladong.online/algo/)**

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
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.size()) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // 维护 nums[0..slow] 无重复
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 数组长度为索引 + 1
        return slow + 1;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        slow = 0
        fast = 0
        while fast < len(nums):
            if nums[fast] != nums[slow]:
                slow += 1
                # 维护 nums[0..slow] 无重复
                nums[slow] = nums[fast]
            fast += 1
        # 数组长度为索引 + 1
        return slow + 1
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // 维护 nums[0..slow] 无重复
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 数组长度为索引 + 1
        return slow + 1;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func removeDuplicates(nums []int) int {
    if len(nums) == 0 {
        return 0
    }
    slow, fast := 0, 0
    for fast < len(nums) {
        if nums[fast] != nums[slow] {
            slow++
            // 维护 nums[0..slow] 无重复
            nums[slow] = nums[fast]
        }
        fast++
    }
    // 数组长度为索引 + 1
    return slow + 1
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var removeDuplicates = function(nums) {
    if (nums.length === 0) {
        return 0;
    }
    let slow = 0, fast = 0;
    while (fast < nums.length) {
        if (nums[fast] !== nums[slow]) {
            slow++;
            // 维护 nums[0..slow] 无重复
            nums[slow] = nums[fast];
        }
        fast++;
    }
    // 数组长度为索引 + 1
    return slow + 1;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>👾👾 算法可视化 👾👾</strong></summary><div id="data_remove-duplicates-from-sorted-array" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_remove-duplicates-from-sorted-array"></div></div>
</details><hr /><br />

**类似题目**：
  - [167. 两数之和 II - 输入有序数组 🟠](/problems/two-sum-ii-input-array-is-sorted)
  - [27. 移除元素 🟢](/problems/remove-element)
  - [283. 移动零 🟢](/problems/move-zeroes)
  - [344. 反转字符串 🟢](/problems/reverse-string)
  - [5. 最长回文子串 🟠](/problems/longest-palindromic-substring)
  - [80. 删除有序数组中的重复项 II 🟠](/problems/remove-duplicates-from-sorted-array-ii)
  - [83. 删除排序链表中的重复元素 🟢](/problems/remove-duplicates-from-sorted-list)
  - [剑指 Offer 57. 和为s的两个数字 🟢](/problems/he-wei-sde-liang-ge-shu-zi-lcof)
  - [剑指 Offer II 006. 排序数组中两个数字之和 🟢](/problems/kLl5u1)

</div>

</details>
</div>

