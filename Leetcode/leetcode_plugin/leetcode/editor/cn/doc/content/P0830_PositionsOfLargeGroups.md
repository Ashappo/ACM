<p>在一个由小写字母构成的字符串 <code>s</code> 中，包含由一些连续的相同字符所构成的分组。</p>

<p>例如，在字符串 <code>s = "abbxxxxzyy"</code>&nbsp;中，就含有 <code>"a"</code>, <code>"bb"</code>, <code>"xxxx"</code>, <code>"z"</code> 和 <code>"yy"</code> 这样的一些分组。</p>

<p>分组可以用区间 <code>[start, end]</code> 表示，其中 <code>start</code> 和 <code>end</code> 分别表示该分组的起始和终止位置的下标。上例中的 <code>"xxxx"</code> 分组用区间表示为 <code>[3,6]</code> 。</p>

<p>我们称所有包含大于或等于三个连续字符的分组为 <strong>较大分组</strong> 。</p>

<p>找到每一个 <strong>较大分组</strong> 的区间，<strong>按起始位置下标递增顺序排序后</strong>，返回结果。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1：</strong></p>

<pre>
<strong>输入：</strong>s = "abbxxxxzzy"
<strong>输出：</strong>[[3,6]]
<strong>解释</strong><strong>：</strong><span><code>"xxxx" 是一个起始于 3 且终止于 6 的较大分组</code></span>。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "abc"
<strong>输出：</strong>[]
<strong>解释：</strong>"a","b" 和 "c" 均不是符合要求的较大分组。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = "abcdddeeeeaabbbcd"
<strong>输出：</strong>[[3,5],[6,9],[12,14]]
<strong>解释：</strong>较大分组为 "ddd", "eeee" 和 "bbb"</pre>

<p><strong>示例 4：</strong></p>

<pre>
<strong>输入：</strong>s = "aba"
<strong>输出：</strong>[]
</pre>

 

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 1000</code></li> 
 <li><code>s</code> 仅含小写英文字母</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>字符串</details><br>

<div>👍 151, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

