<p>给你一个由 <code>n</code> 个整数组成的数组 <code>nums</code>，以及两个整数 <code>k</code> 和 <code>x</code>。</p>

<p>数组的 <strong>x-sum</strong> 计算按照以下步骤进行：</p>

<ul> 
 <li>统计数组中所有元素的出现次数。</li> 
 <li>仅保留出现次数最多的前 <code>x</code> 个元素的每次出现。如果两个元素的出现次数相同，则数值<strong> 较大 </strong>的元素被认为出现次数更多。</li> 
 <li>计算结果数组的和。</li> 
</ul>

<p><strong>注意</strong>，如果数组中的不同元素少于 <code>x</code> 个，则其 <strong>x-sum</strong> 是数组的元素总和。</p>

<p>返回一个长度为 <code>n - k + 1</code> 的整数数组 <code>answer</code>，其中 <code>answer[i]</code> 是 <span data-keyword="subarray-nonempty">子数组</span> <code>nums[i..i + k - 1]</code> 的 <strong>x-sum</strong>。</p>

<p><strong>子数组</strong> 是数组内的一个连续<b> 非空</b> 的元素序列。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">nums = [1,1,2,2,3,4,2,3], k = 6, x = 2</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">[6,10,12]</span></p>

<p><strong>解释：</strong></p>

<ul> 
 <li>对于子数组 <code>[1, 1, 2, 2, 3, 4]</code>，只保留元素 1 和 2。因此，<code>answer[0] = 1 + 1 + 2 + 2</code>。</li> 
 <li>对于子数组 <code>[1, 2, 2, 3, 4, 2]</code>，只保留元素 2 和 4。因此，<code>answer[1] = 2 + 2 + 2 + 4</code>。注意 4 被保留是因为其数值大于出现其他出现次数相同的元素（3 和 1）。</li> 
 <li>对于子数组 <code>[2, 2, 3, 4, 2, 3]</code>，只保留元素 2 和 3。因此，<code>answer[2] = 2 + 2 + 2 + 3 + 3</code>。</li> 
</ul>

<p><strong class="example">示例 2：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">nums = [3,8,7,8,7,5], k = 2, x = 2</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">[11,15,15,15,12]</span></p>

<p><strong>解释：</strong></p>

<p>由于 <code>k == x</code>，<code>answer[i]</code> 等于子数组 <code>nums[i..i + k - 1]</code> 的总和。</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= n == nums.length &lt;= 50</code></li> 
 <li><code>1 &lt;= nums[i] &lt;= 50</code></li> 
 <li><code>1 &lt;= x &lt;= k &lt;= nums.length</code></li> 
</ul>

<div>👍 0, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>
