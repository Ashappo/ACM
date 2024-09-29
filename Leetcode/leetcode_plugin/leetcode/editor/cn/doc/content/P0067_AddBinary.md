<p>给你两个二进制字符串 <code>a</code> 和 <code>b</code> ，以二进制字符串的形式返回它们的和。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1：</strong></p>

<pre>
<strong>输入:</strong>a = "11", b = "1"
<strong>输出：</strong>"100"</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre>
<strong>输入：</strong>a = "1010", b = "1011"
<strong>输出：</strong>"10101"</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= a.length, b.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>a</code> 和 <code>b</code> 仅由字符 <code>'0'</code> 或 <code>'1'</code> 组成</li> 
 <li>字符串如果不是 <code>"0"</code> ，就不含前导零</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>位运算 | 数学 | 字符串 | 模拟</details><br>

<div>👍 1233, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这道题的关键就是让你用代码模拟加法的运算过程。**加法的模拟可以理解为是一个通用模式，需要你用一个 `carry` 变量记录并正确进位**，建议你先去做一下 [2. 两数相加](/problems/add-two-numbers) 再回来看这道题就手到擒来了。

</div>

**标签：[位运算](https://labuladong.online/algo/)，[数学](https://labuladong.online/algo/)**

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
    string addBinary(string a, string b) {
        // 先把输入的这两个二进制串反转，低位放在前面，方便处理进位
        reverse(a.begin(), a.end());
        reverse(b.begin(), b.end());
        
        // 存储结果
        string result;
        
        int m = a.size(), n = b.size();
        // carry 记录进位
        int carry = 0;
        int i = 0;
        
        // 开始类似 [2. 两数相加](#2) 的加法模拟逻辑
        // 只是这里运算的是二进制字符串
        while (i < max(m, n) || carry > 0) {
            int val = carry;
            val += i < m ? (a[i] - '0') : 0;
            val += i < n ? (b[i] - '0') : 0;
            result += (val % 2) + '0';
            carry = val / 2;
            i++;
        }
        
        // 反转结果字符串
        reverse(result.begin(), result.end());
        return result;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def addBinary(self, a: str, b: str) -> str:
        # 先把输入的这两个二进制串反转，低位放在前面，方便处理进位
        a = a[::-1]
        b = b[::-1]
        # 存储结果
        sb = []

        m, n = len(a), len(b)
        # carry 记录进位
        carry = 0
        i = 0

        # 开始类似 [2. 两数相加](#2) 的加法模拟逻辑
        # 只是这里运算的是二进制字符串
        while i < max(m, n) or carry > 0:
            val = carry
            val += i < m and a[i] == '1'
            val += i < n and b[i] == '1'
            sb.append(str(val % 2))
            carry = val // 2
            i += 1

        # 反转结果字符串并返回
        return ''.join(sb[::-1])
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public String addBinary(String a, String b) {
        // 先把输入的这两个二进制串反转，低位放在前面，方便处理进位
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        // 存储结果
        StringBuilder sb = new StringBuilder();

        int m = a.length(), n = b.length();
        // carry 记录进位
        int carry = 0;
        int i = 0;

        // 开始类似 [2. 两数相加](#2) 的加法模拟逻辑
        // 只是这里运算的是二进制字符串
        while (i < Math.max(m, n) || carry > 0) {
            int val = carry;
            val += i < m ? (a.charAt(i) - '0') : 0;
            val += i < n ? (b.charAt(i) - '0') : 0;
            sb.append(val % 2);
            carry = val / 2;
            i++;
        }

        return sb.reverse().toString();
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func addBinary(a string, b string) string {
    // 先把输入的这两个二进制串反转，低位放在前面，方便处理进位
    a = reverseString(a)
    b = reverseString(b)
    // 存储结果
    var sb strings.Builder

    m, n := len(a), len(b)
    // carry 记录进位
    carry := 0
    i := 0

    // 开始类似 [2. 两数相加](#2) 的加法模拟逻辑
    // 只是这里运算的是二进制字符串
    for i < max(m, n) || carry > 0 {
        val := carry
        if i < m {
            val += int(a[i] - '0')
        }
        if i < n {
            val += int(b[i] - '0')
        }
        sb.WriteByte(byte(val % 2 + '0'))
        carry = val / 2
        i++
    }

    return reverseString(sb.String())
}

func reverseString(s string) string {
    runes := []rune(s)
    for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
        runes[i], runes[j] = runes[j], runes[i]
    }
    return string(runes)
}

func max(a, b int) int {
    if a > b {
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

var addBinary = function(a, b) {
    // 先把输入的这两个二进制串反转，低位放在前面，方便处理进位
    a = a.split('').reverse().join('');
    b = b.split('').reverse().join('');
    // 存储结果
    let sb = [];

    let m = a.length, n = b.length;
    // carry 记录进位
    let carry = 0;
    let i = 0;

    // 开始类似 [2. 两数相加](#2) 的加法模拟逻辑
    // 只是这里运算的是二进制字符串
    while (i < Math.max(m, n) || carry > 0) {
        let val = carry;
        val += i < m ? parseInt(a[i]) : 0;
        val += i < n ? parseInt(b[i]) : 0;
        sb.push(val % 2);
        carry = Math.floor(val / 2);
        i++;
    }

    return sb.reverse().join('');
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🌈🌈 算法可视化 🌈🌈</strong></summary><div id="data_add-binary" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_add-binary"></div></div>
</details><hr /><br />

</div>

</details>
</div>

