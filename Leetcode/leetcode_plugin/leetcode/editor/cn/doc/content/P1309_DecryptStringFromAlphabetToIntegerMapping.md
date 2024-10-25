<p>给你一个字符串&nbsp;<code>s</code>，它由数字（<code>'0'</code> - <code>'9'</code>）和&nbsp;<code>'#'</code>&nbsp;组成。我们希望按下述规则将&nbsp;<code>s</code>&nbsp;映射为一些小写英文字符：</p>

<ul> 
 <li>字符（<code>'a'</code> - <code>'i'</code>）分别用（<code>'1'</code> -&nbsp;<code>'9'</code>）表示。</li> 
 <li>字符（<code>'j'</code> - <code>'z'</code>）分别用（<code>'10#'</code>&nbsp;-&nbsp;<code>'26#'</code>）表示。&nbsp;</li> 
</ul>

<p>返回映射之后形成的新字符串。</p>

<p>题目数据保证映射始终唯一。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "10#11#12"
<strong>输出：</strong>"jkab"
<strong>解释：</strong>"j" -&gt; "10#" , "k" -&gt; "11#" , "a" -&gt; "1" , "b" -&gt; "2".
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "1326#"
<strong>输出：</strong>"acz"
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 1000</code></li> 
 <li><code>s[i]</code> 只包含数字（<code>'0'</code>-<code>'9'</code>）和&nbsp;<code>'#'</code>&nbsp;字符。</li> 
 <li><code>s</code>&nbsp;是映射始终存在的有效字符串。</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>字符串</details><br>

<div>👍 89, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>







