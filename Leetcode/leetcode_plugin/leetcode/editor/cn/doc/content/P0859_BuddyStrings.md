<p>给你两个字符串 <code>s</code> 和 <code>goal</code> ，只要我们可以通过交换 <code>s</code> 中的两个字母得到与 <code>goal</code> 相等的结果，就返回&nbsp;<code>true</code>&nbsp;；否则返回 <code>false</code> 。</p>

<p>交换字母的定义是：取两个下标 <code>i</code> 和 <code>j</code> （下标从 <code>0</code> 开始）且满足 <code>i != j</code> ，接着交换 <code>s[i]</code> 和 <code>s[j]</code> 处的字符。</p>

<ul> 
 <li>例如，在 <code>"abcd"</code> 中交换下标 <code>0</code> 和下标 <code>2</code> 的元素可以生成 <code>"cbad"</code> 。</li> 
</ul>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "ab", goal = "ba"
<strong>输出：</strong>true
<strong>解释：</strong>你可以交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 相等。</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "ab", goal = "ab"
<strong>输出：</strong>false
<strong>解释：</strong>你只能交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 不相等。</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = "aa", goal = "aa"
<strong>输出：</strong>true
<strong>解释：</strong>你可以交换 s[0] = 'a' 和 s[1] = 'a' 生成 "aa"，此时 s 和 goal 相等。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length, goal.length &lt;= 2 * 10<sup>4</sup></code></li> 
 <li><code>s</code> 和 <code>goal</code> 由小写英文字母组成</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>哈希表 | 字符串</details><br>

<div>👍 314, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

