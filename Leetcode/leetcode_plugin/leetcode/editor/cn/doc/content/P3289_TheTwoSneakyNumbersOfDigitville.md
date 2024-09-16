<p>数字小镇 Digitville 中，存在一个数字列表 <code>nums</code>，其中包含从 <code>0</code> 到 <code>n - 1</code> 的整数。每个数字本应 <strong>只出现一次</strong>，然而，有 <strong>两个 </strong>顽皮的数字额外多出现了一次，使得列表变得比正常情况下更长。</p>

<p>为了恢复 Digitville 的和平，作为小镇中的名侦探，请你找出这两个顽皮的数字。</p>

<p>返回一个长度为 2 的数组，包含这两个数字（顺序任意）。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong> <span class="example-io">nums = [0,1,1,0]</span></p> 
</div>

<p><strong>输出：</strong> <span class="example-io">[0,1]</span></p>

<p><strong>解释：</strong></p>

<p>数字 0 和 1 分别在数组中出现了两次。</p>

<p><strong class="example">示例 2：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong> <span class="example-io">nums = [0,3,2,1,3,2]</span></p> 
</div>

<p><strong>输出：</strong> <span class="example-io">[2,3]</span></p>

<p><strong>解释: </strong></p>

<p>数字 2 和 3 分别在数组中出现了两次。</p>

<p><strong class="example">示例 3：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong> <span class="example-io">nums = [7,1,5,4,3,4,6,0,9,5,8,2]</span></p> 
</div>

<p><strong>输出：</strong> <span class="example-io">[4,5]</span></p>

<p><strong>解释: </strong></p>

<p>数字 4 和 5 分别在数组中出现了两次。</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>2 &lt;= n &lt;= 100</code></li> 
 <li><code>nums.length == n + 2</code></li> 
 <li><code>0 &lt;= nums[i] &lt; n</code></li> 
 <li>输入保证 <code>nums</code> 中<strong> 恰好 </strong>包含两个重复的元素。</li> 
</ul>

<div>👍 0, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

