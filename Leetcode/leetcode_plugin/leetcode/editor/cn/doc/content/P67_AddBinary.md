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

<div>👍 1230, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

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
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🥳🥳 算法可视化 🥳🥳</strong></summary><div id="data_add-binary" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_add-binary"></div></div>
</details><hr /><br />

</div>

</details>
</div>

