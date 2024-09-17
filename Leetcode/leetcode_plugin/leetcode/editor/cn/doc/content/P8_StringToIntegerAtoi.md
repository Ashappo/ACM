<p>请你来实现一个&nbsp;<code>myAtoi(string s)</code>&nbsp;函数，使其能将字符串转换成一个 32 位有符号整数。</p>

<p>函数&nbsp;<code>myAtoi(string s)</code> 的算法如下：</p>

<ol> 
 <li><strong>空格：</strong>读入字符串并丢弃无用的前导空格（<code>" "</code>）</li> 
 <li><strong>符号：</strong>检查下一个字符（假设还未到字符末尾）为&nbsp;<code>'-'</code> 还是 <code>'+'</code>。如果两者都不存在，则假定结果为正。</li> 
 <li><strong>转换：</strong>通过跳过前置零来读取该整数，直到遇到非数字字符或到达字符串的结尾。如果没有读取数字，则结果为0。</li> 
 <li><b>舍入：</b>如果整数数超过 32 位有符号整数范围 <code>[−2<sup>31</sup>,&nbsp; 2<sup>31&nbsp;</sup>− 1]</code> ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 <code>−2<sup>31</sup></code> 的整数应该被舍入为 <code>−2<sup>31</sup></code> ，大于 <code>2<sup>31&nbsp;</sup>− 1</code> 的整数应该被舍入为 <code>2<sup>31&nbsp;</sup>− 1</code> 。</li> 
</ol>

<p>返回整数作为最终结果。</p>

<p>&nbsp;</p>

<p><strong class="example">示例&nbsp;1：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">s = "42"</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">42</span></p>

<p><strong>解释：</strong>加粗的字符串为已经读入的字符，插入符号是当前读取的字符。</p>

<pre>
带下划线线的字符是所读的内容，插入符号是当前读入位置。
第 1 步："42"（当前没有读入字符，因为没有前导空格）
         ^
第 2 步："42"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
         ^
第 3 步："<u>42</u>"（读入 "42"）
           ^
</pre>


<p><strong class="example">示例&nbsp;2：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">s = " -042"</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">-42</span></p>

<p><strong>解释：</strong></p>

<pre>
第 1 步："<u><strong>   </strong></u>-042"（读入前导空格，但忽视掉）
            ^
第 2 步："   <u>-</u>042"（读入 '-' 字符，所以结果应该是负数）
             ^
第 3 步："   <u>-042</u>"（读入 "042"，在结果中忽略前导零）
               ^
</pre>


<p><strong class="example">示例&nbsp;3：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">s = "</span>1337c0d3<span class="example-io">"</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">1337</span></p>

<p><strong>解释：</strong></p>

<pre>
第 1 步："1337c0d3"（当前没有读入字符，因为没有前导空格）
         ^
第 2 步："1337c0d3"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
         ^
第 3 步："1337c0d3"（读入 "1337"；由于下一个字符不是一个数字，所以读入停止）
             ^
</pre>


<p><strong class="example">示例 4：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">s = "0-1"</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>0</span></p>

<p><strong>解释：</strong></p>

<pre>
第 1 步："0-1" (当前没有读入字符，因为没有前导空格)
         ^
第 2 步："0-1" (当前没有读入字符，因为这里不存在 '-' 或者 '+')
         ^
第 3 步："<u>0</u>-1" (读入 "0"；由于下一个字符不是一个数字，所以读入停止)
          ^
</pre>


<p><strong class="example">示例 5：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">s = "words and 987"</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">0</span></p>

<p><strong>解释：</strong></p>

<p>读取在第一个非数字字符“w”处停止。</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>0 &lt;= s.length &lt;= 200</code></li> 
 <li><code>s</code> 由英文字母（大写和小写）、数字（<code>0-9</code>）、<code>' '</code>、<code>'+'</code>、<code>'-'</code> 和 <code>'.'</code> 组成</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>字符串</details><br>

