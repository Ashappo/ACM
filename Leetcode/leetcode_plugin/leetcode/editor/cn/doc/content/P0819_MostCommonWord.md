<p>给你一个字符串 <code>paragraph</code> 和一个表示禁用词的字符串数组 <code>banned</code> ，返回出现频率最高的非禁用词。题目数据 <strong>保证 </strong>至少存在一个非禁用词，且答案<strong> 唯一 </strong>。</p>

<p><code>paragraph</code> 中的单词 <strong>不区分大小写</strong> ，答案应以 <strong>小写 </strong>形式返回。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<pre>
<strong>输入：</strong>paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
<strong>输出：</strong>"ball"
<strong>解释：</strong>
"hit" 出现了 3 次，但它是禁用词。
"ball" 出现了两次（没有其他单词出现这么多次），因此它是段落中出现频率最高的非禁用词。
请注意，段落中的单词不区分大小写，
标点符号会被忽略（即使它们紧挨着单词，如 "ball,"），
并且尽管 "hit" 出现的次数更多，但它不能作为答案，因为它是禁用词。
</pre>

<p><strong class="example">示例 2：</strong></p>

<pre>
<strong>输入：</strong>paragraph = "a.", banned = []
<strong>输出：</strong>"a"
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= paragraph.length &lt;= 1000</code></li> 
 <li><code>paragraph</code> 由英文字母、空格 <code>' '</code>、和以下符号组成：<code>"!?',;."</code></li> 
 <li><code>0 &lt;= banned.length &lt;= 100</code></li> 
 <li><code>1 &lt;= banned[i].length &lt;= 10</code></li> 
 <li><code>banned[i]</code> 仅由小写英文字母组成</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 字符串 | 计数</details><br>

<div>👍 245, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

