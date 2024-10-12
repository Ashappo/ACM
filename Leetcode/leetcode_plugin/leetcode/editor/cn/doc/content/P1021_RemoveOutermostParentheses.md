<p>有效括号字符串为空 <code>""</code>、<code>"(" + A + ")"</code>&nbsp;或&nbsp;<code>A + B</code> ，其中&nbsp;<code>A</code> 和&nbsp;<code>B</code>&nbsp;都是有效的括号字符串，<code>+</code>&nbsp;代表字符串的连接。</p>

<ul> 
 <li>例如，<code>""</code>，<code>"()"</code>，<code>"(())()"</code>&nbsp;和&nbsp;<code>"(()(()))"</code>&nbsp;都是有效的括号字符串。</li> 
</ul>

<p>如果有效字符串 <code>s</code> 非空，且不存在将其拆分为 <code>s = A + B</code>&nbsp;的方法，我们称其为<strong>原语（primitive）</strong>，其中&nbsp;<code>A</code> 和&nbsp;<code>B</code>&nbsp;都是非空有效括号字符串。</p>

<p>给出一个非空有效字符串 <code>s</code>，考虑将其进行原语化分解，使得：<code>s = P_1 + P_2 + ... + P_k</code>，其中&nbsp;<code>P_i</code>&nbsp;是有效括号字符串原语。</p>

<p>对 <code>s</code> 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 <code>s</code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "(()())(())"
<strong>输出：</strong>"()()()"
<strong>解释：
</strong>输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "(()())(())(()(()))"
<strong>输出：</strong>"()()()()(())"
<strong>解释：</strong>
输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = "()()"
<strong>输出：</strong>""
<strong>解释：</strong>
输入字符串为 "()()"，原语化分解得到 "()" + "()"，
删除每个部分中的最外层括号后得到 "" + "" = ""。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>s[i]</code> 为 <code>'('</code> 或 <code>')'</code></li> 
 <li><code>s</code> 是一个有效括号字符串</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>栈 | 字符串</details><br>

<div>👍 309, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>

