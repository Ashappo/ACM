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

<div>👍 950, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

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
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

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
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

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
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

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
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

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

<hr /><details open hint-container details><summary style="font-size: medium"><strong>🎃🎃 算法可视化 🎃🎃</strong></summary><div id="data_valid-anagram" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_valid-anagram"></div></div>
</details><hr /><br />

**类似题目**：
  - [49. 字母异位词分组 🟠](/problems/group-anagrams)

</div>

</details>
</div>

