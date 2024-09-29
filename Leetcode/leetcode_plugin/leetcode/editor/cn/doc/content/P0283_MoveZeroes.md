<p>给定一个数组 <code>nums</code>，编写一个函数将所有 <code>0</code> 移动到数组的末尾，同时保持非零元素的相对顺序。</p>

<p><strong>请注意</strong>&nbsp;，必须在不复制数组的情况下原地对数组进行操作。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> nums = <span><code>[0,1,0,3,12]</code></span>
<strong>输出:</strong> <span><code>[1,3,12,0,0]</code></span>
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> nums = <span><code>[0]</code></span>
<strong>输出:</strong> <span><code>[0]</code></span></pre>

<p>&nbsp;</p>

<p><strong>提示</strong>:</p> 
<meta charset="UTF-8" />

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>-2<sup>31</sup>&nbsp;&lt;= nums[i] &lt;= 2<sup>31</sup>&nbsp;- 1</code></li> 
</ul>

<p>&nbsp;</p>

<p><b>进阶：</b>你能尽量减少完成的操作次数吗？</p>

<details><summary><strong>Related Topics</strong></summary>数组 | 双指针</details><br>

<div>👍 2455, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**



<p><strong><a href="https://labuladong.online/algo/essential-technique/array-two-pointers-summary/" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

> 本文有视频版：[数组双指针技巧汇总](https://www.bilibili.com/video/BV1iG411W7Wm)

可以直接复用 [27. 移除元素](/problems/remove-element) 的解法，先移除所有 0，然后把最后的元素都置为 0，就相当于移动 0 的效果。

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
    void moveZeroes(vector<int>& nums) {
        // 去除 nums 中的所有 0
        // 返回去除 0 之后的数组长度
        int p = removeElement(nums, 0);
        // 将 p 之后的所有元素赋值为 0
        for (; p < nums.size(); p++) {
            nums[p] = 0;
        }
    }

    // 双指针技巧，复用 [27. 移除元素] 的解法。
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
    def moveZeroes(self, nums):
        # 去除 nums 中的所有 0
        # 返回去除 0 之后的数组长度
        p = self.removeElement(nums, 0)
        # 将 p 之后的所有元素赋值为 0
        for i in range(p, len(nums)):
            nums[i] = 0

    # 双指针技巧，复用 [27. 移除元素] 的解法。
    def removeElement(self, nums, val):
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
    public void moveZeroes(int[] nums) {
        // 去除 nums 中的所有 0
        // 返回去除 0 之后的数组长度
        int p = removeElement(nums, 0);
        // 将 p 之后的所有元素赋值为 0
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }

    // 双指针技巧，复用 [27. 移除元素] 的解法。
    int removeElement(int[] nums, int val) {
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

func moveZeroes(nums []int) {
    // 去除 nums 中的所有 0
    // 返回去除 0 之后的数组长度
    p := removeElement(nums, 0)
    // 将 p 之后的所有元素赋值为 0
    for ; p < len(nums); p++ {
        nums[p] = 0
    }
}

// 双指针技巧，复用 [27. 移除元素] 的解法。
func removeElement(nums []int, val int) int {
    fast, slow := 0, 0
    for fast < len(nums) {
        if nums[fast] != val {
            nums[slow] = nums[fast]
            slow++
        }
        fast++
    }
    return slow
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var moveZeroes = function(nums) {
    // 去除 nums 中的所有 0
    // 返回去除 0 之后的数组长度
    var p = removeElement(nums, 0);
    // 将 p 之后的所有元素赋值为 0
    for (; p < nums.length; p++) {
        nums[p] = 0;
    }
    
    // 双指针技巧，复用 [27. 移除元素] 的解法。
    function removeElement(nums, val) {
        let fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] !== val) {
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
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_move-zeroes" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_move-zeroes"></div></div>
</details><hr /><br />

**类似题目**：
  - [167. 两数之和 II - 输入有序数组 🟠](/problems/two-sum-ii-input-array-is-sorted)
  - [26. 删除有序数组中的重复项 🟢](/problems/remove-duplicates-from-sorted-array)
  - [27. 移除元素 🟢](/problems/remove-element)
  - [344. 反转字符串 🟢](/problems/reverse-string)
  - [5. 最长回文子串 🟠](/problems/longest-palindromic-substring)
  - [75. 颜色分类 🟠](/problems/sort-colors)
  - [83. 删除排序链表中的重复元素 🟢](/problems/remove-duplicates-from-sorted-list)
  - [剑指 Offer 57. 和为s的两个数字 🟢](/problems/he-wei-sde-liang-ge-shu-zi-lcof)
  - [剑指 Offer II 006. 排序数组中两个数字之和 🟢](/problems/kLl5u1)

</div>

</details>
</div>

