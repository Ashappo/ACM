<p>给你一个字符串 <code>word</code> 和一个 <strong>非负 </strong>整数 <code>k</code>。</p>

<p>返回 <code>word</code> 的 <span data-keyword="substring-nonempty">子字符串</span> 中，每个元音字母（<code>'a'</code>、<code>'e'</code>、<code>'i'</code>、<code>'o'</code>、<code>'u'</code>）<strong>至少</strong> 出现一次，并且 <strong>恰好 </strong>包含 <code>k</code> 个辅音字母的子字符串的总数。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">word = "aeioqq", k = 1</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">0</span></p>

<p><strong>解释：</strong></p>

<p>不存在包含所有元音字母的子字符串。</p>

<p><strong class="example">示例 2：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">word = "aeiou", k = 0</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">1</span></p>

<p><strong>解释：</strong></p>

<p>唯一一个包含所有元音字母且不含辅音字母的子字符串是 <code>word[0..4]</code>，即 <code>"aeiou"</code>。</p>

<p><strong class="example">示例 3：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><span class="example-io">word = "ieaouqqieaouqq", k = 1</span></p> 
</div>

<p><strong>输出：</strong>3</p>

<p><strong>解释：</strong></p>

<p>包含所有元音字母并且恰好含有一个辅音字母的子字符串有：</p>

<ul> 
 <li><code>word[0..5]</code>，即 <code>"ieaouq"</code>。</li> 
 <li><code>word[6..11]</code>，即 <code>"qieaou"</code>。</li> 
 <li><code>word[7..12]</code>，即 <code>"ieaouq"</code>。</li> 
</ul>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>5 &lt;= word.length &lt;= 250</code></li> 
 <li><code>word</code> 仅由小写英文字母组成。</li> 
 <li><code>0 &lt;= k &lt;= word.length - 5</code></li> 
</ul>

<div>👍 0, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

</div>

