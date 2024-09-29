<p>给你一个整数 <code>x</code> ，如果 <code>x</code> 是一个回文整数，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>

<p><span data-keyword="palindrome-integer">回文数</span>是指正序（从左向右）和倒序（从右向左）读都是一样的整数。</p>

<ul> 
 <li>例如，<code>121</code> 是回文，而 <code>123</code> 不是。</li> 
</ul>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>x = 121
<strong>输出：</strong>true
</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre>
<strong>输入：</strong>x = -121
<strong>输出：</strong>false
<strong>解释：</strong>从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>x = 10
<strong>输出：</strong>false
<strong>解释：</strong>从右向左读, 为 01 。因此它不是一个回文数。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>-2<sup>31</sup>&nbsp;&lt;= x &lt;= 2<sup>31</sup>&nbsp;- 1</code></li> 
</ul>

<p>&nbsp;</p>

<p><strong>进阶：</strong>你能不将整数转为字符串来解决这个问题吗？</p>

<details><summary><strong>Related Topics</strong></summary>数学</details><br>

<div>👍 2906, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

如果让你判断回文串应该很简单，我在 [数组双指针技巧汇总](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/) 中讲过。

操作数字没办法像操作字符串那么简单粗暴，但只要你要知道我在 [Rabin Karp 算法详解](https://labuladong.online/algo/practice-in-action/rabinkarp/) 中讲到的从最高位开始生成数字的技巧，就能轻松解决这个问题：

```java
String s = "8264";
int number = 0;
for (int i = 0; i < s.size(); i++) {
    // 将字符转化成数字
    number = 10 * number + (s[i] - '0');
    print(number);
}
// 打印输出：
// 8
// 82
// 826
// 8264
```

你**从后往前**把 `x` 的每一位拿出来，用这个技巧生成一个数字 `y`，如果 `y` 和 `x` 相等，则说明 `x` 是回文数字。

如何**从后往前**拿出一个数字的每一位？和 10 求余数就行了呗。看代码吧。

</div>

**标签：[数学](https://labuladong.online/algo/)**

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
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        // y 是 x 翻转后的数字
        long y = 0; // Use long to prevent overflow
        while (temp > 0) {
            int last_num = temp % 10;
            temp = temp / 10;
            // 从最高位生成数字的技巧
            // Check for overflow before multiplying by 10
            if (y > INT_MAX / 10 || (y == INT_MAX / 10 && last_num > INT_MAX % 10)) {
                return false; // Overflow will occur
            }
            y = y * 10 + last_num;
        }
        return y == x;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        temp = x
        # y 是 x 翻转后的数字
        y = 0
        while temp > 0:
            last_num = temp % 10
            temp = temp // 10
            # 从最高位生成数字的技巧
            y = y * 10 + last_num
        return y == x
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        // y 是 x 翻转后的数字
        int y = 0;
        while (temp > 0) {
            int last_num = temp % 10;
            temp = temp / 10;
            // 从最高位生成数字的技巧
            y = y * 10 + last_num;
        }
        return y == x;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    temp := x
    // y 是 x 翻转后的数字
    y := 0
    for temp > 0 {
        lastNum := temp % 10
        temp = temp / 10
        // 从最高位生成数字的技巧
        y = y * 10 + lastNum
    }
    return y == x
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }
    let temp = x;
    // y 是 x 翻转后的数字
    let y = 0;
    while (temp > 0) {
        let last_num = temp % 10;
        temp = Math.floor(temp / 10);
        // 从最高位生成数字的技巧
        y = y * 10 + last_num;
    }
    return y === x;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>👾👾 算法可视化 👾👾</strong></summary><div id="data_palindrome-number" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_palindrome-number"></div></div>
</details><hr /><br />

</div>

</details>
</div>

