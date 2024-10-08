<p>矩形以列表 <code>[x1, y1, x2, y2]</code> 的形式表示，其中 <code>(x1, y1)</code> 为左下角的坐标，<code>(x2, y2)</code> 是右上角的坐标。矩形的上下边平行于 x 轴，左右边平行于 y 轴。</p>

<p>如果相交的面积为 <strong>正</strong> ，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。</p>

<p>给出两个矩形 <code>rec1</code> 和 <code>rec2</code> 。如果它们重叠，返回 <code>true</code>；否则，返回 <code>false</code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>rec1 = [0,0,2,2], rec2 = [1,1,3,3]
<strong>输出：</strong>true
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>rec1 = [0,0,1,1], rec2 = [1,0,2,1]
<strong>输出：</strong>false
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>rec1 = [0,0,1,1], rec2 = [2,2,3,3]
<strong>输出：</strong>false
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>rect1.length == 4</code></li> 
 <li><code>rect2.length == 4</code></li> 
 <li><code>-10<sup>9</sup> &lt;= rec1[i], rec2[i] &lt;= 10<sup>9</sup></code></li> 
 <li><code>rec1</code> 和 <code>rec2</code> 表示一个面积不为零的有效矩形</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>几何 | 数学</details><br>

<div>👍 309, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

