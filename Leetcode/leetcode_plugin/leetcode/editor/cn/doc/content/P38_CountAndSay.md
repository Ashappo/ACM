<p>「外观数列」是一个数位字符串序列，由递归公式定义：</p>

<ul> 
 <li><code>countAndSay(1) = "1"</code></li> 
 <li><code>countAndSay(n)</code> 是&nbsp;<code>countAndSay(n-1)</code> 的行程长度编码。</li> 
</ul>

<p>&nbsp;</p>

<ul> 
</ul>

<p><a href="https://baike.baidu.com/item/%E8%A1%8C%E7%A8%8B%E9%95%BF%E5%BA%A6%E7%BC%96%E7%A0%81/2931940">行程长度编码</a>（RLE）是一种字符串压缩方法，其工作原理是通过将连续相同字符（重复两次或更多次）替换为字符重复次数（运行长度）和字符的串联。例如，要压缩字符串&nbsp;<code>"3322251"</code>&nbsp;，我们将&nbsp;<code>"33"</code>&nbsp;用&nbsp;<code>"23"</code>&nbsp;替换，将&nbsp;<code>"222"</code>&nbsp;用&nbsp;<code>"32"</code>&nbsp;替换，将&nbsp;<code>"5"</code>&nbsp;用&nbsp;<code>"15"</code>&nbsp;替换并将&nbsp;<code>"1"</code>&nbsp;用&nbsp;<code>"11"</code>&nbsp;替换。因此压缩后字符串变为 <code>"23321511"</code>。</p>

<p>给定一个整数&nbsp;<code>n</code>&nbsp;，返回&nbsp;<strong>外观数列</strong>&nbsp;的第&nbsp;<code>n</code>&nbsp;个元素。</p>

<p><strong>示例 1：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong>n = 4</p> 
</div>

<p><strong>输出：</strong>"1211"</p>

<p><strong>解释：</strong></p>

<p>countAndSay(1) = "1"</p>

<p>countAndSay(2) = "1" 的行程长度编码 = "11"</p>

<p>countAndSay(3) = "11" 的行程长度编码 = "21"</p>

<p>countAndSay(4) = "21" 的行程长度编码 = "1211"</p>

<p><strong class="example">示例 2：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">n = 1</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">"1"</span></p>

<p><strong>解释：</strong></p>

<p>这是基本情况。</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 30</code></li> 
</ul>

<p>&nbsp;</p> 
<strong>进阶：</strong>你能迭代解决该问题吗？

<details><summary><strong>Related Topics</strong></summary>字符串</details><br>

<div>👍 1090, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>
