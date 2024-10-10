<p>给你一个按 <strong>非递减顺序</strong> 排序的整数数组 <code>nums</code>，返回 <strong>每个数字的平方</strong> 组成的新数组，要求也按 <strong>非递减顺序</strong> 排序。</p>

<ul> 
</ul>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [-4,-1,0,3,10]
<strong>输出：</strong>[0,1,9,16,100]
<strong>解释：</strong>平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [-7,-3,2,3,11]
<strong>输出：</strong>[4,9,9,49,121]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code><span>1 &lt;= nums.length &lt;= </span>10<sup>4</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>nums</code> 已按 <strong>非递减顺序</strong> 排序</li> 
</ul>

<p>&nbsp;</p>

<p><strong>进阶：</strong></p>

<ul> 
 <li>请你<span style="color: rgb(36, 41, 46); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">设计时间复杂度为 <code>O(n)</code> 的算法解决本问题</span></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 双指针 | 排序</details><br>

<div>👍 1043, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

平方的特点是会把负数变成正数，所以一个负数和一个正数平方后的大小要根据绝对值来比较。

可以把元素 0 作为分界线，0 左侧的负数是一个有序数组 `nums1`，0 右侧的正数是另一个有序数组 `nums2`，那么这道题就和 [88. 合并两个有序数组](/problems/merge-sorted-array) 差不多，在进一步就是前文 [链表的双指针技巧汇总](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/) 讲过的 [21. 合并两个有序链表](/problems/merge-two-sorted-lists) 的变体。

所以，我们可以去寻找正负数的分界点，然后向左右扩展，执行合并有序数组的逻辑。不过还有个更好的办法，不用找正负分界点，而是直接将双指针分别初始化在 `nums` 的开头和结尾，相当于合并两个从大到小排序的数组，和 88 题类似。有了思路，直接看代码吧。

- **详细题解**：
  - [【强化练习】数组双指针经典习题](https://labuladong.online/algo/problem-set/array-two-pointers/)

</div>

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
// 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        // 两个指针分别初始化在正负子数组绝对值最大的元素索引
        int i = 0, j = n - 1;
        // 得到的有序结果是降序的
        int p = n - 1;
        vector<int> res(n);
        // 执行双指针合并有序数组的逻辑
        while (i <= j) {
            if (abs(nums[i]) > abs(nums[j])) {
                res[p] = nums[i] * nums[i];
                i++;
            } else {
                res[p] = nums[j] * nums[j];
                j--;
            }
            p--;
        }
        return res;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        # 两个指针分别初始化在正负子数组绝对值最大的元素索引
        i, j = 0, n - 1
        # 得到的有序结果是降序的
        p = n - 1
        res = [0] * n
        # 执行双指针合并有序数组的逻辑
        while i <= j:
            if abs(nums[i]) > abs(nums[j]):
                res[p] = nums[i] ** 2
                i += 1
            else:
                res[p] = nums[j] ** 2
                j -= 1
            p -= 1
        return res
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        // 两个指针分别初始化在正负子数组绝对值最大的元素索引
        int i = 0, j = n - 1;
        // 得到的有序结果是降序的
        int p = n - 1;
        int[] res = new int[n];
        // 执行双指针合并有序数组的逻辑
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[p] = nums[i] * nums[i];
                i++;
            } else {
                res[p] = nums[j] * nums[j];
                j--;
            }
            p--;
        }
        return res;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

func sortedSquares(nums []int) []int {
    n := len(nums)
    // 两个指针分别初始化在正负子数组绝对值最大的元素索引
    i, j := 0, n-1
    // 得到的有序结果是降序的
    p := n - 1
    res := make([]int, n)
    // 执行双指针合并有序数组的逻辑
    for i <= j {
        if abs(nums[i]) > abs(nums[j]) {
            res[p] = nums[i] * nums[i]
            i++
        } else {
            res[p] = nums[j] * nums[j]
            j--
        }
        p--
    }
    return res
}

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
// 本代码的正确性已通过力扣验证，如有疑问，可以对照我的 java 代码查看。

var sortedSquares = function(nums) {
    let n = nums.length;
    // 两个指针分别初始化在正负子数组绝对值最大的元素索引
    let i = 0, j = n - 1;
    // 得到的有序结果是降序的
    let p = n - 1;
    let res = new Array(n);
    // 执行双指针合并有序数组的逻辑
    while (i <= j) {
        if (Math.abs(nums[i]) > Math.abs(nums[j])) {
            res[p] = nums[i] * nums[i];
            i++;
        } else {
            res[p] = nums[j] * nums[j];
            j--;
        }
        p--;
    }
    return res;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🎃🎃 算法可视化 🎃🎃</strong></summary><div id="data_squares-of-a-sorted-array" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_squares-of-a-sorted-array"></div></div>
</details><hr /><br />

</div>

</details>
</div>

