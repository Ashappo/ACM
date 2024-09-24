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

<div>👍 3644, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/slug.html?slug=remove-duplicates-from-sorted-array" target="_blank">⭐️labuladong 题解</a></strong></p>
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
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🥳🥳 算法可视化 🥳🥳</strong></summary><div id="data_remove-duplicates-from-sorted-array" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
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
