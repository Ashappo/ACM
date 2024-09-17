<p>给定两个字符串 <code>s</code> 和 <code>t</code> ，编写一个函数来判断 <code>t</code> 是否是 <code>s</code> 的 <span data-keyword="anagram">字母异位词</span>。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre>
<strong>输入:</strong> s = "anagram", t = "nagaram"
<strong>输出:</strong> true
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> s = "rat", t = "car"
<strong>输出: </strong>false</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length, t.length &lt;= 5 * 10<sup>4</sup></code></li> 
 <li><code>s</code> 和 <code>t</code>&nbsp;仅包含小写字母</li> 
</ul>

<p>&nbsp;</p>

<p><strong>进阶:&nbsp;</strong>如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？</p>

<details><summary><strong>Related Topics</strong></summary>哈希表 | 字符串 | 排序</details><br>

<div>👍 949, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题考察字符串的编码，如何找到一种编码方法，使得字母异位词的编码都相同？

一种直接的编码方式就是排序，异位词中字符排序后就会变成相同的字符串，不过排序的复杂度略高。

异位词中字符出现的次数肯定都是一样的，所以可以把 `s, t` 中的字符计数器作为编码，比较每个字符的出现次数即可判断 `s` 和 `t` 是否是异位词。

</div>

**标签：哈希表，字符串**

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
    bool isAnagram(string s, string t) {
        vector<int> count1 = encode(s);
        vector<int> count2 = encode(t);
        // 确保两个字符串中所有字符出现的数量相同
        for (int i = 0; i < count1.size(); i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    // 计算字符的出现次数
    vector<int> encode(string s) {
        vector<int> count(26, 0);
        for (char c : s) {
            int delta = c - 'a';
            count[delta]++;
        }
        return count;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count1 = self.encode(s)
        count2 = self.encode(t)
        # 确保两个字符串中所有字符出现的数量相同
        for i in range(len(count1)):
            if count1[i] != count2[i]:
                return False

        return True

    # 计算字符的出现次数
    def encode(self, s: str) -> list:
        count = [0] * 26
        for c in s:
            delta = ord(c) - ord('a')
            count[delta] += 1
        return count
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count1 = encode(s);
        int[] count2 = encode(t);
        // 确保两个字符串中所有字符出现的数量相同
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    // 计算字符的出现次数
    int[] encode(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            int delta = c - 'a';
            count[delta]++;
        }
        return count;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

func isAnagram(s string, t string) bool {
    count1 := encode(s)
    count2 := encode(t)
    // 确保两个字符串中所有字符出现的数量相同
    for i := 0; i < len(count1); i++ {
        if count1[i] != count2[i] {
            return false
        }
    }
    return true
}

// 计算字符的出现次数
func encode(s string) []int {
    count := make([]int, 26)
    for _, c := range s {
        delta := c - 'a'
        count[delta]++
    }
    return count
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

var isAnagram = function(s, t) {
    let count1 = encode(s);
    let count2 = encode(t);
    // 确保两个字符串中所有字符出现的数量相同
    for (let i = 0; i < count1.length; i++) {
        if (count1[i] !== count2[i]) {
            return false;
        }
    }
    return true;
};

// 计算字符的出现次数
var encode = function(s) {
    let count = new Array(26).fill(0);
    for (let c of s) {
        let delta = c.charCodeAt(0) - 'a'.charCodeAt(0);
        count[delta]++;
    }
    return count;
};
```

</div></div>
</div></div>

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_valid-anagram" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_valid-anagram"></div></div>
</details><hr /><br />

**类似题目**：
  - [49. 字母异位词分组 🟠](/problems/group-anagrams)

</div>

</details>
</div>