<div>👍 1854, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这道题说实话没有什么难度，无非就是处理数字、符号、空格和 int 溢出的细节问题，具体看代码吧，把每一步的注释写清楚就不容易在细节上出错了。

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
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution {
public:
    int myAtoi(string str) {
        int n = str.length();
        int i = 0;
        // 记录正负号
        int sign = 1;
        // 用 long 避免 int 溢出
        long res = 0;
        // 跳过前导空格
        while (i < n && str[i] == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }

        // 记录符号位
        if (str[i] == '-') {
            sign = -1;
            i++;
        } else if (str[i] == '+') {
            i++;
        }
        if (i == n) {
            return 0;
        }

        // 统计数字位
        while (i < n && '0' <= str[i] && str[i] <= '9') {
            res = res * 10 + str[i] - '0';
            if (res > INT_MAX) {
                break;
            }
            i++;
        }
        // 如果溢出，强转成 int 就会和真实值不同
        if ((int) res != res) {
            return sign == 1 ? INT_MAX : INT_MIN;
        }
        return (int) res * sign;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def myAtoi(self, str: str) -> int:
        n = len(str)
        i = 0
        # 记录正负号
        sign = 1
        # 用 long 避免 int 溢出
        res = 0
        # 跳过前导空格
        while i < n and str[i] == ' ':
            i += 1
        if i == n:
            return 0

        # 记录符号位
        if i < n and str[i] == '-':
            sign = -1
            i += 1
        elif i < n and str[i] == '+':
            i += 1
        if i == n:
            return 0

        # 统计数字位
        while i < n and '0' <= str[i] <= '9':
            res = res * 10 + ord(str[i]) - ord('0')
            # 溢出判断
            if sign == 1 and res > 2**31 - 1:
                return 2**31 - 1
            if sign == -1 and res > 2**31:
                return -2**31
            i += 1

        # 如果溢出，强转成 int 就会和真实值不同
        return int(res) * sign
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int myAtoi(String str) {
        int n = str.length();
        int i = 0;
        // 记录正负号
        int sign = 1;
        // 用 long 避免 int 溢出
        long res = 0;
        // 跳过前导空格
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }

        // 记录符号位
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }
        if (i == n) {
            return 0;
        }

        // 统计数字位
        while (i < n && '0' <= str.charAt(i) && str.charAt(i) <= '9') {
            res = res * 10 + str.charAt(i) - '0';
            if (res > Integer.MAX_VALUE) {
                break;
            }
            i++;
        }
        // 如果溢出，强转成 int 就会和真实值不同
        if ((int) res != res) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int) res * sign;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

func myAtoi(str string) int {
    n := len(str)
    i := 0
    // 记录正负号
    sign := 1
    // 用 int64 避免 int 溢出
    // 用 long 避免 int 溢出
    res := int64(0)
    // 跳过前导空格
    for i < n && str[i] == ' ' {
        i++
    }
    if i == n {
        return 0
    }

    // 记录符号位
    if str[i] == '-' {
        sign = -1
        i++
    } else if str[i] == '+' {
        i++
    }
    if i == n {
        return 0
    }

    // 统计数字位
    for i < n && '0' <= str[i] && str[i] <= '9' {
        res = res * 10 + int64(str[i] - '0')
        // Check for overflow after updating res
        if res > int64(math.MaxInt32) {
            // 如果溢出，强转成 int 就会和真实值不同
            if sign == 1 {
                return math.MaxInt32
            } else {
                return math.MinInt32
            }
        }
        i++
    }

    // Apply the sign to the result and cast it to int before returning
    return int(res * int64(sign))
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

var myAtoi = function(str) {
    let n = str.length;
    let i = 0;
    // 记录正负号
    let sign = 1;
    // 用 long 避免 int 溢出
    let res = 0;
    // 跳过前导空格
    while (i < n && str.charAt(i) === ' ') {
        i++;
    }
    if (i === n) {
        return 0;
    }

    // 记录符号位
    if (str.charAt(i) === '-') {
        sign = -1;
        i++;
    } else if (str.charAt(i) === '+') {
        i++;
    }
    if (i === n) {
        return 0;
    }

    // 统计数字位
    while (i < n && '0' <= str.charAt(i) && str.charAt(i) <= '9') {
        res = res * 10 + (str.charAt(i) - '0');
        if (res > 2147483647) { // Integer.MAX_VALUE
            break;
        }
        i++;
    }
    // 如果溢出，强转成 int 就会和真实值不同
    if (res > 2147483647) {
        return sign === 1 ? 2147483647 : -2147483648; // Integer.MAX_VALUE : Integer.MIN_VALUE
    }
    return res * sign;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌟🌟 算法可视化 🌟🌟</strong></summary><div id="data_string-to-integer-atoi" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_string-to-integer-atoi"></div></div>
</details><hr /><br />

**类似题目**：
  - [面试题67. 把字符串转换成整数 🟠](/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof)

</div>

</details>
</div>

