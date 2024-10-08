<p>如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 <strong>回文串</strong> 。</p>

<p>字母和数字都属于字母数字字符。</p>

<p>给你一个字符串 <code>s</code>，如果它是 <strong>回文串</strong> ，返回 <code>true</code><em> </em>；否则，返回<em> </em><code>false</code><em> </em>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入:</strong> s = "A man, a plan, a canal: Panama"
<strong>输出：</strong>true
<strong>解释：</strong>"amanaplanacanalpanama" 是回文串。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "race a car"
<strong>输出：</strong>false
<strong>解释：</strong>"raceacar" 不是回文串。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = " "
<strong>输出：</strong>true
<strong>解释：</strong>在移除非字母数字字符之后，s 是一个空字符串 "" 。
由于空字符串正着反着读都一样，所以是回文串。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 2 * 10<sup>5</sup></code></li> 
 <li><code>s</code> 仅由可打印的 ASCII 字符组成</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>双指针 | 字符串</details><br>

<div>👍 766, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这道题很简单，只要先把所有字符转化成小写，并过滤掉空格和标点这类字符，然后对剩下的字符执行 [数组双指针技巧汇总](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/) 中提到的两端向中心的双指针算法即可。

</div>

**标签：回文串，[数组双指针](https://labuladong.online/algo/)**

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
    bool isPalindrome(string s) {
        // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
        string sb;
        for (int i = 0; i < s.length(); i++) {
            char c = s[i];
            if (isalnum(c)) {
                sb += tolower(c);
            }
        }

        // 然后对剩下的这些目标字符执行双指针算法，判断回文串
        s = sb;
        // 一左一右两个指针相向而行
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s[left] != s[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def isPalindrome(self, s: str) -> bool:
        # 先把所有字符转化成小写，并过滤掉空格和标点这类字符
        sb = []
        for c in s:
            if c.isalnum():
                sb.append(c.lower())
        
        # 然后对剩下的这些目标字符执行双指针算法，判断回文串
        s = ''.join(sb)
        # 一左一右两个指针相向而行
        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean isPalindrome(String s) {
        // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        // 然后对剩下的这些目标字符执行双指针算法，判断回文串
        s = sb.toString();
        // 一左一右两个指针相向而行
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func isPalindrome(s string) bool {
    // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
    var sb strings.Builder
    for i := 0; i < len(s); i++ {
        c := s[i]
        if unicode.IsLetter(rune(c)) || unicode.IsDigit(rune(c)) {
            sb.WriteByte(byte(unicode.ToLower(rune(c))))
        }
    }

    // 然后对剩下的这些目标字符执行双指针算法，判断回文串
    filtered := sb.String()
    // 一左一右两个指针相向而行
    left, right := 0, len(filtered)-1
    for left < right {
        if filtered[left] != filtered[right] {
            return false
        }
        left++
        right--
    }
    return true
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var isPalindrome = function(s) {
    // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
    let sb = [];
    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i);
        if (/[a-zA-Z0-9]/.test(c)) {
            sb.push(c.toLowerCase());
        }
    }

    // 然后对剩下的这些目标字符执行双指针算法，判断回文串
    s = sb.join('');
    // 一左一右两个指针相向而行
    let left = 0, right = s.length - 1;
    while (left < right) {
        if (s.charAt(left) !== s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_valid-palindrome" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_valid-palindrome"></div></div>
</details><hr /><br />

**类似题目**：
  - [剑指 Offer II 018. 有效的回文 🟢](/problems/XltzEq)

</div>

</details>
</div>

