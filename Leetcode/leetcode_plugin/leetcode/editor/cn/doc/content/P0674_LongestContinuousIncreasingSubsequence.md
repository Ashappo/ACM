<p>给定一个未经排序的整数数组，找到最长且<strong> 连续递增的子序列</strong>，并返回该序列的长度。</p>

<p><strong>连续递增的子序列</strong> 可以由两个下标 <code>l</code> 和 <code>r</code>（<code>l &lt; r</code>）确定，如果对于每个 <code>l &lt;= i &lt; r</code>，都有 <code>nums[i] &lt; nums[i + 1]</code> ，那么子序列 <code>[nums[l], nums[l + 1], ..., nums[r - 1], nums[r]]</code> 就是连续递增子序列。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,3,5,4,7]
<strong>输出：</strong>3
<strong>解释：</strong>最长连续递增序列是 [1,3,5], 长度为3。
尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。 
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,2,2,2,2]
<strong>输出：</strong>1
<strong>解释：</strong>最长连续递增序列是 [2], 长度为1。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组</details><br>

<div>👍 463, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>


