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

<div>👍 754, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

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
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

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

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_first-unique-character-in-a-string" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_first-unique-character-in-a-string"></div></div>
</details><hr /><br />

**类似题目**：
  - [1429. 第一个唯一数字 🟠](/problems/first-unique-number)
  - [剑指 Offer 50. 第一个只出现一次的字符 🟢](/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof)

</div>

</details>
</div>

