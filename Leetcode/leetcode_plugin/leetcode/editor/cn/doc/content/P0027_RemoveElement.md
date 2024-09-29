<p>给你一个数组 <code>nums</code><em>&nbsp;</em>和一个值 <code>val</code>，你需要 <strong><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a></strong> 移除所有数值等于&nbsp;<code>val</code><em>&nbsp;</em>的元素。元素的顺序可能发生改变。然后返回&nbsp;<code>nums</code>&nbsp;中与&nbsp;<code>val</code>&nbsp;不同的元素的数量。</p>

<p>假设 <code>nums</code> 中不等于 <code>val</code> 的元素数量为 <code>k</code>，要通过此题，您需要执行以下操作：</p>

<ul> 
 <li>更改 <code>nums</code> 数组，使 <code>nums</code> 的前 <code>k</code> 个元素包含不等于 <code>val</code> 的元素。<code>nums</code> 的其余元素和 <code>nums</code> 的大小并不重要。</li> 
 <li>返回 <code>k</code>。</li> 
</ul>

<p><strong>用户评测：</strong></p>

<p>评测机将使用以下代码测试您的解决方案：</p>

<pre>
int[] nums = [...]; // 输入数组
int val = ...; // 要移除的值
int[] expectedNums = [...]; // 长度正确的预期答案。
                            // 它以不等于 val 的值排序。

int k = removeElement(nums, val); // 调用你的实现

assert k == expectedNums.length;
sort(nums, 0, k); // 排序 nums 的前 k 个元素
for (int i = 0; i &lt; actualLength; i++) {
    assert nums[i] == expectedNums[i];
}</pre>

<p>如果所有的断言都通过，你的解决方案将会 <strong>通过</strong>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,2,2,3], val = 3
<strong>输出：</strong>2, nums = [2,2,_,_]
<strong>解释：</strong>你的函数函数应该返回 k = 2, 并且 nums<em> </em>中的前两个元素均为 2。
你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [0,1,2,2,3,0,4,2], val = 2
<strong>输出：</strong>5, nums = [0,1,4,0,3,_,_,_]
<strong>解释：</strong>你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
注意这五个元素可以任意顺序返回。
你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>0 &lt;= nums.length &lt;= 100</code></li> 
 <li><code>0 &lt;= nums[i] &lt;= 50</code></li> 
 <li><code>0 &lt;= val &lt;= 100</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 双指针</details><br>

<div>👍 2316, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/essential-technique/array-two-pointers-summary/" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

> 本文有视频版：[数组双指针技巧汇总](https://www.bilibili.com/video/BV1iG411W7Wm)

类似 [26. 删除有序数组中的重复项](/problems/remove-duplicates-from-sorted-array)，需要使用 [双指针技巧](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/) 中的快慢指针：

如果 `fast` 遇到需要去除的元素，则直接跳过，否则就告诉 `slow` 指针，并让 `slow` 前进一步。

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

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.size()) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        fast, slow = 0, 0
        while fast < len(nums):
            if nums[fast] != val:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func removeElement(nums []int, val int) int {
    slow := 0
    for fast := 0; fast < len(nums); fast++ {
        if nums[fast] != val {
            nums[slow] = nums[fast]
            slow++
        }
    }
    return slow
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var removeElement = function(nums, val) {
    let fast = 0, slow = 0;
    while (fast < nums.length) {
        if (nums[fast] !== val) {
            nums[slow] = nums[fast];
            slow++;
        }
        fast++;
    }
    return slow;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>👾👾 算法可视化 👾👾</strong></summary><div id="data_remove-element" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_remove-element"></div></div>
</details><hr /><br />

**类似题目**：
  - [167. 两数之和 II - 输入有序数组 🟠](/problems/two-sum-ii-input-array-is-sorted)
  - [26. 删除有序数组中的重复项 🟢](/problems/remove-duplicates-from-sorted-array)
  - [283. 移动零 🟢](/problems/move-zeroes)
  - [344. 反转字符串 🟢](/problems/reverse-string)
  - [5. 最长回文子串 🟠](/problems/longest-palindromic-substring)
  - [75. 颜色分类 🟠](/problems/sort-colors)
  - [83. 删除排序链表中的重复元素 🟢](/problems/remove-duplicates-from-sorted-list)
  - [剑指 Offer 21. 调整数组顺序使奇数位于偶数前面 🟢](/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof)
  - [剑指 Offer 57. 和为s的两个数字 🟢](/problems/he-wei-sde-liang-ge-shu-zi-lcof)
  - [剑指 Offer II 006. 排序数组中两个数字之和 🟢](/problems/kLl5u1)

</div>

</details>
</div>

