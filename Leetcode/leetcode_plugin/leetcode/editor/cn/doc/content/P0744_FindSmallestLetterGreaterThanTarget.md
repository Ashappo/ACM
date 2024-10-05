<p>给你一个字符数组 <code>letters</code>，该数组按<strong>非递减顺序</strong>排序，以及一个字符 <code>target</code>。<code>letters</code>&nbsp;里<strong>至少有两个不同</strong>的字符。</p>

<p>返回&nbsp;<code>letters</code>&nbsp;中大于 <code>target</code> 的最小的字符。如果不存在这样的字符，则返回&nbsp;<code>letters</code> 的第一个字符。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入: </strong>letters = ["c", "f", "j"]，target = "a"
<strong>输出:</strong> "c"
<strong>解释：</strong>letters 中字典上比 'a' 大的最小字符是 'c'。</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> letters = ["c","f","j"], target = "c"
<strong>输出:</strong> "f"
<strong>解释：</strong>letters 中字典顺序上大于 'c' 的最小字符是 'f'。</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入:</strong> letters = ["x","x","y","y"], target = "z"
<strong>输出:</strong> "x"
<strong>解释：</strong>letters 中没有一个字符在字典上大于 'z'，所以我们返回 letters[0]。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>2 &lt;= letters.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>letters[i]</code>&nbsp;是一个小写字母</li> 
 <li><code>letters</code> 按<strong>非递减顺序</strong>排序</li> 
 <li><code>letters</code> 最少包含两个不同的字母</li> 
 <li><code>target</code> 是一个小写字母</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 二分查找</details><br>

<div>👍 302, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

