<p>给你一组多米诺骨牌 <code>dominoes</code> 。</p>

<p>形式上，<code>dominoes[i] = [a, b]</code> 与 <code>dominoes[j] = [c, d]</code> <strong>等价</strong> 当且仅当 (<code>a == c</code> 且 <code>b == d</code>) 或者 (<code>a == d</code> 且 <code>b == c</code>) 。即一张骨牌可以通过旋转 <code>0</code>&nbsp;度或 <code>180</code> 度得到另一张多米诺骨牌。</p>

<p>在&nbsp;<code>0 &lt;= i &lt; j &lt; dominoes.length</code>&nbsp;的前提下，找出满足&nbsp;<code>dominoes[i]</code> 和&nbsp;<code>dominoes[j]</code>&nbsp;等价的骨牌对 <code>(i, j)</code> 的数量。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>dominoes = [[1,2],[2,1],[3,4],[5,6]]
<strong>输出：</strong>1
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
<strong>输出：</strong>3
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= dominoes.length &lt;= 4 * 10<sup>4</sup></code></li> 
 <li><code>dominoes[i].length == 2</code></li> 
 <li><code>1 &lt;= dominoes[i][j] &lt;= 9</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 计数</details><br>

<div>👍 163, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>

