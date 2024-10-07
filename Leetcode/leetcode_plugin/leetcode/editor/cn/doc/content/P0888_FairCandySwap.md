<p>爱丽丝和鲍勃拥有不同总数量的糖果。给你两个数组 <code>aliceSizes</code> 和 <code>bobSizes</code> ，<code>aliceSizes[i]</code> 是爱丽丝拥有的第 <code>i</code> 盒糖果中的糖果数量，<code>bobSizes[j]</code> 是鲍勃拥有的第 <code>j</code> 盒糖果中的糖果数量。</p>

<p>两人想要互相交换一盒糖果，这样在交换之后，他们就可以拥有相同总数量的糖果。一个人拥有的糖果总数量是他们每盒糖果数量的总和。</p>

<p>返回一个整数数组 <code>answer</code>，其中 <code>answer[0]</code> 是爱丽丝必须交换的糖果盒中的糖果的数目，<code>answer[1]</code> 是鲍勃必须交换的糖果盒中的糖果的数目。如果存在多个答案，你可以返回其中 <strong>任何一个</strong> 。题目测试用例保证存在与输入对应的答案。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>aliceSizes = [1,1], bobSizes = [2,2]
<strong>输出：</strong>[1,2]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>aliceSizes = [1,2], bobSizes = [2,3]
<strong>输出：</strong>[1,2]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>aliceSizes = [2], bobSizes = [1,3]
<strong>输出：</strong>[2,3]
</pre>

<p><strong>示例 4：</strong></p>

<pre>
<strong>输入：</strong>aliceSizes = [1,2,5], bobSizes = [2,4]
<strong>输出：</strong>[5,4]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= aliceSizes.length, bobSizes.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>1 &lt;= aliceSizes[i], bobSizes[j] &lt;= 10<sup>5</sup></code></li> 
 <li>爱丽丝和鲍勃的糖果总数量不同。</li> 
 <li>题目数据保证对于给定的输入至少存在一个有效答案。</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 二分查找 | 排序</details><br>

<div>👍 250, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>



