<p>给你一个字符串&nbsp;<code>s</code>&nbsp;。</p>

<p>你的任务是重复以下操作删除 <strong>所有</strong>&nbsp;数字字符：</p>

<ul> 
 <li>删除 <strong>第一个数字字符</strong>&nbsp;以及它左边 <strong>最近</strong>&nbsp;的 <strong>非数字</strong>&nbsp;字符。</li> 
</ul>

<p>请你返回删除所有数字字符以后剩下的字符串。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<div class="example-block"> 
 <p><span class="example-io"><b>输入：</b>s = "abc"</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>"abc"</span></p>

<p><strong>解释：</strong></p>

<p>字符串中没有数字。
 <!-- notionvc: ff07e34f-b1d6-41fb-9f83-5d0ba3c1ecde --></p>

<p><strong class="example">示例 2：</strong></p>

<div class="example-block"> 
 <p><span class="example-io"><b>输入：</b>s = "cb34"</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>""</span></p>

<p><b>解释：</b></p>

<p>一开始，我们对&nbsp;<code>s[2]</code>&nbsp;执行操作，<code>s</code>&nbsp;变为&nbsp;<code>"c4"</code>&nbsp;。</p>

<p>然后对&nbsp;<code>s[1]</code>&nbsp;执行操作，<code>s</code>&nbsp;变为&nbsp;<code>""</code>&nbsp;。</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 100</code></li> 
 <li><code>s</code>&nbsp;只包含小写英文字母和数字字符。</li> 
 <li>输入保证所有数字都可以按以上操作被删除。</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>栈 | 字符串 | 模拟</details><br>

<div>👍 31, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>



