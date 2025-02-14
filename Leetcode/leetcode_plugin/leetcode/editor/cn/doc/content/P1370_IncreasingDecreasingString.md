<p>给你一个字符串&nbsp;<code>s</code>&nbsp;，请你根据下面的算法重新构造字符串：</p>

<ol> 
 <li>从 <code>s</code>&nbsp;中选出 <strong>最小</strong>&nbsp;的字符，将它 <strong>接在</strong>&nbsp;结果字符串的后面。</li> 
 <li>从 <code>s</code> 剩余字符中选出比上一个添加字符更大的 <strong>最小</strong> 字符，将它 <strong>接在</strong>&nbsp;结果字符串后面。</li> 
 <li>重复步骤 2 ，直到你没法从 <code>s</code>&nbsp;中选择字符。</li> 
 <li>从 <code>s</code>&nbsp;中选出 <strong>最大</strong>&nbsp;的字符，将它 <strong>接在</strong>&nbsp;结果字符串的后面。</li> 
 <li>从 <code>s</code> 剩余字符中选出比上一个添加字符更小的 <strong>最大</strong>&nbsp;字符，将它 <strong>接在</strong>&nbsp;结果字符串后面。</li> 
 <li>重复步骤 5&nbsp;，直到你没法从 <code>s</code>&nbsp;中选择字符。</li> 
 <li>重复步骤 1 到 6 ，直到 <code>s</code>&nbsp;中所有字符都已经被选过。</li> 
</ol>

<p>在任何一步中，如果最小或者最大字符不止一个&nbsp;，你可以选择其中任意一个，并将其添加到结果字符串。</p>

<p>请你返回将&nbsp;<code>s</code>&nbsp;中字符重新排序后的 <strong>结果字符串</strong> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "aaaabbbbcccc"
<strong>输出：</strong>"abccbaabccba"
<strong>解释：</strong>第一轮的步骤 1，2，3 后，结果字符串为 result = "abc"
第一轮的步骤 4，5，6 后，结果字符串为 result = "abccba"
第一轮结束，现在 s = "aabbcc" ，我们再次回到步骤 1
第二轮的步骤 1，2，3 后，结果字符串为 result = "abccbaabc"
第二轮的步骤 4，5，6 后，结果字符串为 result = "abccbaabccba"
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "rat"
<strong>输出：</strong>"art"
<strong>解释：</strong>单词 "rat" 在上述算法重排序以后变成 "art"
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 500</code></li> 
 <li><code>s</code>&nbsp;只包含小写英文字母。</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>哈希表 | 字符串 | 计数</details><br>

<div>👍 119, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：为满足广大读者的需求，网站上架 [速成目录](https://labuladong.online/algo/intro/quick-learning-plan/)，如有需要可以看下，谢谢大家的支持~**

</div>

