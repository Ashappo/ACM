<p>给你一个字符串&nbsp;<code>s</code>，它仅由字母&nbsp;<code>'a'</code> 和 <code>'b'</code>&nbsp;组成。每一次删除操作都可以从 <code>s</code> 中删除一个回文 <strong>子序列</strong>。</p>

<p>返回删除给定字符串中所有字符（字符串为空）的最小删除次数。</p>

<p>「子序列」定义：如果一个字符串可以通过删除原字符串某些字符而不改变原字符顺序得到，那么这个字符串就是原字符串的一个子序列。</p>

<p>「回文」定义：如果一个字符串向后和向前读是一致的，那么这个字符串就是一个回文。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "ababa"
<strong>输出：</strong>1
<strong>解释：</strong>字符串本身就是回文序列，只需要删除一次。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "abb"
<strong>输出：</strong>2
<strong>解释：</strong>"<strong>a</strong>bb" -&gt; "<strong>bb</strong>" -&gt; "". 
先删除回文子序列 "a"，然后再删除 "bb"。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = "baabb"
<strong>输出：</strong>2
<strong>解释：</strong>"<strong>baa</strong>b<strong>b</strong>" -&gt; "b" -&gt; "". 
先删除回文子序列 "baab"，然后再删除 "b"。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 1000</code></li> 
 <li><code>s</code> 仅包含字母&nbsp;<code>'a'</code>&nbsp; 和 <code>'b'</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>双指针 | 字符串</details><br>

<div>👍 203, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>

