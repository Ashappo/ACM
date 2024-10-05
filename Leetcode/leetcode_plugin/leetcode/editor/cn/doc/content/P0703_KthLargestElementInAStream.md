<p>设计一个找到数据流中第 <code>k</code> 大元素的类（class）。注意是排序后的第 <code>k</code> 大元素，不是第 <code>k</code> 个不同的元素。</p>

<p>请实现 <code>KthLargest</code>&nbsp;类：</p>

<ul> 
 <li><code>KthLargest(int k, int[] nums)</code> 使用整数 <code>k</code> 和整数流 <code>nums</code> 初始化对象。</li> 
 <li><code>int add(int val)</code> 将 <code>val</code> 插入数据流 <code>nums</code> 后，返回当前数据流中第 <code>k</code> 大的元素。</li> 
</ul>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><br /> <span class="example-io">["KthLargest", "add", "add", "add", "add", "add"]<br /> [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]</span></p> 
</div>

<p><strong>输出：</strong><span class="example-io">[null, 4, 5, 5, 8, 8]</span></p>

<p><strong>解释：</strong></p>

<p>KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);<br /> kthLargest.add(3); // 返回 4<br /> kthLargest.add(5); // 返回 5<br /> kthLargest.add(10); // 返回 5<br /> kthLargest.add(9); // 返回 8<br /> kthLargest.add(4); // 返回 8</p>

<p>&nbsp;</p>

<p><strong class="example">示例&nbsp;2：</strong></p>

<div class="example-block"> 
 <p><strong>输入：</strong><br /> <span class="example-io">["KthLargest", "add", "add", "add", "add"]<br /> [[4, [7, 7, 7, 7, 8, 3]], [2], [10], [9], [9]]</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>[null, 7, 7, 7, 8]</span></p>

<p><strong>解释：</strong></p> KthLargest kthLargest = new KthLargest(4, [7, 7, 7, 7, 8, 3]);
<br /> kthLargest.add(2); // 返回 7
<br /> kthLargest.add(10); // 返回 7
<br /> kthLargest.add(9); // 返回 7
<br /> kthLargest.add(9); // 返回 8

<p>&nbsp;</p> 
<strong>提示：</strong>

<ul> 
 <li><code>0 &lt;= nums.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>1 &lt;= k &lt;= nums.length + 1</code></li> 
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= val &lt;= 10<sup>4</sup></code></li> 
 <li>最多调用 <code>add</code> 方法 <code>10<sup>4</sup></code> 次</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>树 | 设计 | 二叉搜索树 | 二叉树 | 数据流 | 堆（优先队列）</details><br>

<div>👍 480, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题考察优先级队列的使用，可以先做下这道类似的题目 [215. 数组中的第 K 个最大元素](/problems/kth-largest-element-in-an-array)。

优先级队列的实现原理详见 [图文详解二叉堆，实现优先级队列](https://labuladong.online/algo/data-structure-basic/binary-heap-basic/)。

</div>

**标签：二叉堆，[数据结构](https://labuladong.online/algo/)**

<div id="solution">

## 解法代码



<div class="tab-panel"><div class="tab-nav">
<button data-tab-item="cpp" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">cpp🤖</button>

<button data-tab-item="python" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">python🤖</button>

<button data-tab-item="java" class="tab-nav-button btn active" data-tab-group="default" onclick="switchTab(this)">java🟢</button>

<button data-tab-item="go" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">go🤖</button>

<button data-tab-item="javascript" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">javascript🤖</button>
</div><div class="tab-content">
<div data-tab-item="cpp" class="tab-item " data-tab-group="default"><div class="highlight">

```cpp
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

class KthLargest {
private:
    int k;
    // 默认是小顶堆
    priority_queue<int, vector<int>, greater<int>> pq;

public:
    KthLargest(int k, vector<int>& nums) {
        // 将 nums 装入小顶堆，保留下前 k 大的元素
        for (int e : nums) {
            pq.push(e);
            if (pq.size() > k) {
                pq.pop();
            }
        }
        this->k = k;
    }

    int add(int val) {
        // 维护小顶堆只保留前 k 大的元素
        pq.push(val);
        if (pq.size() > k) {
            pq.pop();
        }
        // 堆顶就是第 k 大元素（即倒数第 k 小的元素）
        return pq.top();
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

import heapq

class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        # 默认是小顶堆
        self.pq = []
        # 将 nums 装入小顶堆，保留下前 k 大的元素
        for e in nums:
            heapq.heappush(self.pq, e)
            if len(self.pq) > k:
                heapq.heappop(self.pq)

    def add(self, val: int) -> int:
        # 维护小顶堆只保留前 k 大的元素
        heapq.heappush(self.pq, val)
        if len(self.pq) > self.k:
            heapq.heappop(self.pq)
        # 堆顶就是第 k 大元素（即倒数第 k 小的元素）
        return self.pq[0]
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class KthLargest {

    private int k;
    // 默认是小顶堆
    private PriorityQueue<Integer> pq = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        // 将 nums 装入小顶堆，保留下前 k 大的元素
        for (int e : nums) {
            pq.offer(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        this.k = k;
    }

    public int add(int val) {
        // 维护小顶堆只保留前 k 大的元素
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        // 堆顶就是第 k 大元素（即倒数第 k 小的元素）
        return pq.peek();
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

type KthLargest struct {
    k  int
    pq *PriorityQueue
}

// 默认是小顶堆
type PriorityQueue []int

func (pq PriorityQueue) Len() int { return len(pq) }

func (pq PriorityQueue) Less(i, j int) bool { return pq[i] < pq[j] }

func (pq PriorityQueue) Swap(i, j int) { pq[i], pq[j] = pq[j], pq[i] }

func (pq *PriorityQueue) Push(x interface{}) {
    *pq = append(*pq, x.(int))
}

func (pq *PriorityQueue) Pop() interface{} {
    old := *pq
    n := len(old)
    x := old[n-1]
    *pq = old[0 : n-1]
    return x
}

func Constructor(k int, nums []int) KthLargest {
    pq := &PriorityQueue{}
    heap.Init(pq)
    // 将 nums 装入小顶堆，保留下前 k 大的元素
    for _, e := range nums {
        heap.Push(pq, e)
        if pq.Len() > k {
            heap.Pop(pq)
        }
    }
    return KthLargest{k: k, pq: pq}
}

func (this *KthLargest) Add(val int) int {
    // 维护小顶堆只保留前 k 大的元素
    heap.Push(this.pq, val)
    if this.pq.Len() > this.k {
        heap.Pop(this.pq)
    }
    // 堆顶就是第 k 大元素（即倒数第 k 小的元素）
    return (*this.pq)[0]
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var KthLargest = function(k, nums) {
    this.k = k;
    // 默认是小顶堆
    this.pq = new MinPriorityQueue();

    // 将 nums 装入小顶堆，保留下前 k 大的元素
    for (let e of nums) {
        this.pq.enqueue(e);
        if (this.pq.size() > k) {
            this.pq.dequeue();
        }
    }
};

KthLargest.prototype.add = function(val) {
    // 维护小顶堆只保留前 k 大的元素
    this.pq.enqueue(val);
    if (this.pq.size() > this.k) {
        this.pq.dequeue();
    }
    // 堆顶就是第 k 大元素（即倒数第 k 小的元素）
    return this.pq.front().element;
};
```

</div></div>
</div></div>

**类似题目**：
  - [剑指 Offer II 059. 数据流的第 K 大数值 🟢](/problems/jBjn9C)

</div>

</details>
</div>



