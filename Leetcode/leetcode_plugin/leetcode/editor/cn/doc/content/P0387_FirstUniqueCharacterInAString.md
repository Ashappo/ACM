<p>给定一个字符串&nbsp;<code>s</code>&nbsp;，找到 <em>它的第一个不重复的字符，并返回它的索引</em> 。如果不存在，则返回 <code>-1</code>&nbsp;。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入:</strong> s = "leetcode"
<strong>输出:</strong> 0
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> s = "loveleetcode"
<strong>输出:</strong> 2
</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入:</strong> s = "aabb"
<strong>输出:</strong> -1
</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>s</code>&nbsp;只包含小写字母</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>队列 | 哈希表 | 字符串 | 计数</details><br>

<div>👍 756, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题很简单，就是考察哈希映射的使用，你可以用一个 `HashMap` 记录每个字符出现的频率。

不过考虑到题目输入只有小写字母，所以可以用一个数组充当哈希映射的作用，其中索引代表字符的 ASCII 码，对应的值代表出现的频率。

</div>

**标签：哈希表，[数据结构](https://labuladong.online/algo/)**

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
    int firstUniqChar(string s) {
        int count[26] = {0};
        for (char c : s) {
            // 将字符转化成数字
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s[i];
            if (count[c - 'a'] == 1) {
                // 第一个出现一次的字符
                return i;
            }
        }
        return -1;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class Solution:
    def firstUniqChar(self, s: str) -> int:
        count = [0] * 26
        for c in s:
            # 将字符转化成数字
            count[ord(c) - ord('a')] += 1
        for i in range(len(s)):
            c = s[i]
            if count[ord(c) - ord('a')] == 1:
                # 第一个出现一次的字符
                return i
        return -1
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            // 将字符转化成数字
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] == 1) {
                // 第一个出现一次的字符
                return i;
            }
        }
        return -1;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

func firstUniqChar(s string) int {
    count := make([]int, 26)
    for _, c := range s {
        // 将字符转化成数字
        count[c-'a']++
    }
    for i, c := range s {
        if count[c-'a'] == 1 {
            // 第一个出现一次的字符
            return i
        }
    }
    return -1
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var firstUniqChar = function(s) {
    let count = new Array(26).fill(0);
    for (let c of s) {
        // 将字符转化成数字
        count[c.charCodeAt(0) - 'a'.charCodeAt(0)]++;
    }
    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i);
        if (count[c.charCodeAt(0) - 'a'.charCodeAt(0)] == 1) {
            // 第一个出现一次的字符
            return i;
        }
    }
    return -1;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🥳🥳 算法可视化 🥳🥳</strong></summary><div id="data_first-unique-character-in-a-string" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_first-unique-character-in-a-string"></div></div>
</details><hr /><br />

**类似题目**：
  - [1429. 第一个唯一数字 🟠](/problems/first-unique-number)
  - [剑指 Offer 50. 第一个只出现一次的字符 🟢](/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof)

</div>

</details>
</div>







