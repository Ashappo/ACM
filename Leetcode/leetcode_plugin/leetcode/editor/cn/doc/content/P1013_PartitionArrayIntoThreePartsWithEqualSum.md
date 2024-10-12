<p>给你一个整数数组 <code>arr</code>，只有可以将其划分为三个和相等的 <strong>非空</strong> 部分时才返回&nbsp;<code>true</code>，否则返回 <code>false</code>。</p>

<p>形式上，如果可以找出索引&nbsp;<code>i + 1 &lt; j</code>&nbsp;且满足&nbsp;<code>(arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])</code>&nbsp;就可以将数组三等分。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>arr = [0,2,1,-6,6,-7,9,1,2,0,1]
<strong>输出：</strong>true
<strong>解释：</strong>0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>arr = [0,2,1,-6,6,7,9,-1,2,0,1]
<strong>输出：</strong>false
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>arr = [3,3,6,5,-2,2,5,1,-9,4]
<strong>输出：</strong>true
<strong>解释：</strong>3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>3 &lt;= arr.length &lt;= 5 * 10<sup>4</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= arr[i] &lt;= 10<sup>4</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>贪心 | 数组</details><br>

<div>👍 211, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>

