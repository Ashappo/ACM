<p>我们正在玩猜数字游戏。猜数字游戏的规则如下：</p>

<p>我会从&nbsp;<code>1</code>&nbsp;到&nbsp;<code>n</code> 随机选择一个数字。 请你猜选出的是哪个数字。</p>

<p>如果你猜错了，我会告诉你，我选出的数字比你猜测的数字大了还是小了。</p>

<p>你可以通过调用一个预先定义好的接口 <code>int guess(int num)</code> 来获取猜测结果，返回值一共有三种可能的情况：</p>

<ul> 
 <li><code>-1</code>：你猜的数字比我选出的数字大 （即&nbsp;<code>num &gt; pick</code>）。</li> 
 <li><code>1</code>：你猜的数字比我选出的数字小&nbsp;（即&nbsp;<code>num &lt;&nbsp;pick</code>）。</li> 
 <li><code>0</code>：你猜的数字与我选出的数字相等。（即&nbsp;<code>num&nbsp;== pick</code>）。</li> 
</ul>

<p>返回我选出的数字。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>n = 10, pick = 6
<strong>输出：</strong>6
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>n = 1, pick = 1
<strong>输出：</strong>1
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>n = 2, pick = 1
<strong>输出：</strong>1
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li> 
 <li><code>1 &lt;= pick &lt;= n</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>二分查找 | 交互</details><br>

<div>👍 349, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>





