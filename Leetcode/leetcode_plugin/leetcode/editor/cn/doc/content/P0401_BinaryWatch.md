<p>二进制手表顶部有 4 个 LED 代表<strong> 小时（0-11）</strong>，底部的 6 个 LED 代表<strong> 分钟（0-59）</strong>。每个 LED 代表一个 0 或 1，最低位在右侧。</p>

<ul> 
 <li>例如，下面的二进制手表读取 <code>"4:51"</code> 。</li> 
</ul>

<p><img src="https://assets.leetcode.com/uploads/2021/04/08/binarywatch.jpg" style="height: 300px; width" /></p>

<p>给你一个整数 <code>turnedOn</code> ，表示当前亮着的 LED 的数量，返回二进制手表可以表示的所有可能时间。你可以 <strong>按任意顺序</strong> 返回答案。</p>

<p>小时不会以零开头：</p>

<ul> 
 <li>例如，<code>"01:00"</code> 是无效的时间，正确的写法应该是 <code>"1:00"</code> 。</li> 
</ul>

<p>分钟必须由两位数组成，可能会以零开头：</p>

<ul> 
 <li>例如，<code>"10:2"</code> 是无效的时间，正确的写法应该是 <code>"10:02"</code> 。</li> 
</ul>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>turnedOn = 1
<strong>输出：</strong>["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>turnedOn = 9
<strong>输出：</strong>[]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>0 &lt;= turnedOn &lt;= 10</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>位运算 | 回溯</details><br>

<div>👍 436, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

