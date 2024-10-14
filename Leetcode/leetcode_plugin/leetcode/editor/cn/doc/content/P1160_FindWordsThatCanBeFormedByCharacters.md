<p>给你一份『词汇表』（字符串数组）&nbsp;<code>words</code>&nbsp;和一张『字母表』（字符串）&nbsp;<code>chars</code>。</p>

<p>假如你可以用&nbsp;<code>chars</code>&nbsp;中的『字母』（字符）拼写出 <code>words</code>&nbsp;中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。</p>

<p>注意：每次拼写（指拼写词汇表中的一个单词）时，<code>chars</code> 中的每个字母都只能用一次。</p>

<p>返回词汇表&nbsp;<code>words</code>&nbsp;中你掌握的所有单词的 <strong>长度之和</strong>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>words = ["cat","bt","hat","tree"], chars = "atach"
<strong>输出：</strong>6
<strong>解释： </strong>
可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>words = ["hello","world","leetcode"], chars = "welldonehoneyr"
<strong>输出：</strong>10
<strong>解释：</strong>
可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= words.length &lt;= 1000</code></li> 
 <li><code>1 &lt;= words[i].length, chars.length&nbsp;&lt;= 100</code></li> 
 <li>所有字符串中都仅包含小写英文字母</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 字符串 | 计数</details><br>

<div>👍 190, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>
