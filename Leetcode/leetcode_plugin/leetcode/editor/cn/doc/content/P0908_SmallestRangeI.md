<p>给你一个整数数组 <code>nums</code>，和一个整数 <code>k</code> 。</p>

<p>在一个操作中，您可以选择 <code>0 &lt;= i &lt; nums.length</code> 的任何索引 <code>i</code> 。将 <code>nums[i]</code> 改为 <code>nums[i] + x</code> ，其中 <code>x</code> 是一个范围为 <code>[-k, k]</code> 的任意整数。对于每个索引 <code>i</code> ，最多 <strong>只能 </strong>应用 <strong>一次</strong> 此操作。</p>

<p><code>nums</code>&nbsp;的&nbsp;<strong>分数&nbsp;</strong>是&nbsp;<code>nums</code>&nbsp;中最大和最小元素的差值。&nbsp;</p>

<p><em>在对&nbsp; <code>nums</code> 中的每个索引最多应用一次上述操作后，返回&nbsp;<code>nums</code> 的最低 <strong>分数</strong></em> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1], k = 0
<strong>输出：</strong>0
<strong>解释：</strong>分数是 max(nums) - min(nums) = 1 - 1 = 0。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [0,10], k = 2
<strong>输出：</strong>6
<strong>解释：</strong>将 nums 改为 [2,8]。分数是 max(nums) - min(nums) = 8 - 2 = 6。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,3,6], k = 3
<strong>输出：</strong>0
<strong>解释：</strong>将 nums 改为 [4,4,4]。分数是 max(nums) - min(nums) = 4 - 4 = 0。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>0 &lt;= k &lt;= 10<sup>4</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 数学</details><br>

<div>👍 194, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>



