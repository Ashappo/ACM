<p>给你一个大小为&nbsp;<code>m&nbsp;* n</code>&nbsp;的矩阵&nbsp;<code>mat</code>，矩阵由若干军人和平民组成，分别用 1 和 0 表示。</p>

<p>请你返回矩阵中战斗力最弱的&nbsp;<code>k</code>&nbsp;行的索引，按从最弱到最强排序。</p>

<p>如果第&nbsp;<em><strong>i</strong></em>&nbsp;行的军人数量少于第&nbsp;<em><strong>j</strong></em>&nbsp;行，或者两行军人数量相同但<em><strong> i</strong></em> 小于 <em><strong>j</strong></em>，那么我们认为第<em><strong> i </strong></em>行的战斗力比第<em><strong> j </strong></em>行弱。</p>

<p>军人 <strong>总是</strong> 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
<strong>输出：</strong>[2,0,3]
<strong>解释：</strong>
每行中的军人数目：
行 0 -&gt; 2 
行 1 -&gt; 4 
行 2 -&gt; 1 
行 3 -&gt; 2 
行 4 -&gt; 5 
从最弱到最强对这些行排序后得到 [2,0,3,1,4]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>mat = 
[[1,0,0,0],
&nbsp;[1,1,1,1],
&nbsp;[1,0,0,0],
&nbsp;[1,0,0,0]], 
k = 2
<strong>输出：</strong>[0,2]
<strong>解释：</strong> 
每行中的军人数目：
行 0 -&gt; 1 
行 1 -&gt; 4 
行 2 -&gt; 1 
行 3 -&gt; 1 
从最弱到最强对这些行排序后得到 [0,2,3,1]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>m == mat.length</code></li> 
 <li><code>n == mat[i].length</code></li> 
 <li><code>2 &lt;= n, m &lt;= 100</code></li> 
 <li><code>1 &lt;= k &lt;= m</code></li> 
 <li><code>matrix[i][j]</code> 不是 0 就是 1</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 二分查找 | 矩阵 | 排序 | 堆（优先队列）</details><br>

<div>👍 237, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>





