<p>给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为&nbsp;<code>2</code>&nbsp;或&nbsp;<code>0</code>。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。</p>

<p>更正式地说，即&nbsp;<code>root.val = min(root.left.val, root.right.val)</code> 总成立。</p>

<p>给出这样的一个二叉树，你需要输出所有节点中的&nbsp;<strong>第二小的值 </strong>。</p>

<p>如果第二小的值不存在的话，输出 -1 <strong>。</strong></p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/15/smbt1.jpg" style="height: 210px; width: 300px;" /> 
<pre>
<strong>输入：</strong>root = [2,2,5,null,null,5,7]
<strong>输出：</strong>5
<strong>解释：</strong>最小的值是 2 ，第二小的值是 5 。
</pre>

<p><strong>示例 2：</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/15/smbt2.jpg" style="height: 113px; width: 200px;" /> 
<pre>
<strong>输入：</strong>root = [2,2,2]
<strong>输出：</strong>-1
<strong>解释：</strong>最小的值是 2, 但是不存在第二小的值。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li>树中节点数目在范围 <code>[1, 25]</code> 内</li> 
 <li><code>1 &lt;= Node.val &lt;= 2<sup>31</sup> - 1</code></li> 
 <li>对于树中每个节点 <code>root.val == min(root.left.val, root.right.val)</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>树 | 深度优先搜索 | 二叉树</details><br>

<div>👍 310, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<!-- vip -->
<!-- i_63956417e4b02685a425cc0d -->

本题思路为 labuladong 网站会员专属，请 [点击这里](https://labuladong.online/algo/intro/site-vip/) 购买会员并「查看各个插件的解锁方法」。

若之前已经购买会员并成功解锁，现在却突然出现这个问题，是因为加入了新的题解数据。请尝试重新 [手动刷新插件数据](https://labuladong.online/algo/intro/site-vip/) 并刷新页面。

若依然无法解决问题，可以在 [会员购买页](https://labuladong.online/algo/intro/site-vip/) 文末加我微信直接反馈，如是 bug 我会立即修复。</details>
</div>

