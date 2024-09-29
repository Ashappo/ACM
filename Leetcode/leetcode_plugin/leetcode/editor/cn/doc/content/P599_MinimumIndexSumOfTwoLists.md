<p>假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。</p>

<p>你需要帮助他们用<strong>最少的索引和</strong>找出他们<strong>共同喜爱的餐厅</strong>。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
<strong>输出:</strong> ["Shogun"]
<strong>解释:</strong> 他们唯一共同喜爱的餐厅是“Shogun”。
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong>list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["KFC", "Shogun", "Burger King"]
<strong>输出:</strong> ["Shogun"]
<strong>解释:</strong> 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul> 
 <li><code>1 &lt;= list1.length, list2.length &lt;= 1000</code></li> 
 <li><code>1 &lt;= list1[i].length, list2[i].length &lt;= 30</code>&nbsp;</li> 
 <li><code>list1[i]</code> 和 <code>list2[i]</code> 由空格
  <meta charset="UTF-8" />&nbsp;<code>' '</code>&nbsp;和英文字母组成。</li> 
 <li><code>list1</code> 的所有字符串都是 <strong>唯一</strong> 的。</li> 
 <li><code>list2</code> 中的所有字符串都是 <strong>唯一</strong> 的。</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 字符串</details><br>

<div>👍 257, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

