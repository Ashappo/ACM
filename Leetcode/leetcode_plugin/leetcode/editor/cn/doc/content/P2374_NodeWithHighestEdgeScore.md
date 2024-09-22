<p>给你一个有向图，图中有 <code>n</code> 个节点，节点编号从 <code>0</code> 到 <code>n - 1</code> ，其中每个节点都 <strong>恰有一条</strong> 出边。</p>

<p>图由一个下标从 <strong>0</strong> 开始、长度为 <code>n</code> 的整数数组 <code>edges</code> 表示，其中 <code>edges[i]</code> 表示存在一条从节点 <code>i</code> 到节点 <code>edges[i]</code> 的 <strong>有向</strong> 边。</p>

<p>节点 <code>i</code> 的 <strong>边积分</strong> 定义为：所有存在一条指向节点 <code>i</code> 的边的节点的 <strong>编号</strong> 总和。</p>

<p>返回 <strong>边积分</strong> 最高的节点。如果多个节点的 <strong>边积分</strong> 相同，返回编号 <strong>最小</strong> 的那个。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p> 
<img src="https://assets.leetcode.com/uploads/2022/06/20/image-20220620195403-1.png" style="width: 450px; height: 260px;"> <pre><strong>输入：</strong>edges = [1,0,0,0,0,7,7,5]
<strong>输出：</strong>7
<strong>解释：</strong>
- 节点 1、2、3 和 4 都有指向节点 0 的边，节点 0 的边积分等于 1 + 2 + 3 + 4 = 10 。
- 节点 0 有一条指向节点 1 的边，节点 1 的边积分等于 0 。
- 节点 7 有一条指向节点 5 的边，节点 5 的边积分等于 7 。
- 节点 5 和 6 都有指向节点 7 的边，节点 7 的边积分等于 5 + 6 = 11 。
节点 7 的边积分最高，所以返回 7 。
</pre> </img>

<p><strong>示例 2：</strong></p> 
<img src="https://assets.leetcode.com/uploads/2022/06/20/image-20220620200212-3.png" style="width: 150px; height: 155px;"> <pre><strong>输入：</strong>edges = [2,0,0,2]
<strong>输出：</strong>0
<strong>解释：
</strong>- 节点 1 和 2 都有指向节点 0 的边，节点 0 的边积分等于 1 + 2 = 3 。
- 节点 0 和 3 都有指向节点 2 的边，节点 2 的边积分等于 0 + 3 = 3 。
节点 0 和 2 的边积分都是 3 。由于节点 0 的编号更小，返回 0 。
</pre> </img>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>n == edges.length</code></li> 
 <li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li> 
 <li><code>0 &lt;= edges[i] &lt; n</code></li> 
 <li><code>edges[i] != i</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>图 | 哈希表</details><br>

<div>👍 18, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

