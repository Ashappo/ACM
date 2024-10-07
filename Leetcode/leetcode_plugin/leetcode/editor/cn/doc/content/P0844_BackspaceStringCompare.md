<p>给定 <code>s</code> 和 <code>t</code> 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 <code>true</code> 。<code>#</code> 代表退格字符。</p>

<p><strong>注意：</strong>如果对空文本输入退格字符，文本继续为空。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "ab#c", t = "ad#c"
<strong>输出：</strong>true
<strong>解释：</strong>s 和 t 都会变成 "ac"。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "ab##", t = "c#d#"
<strong>输出：</strong>true
<strong>解释：</strong>s 和 t 都会变成 ""。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = "a#c", t = "b"
<strong>输出：</strong>false
<strong>解释：</strong>s 会变成 "c"，但 t 仍然是 "b"。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length, t.length &lt;= 200</code></li> 
 <li><code>s</code> 和 <code>t</code> 只含有小写字母以及字符 <code>'#'</code></li> 
</ul>

<p>&nbsp;</p>

<p><strong>进阶：</strong></p>

<ul> 
 <li>你可以用 <code>O(n)</code> 的时间复杂度和 <code>O(1)</code> 的空间复杂度解决该问题吗？</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>栈 | 双指针 | 字符串 | 模拟</details><br>

<div>👍 759, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

