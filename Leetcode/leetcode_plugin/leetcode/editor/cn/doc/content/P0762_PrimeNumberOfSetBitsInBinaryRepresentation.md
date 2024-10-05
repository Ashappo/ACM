<p>给你两个整数&nbsp;<code>left</code>&nbsp;和&nbsp;<code>right</code> ，在闭区间 <code>[left, right]</code>&nbsp;范围内，统计并返回 <strong>计算置位位数为质数</strong> 的整数个数。</p>

<p><strong>计算置位位数</strong> 就是二进制表示中 <code>1</code> 的个数。</p>

<ul> 
 <li>例如， <code>21</code>&nbsp;的二进制表示&nbsp;<code>10101</code>&nbsp;有 <code>3</code> 个计算置位。</li> 
</ul>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>left = 6, right = 10
<strong>输出：</strong>4
<strong>解释：</strong>
6 -&gt; 110 (2 个计算置位，2 是质数)
7 -&gt; 111 (3 个计算置位，3 是质数)
9 -&gt; 1001 (2 个计算置位，2 是质数)
10-&gt; 1010 (2 个计算置位，2 是质数)
共计 4 个计算置位为质数的数字。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>left = 10, right = 15
<strong>输出：</strong>5
<strong>解释：</strong>
10 -&gt; 1010 (2 个计算置位, 2 是质数)
11 -&gt; 1011 (3 个计算置位, 3 是质数)
12 -&gt; 1100 (2 个计算置位, 2 是质数)
13 -&gt; 1101 (3 个计算置位, 3 是质数)
14 -&gt; 1110 (3 个计算置位, 3 是质数)
15 -&gt; 1111 (4 个计算置位, 4 不是质数)
共计 5 个计算置位为质数的数字。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= left &lt;= right &lt;= 10<sup>6</sup></code></li> 
 <li><code>0 &lt;= right - left &lt;= 10<sup>4</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>位运算 | 数学</details><br>

<div>👍 147, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

