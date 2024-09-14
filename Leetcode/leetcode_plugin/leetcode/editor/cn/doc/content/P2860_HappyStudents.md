<p>给你一个下标从 <strong>0</strong> 开始、长度为 <code>n</code> 的整数数组 <code>nums</code> ，其中 <code>n</code> 是班级中学生的总数。班主任希望能够在让所有学生保持开心的情况下选出一组学生：</p>

<p>如果能够满足下述两个条件之一，则认为第 <code>i</code> 位学生将会保持开心：</p>

<ul> 
 <li>这位学生被选中，并且被选中的学生人数 <strong>严格大于</strong> <code>nums[i]</code> 。</li> 
 <li>这位学生没有被选中，并且被选中的学生人数 <strong>严格小于</strong> <code>nums[i]</code> 。</li> 
</ul>

<p>返回能够满足让所有学生保持开心的分组方法的数目。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,1]
<strong>输出：</strong>2
<strong>解释：</strong>
有两种可行的方法：
班主任没有选中学生。
班主任选中所有学生形成一组。 
如果班主任仅选中一个学生来完成分组，那么两个学生都无法保持开心。因此，仅存在两种可行的方法。
</pre>

<p><strong class="example">示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [6,0,3,3,6,7,2,7]
<strong>输出：</strong>3
<strong>解释：</strong>
存在三种可行的方法：
班主任选中下标为 1 的学生形成一组。
班主任选中下标为 1、2、3、6 的学生形成一组。
班主任选中所有学生形成一组。 
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>0 &lt;= nums[i] &lt; nums.length</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 枚举 | 排序</details><br>

<div>👍 70, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>



