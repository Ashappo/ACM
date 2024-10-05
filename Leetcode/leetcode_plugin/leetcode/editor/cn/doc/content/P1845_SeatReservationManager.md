<p>请你设计一个管理 <code>n</code>&nbsp;个座位预约的系统，座位编号从&nbsp;<code>1</code>&nbsp;到&nbsp;<code>n</code>&nbsp;。</p>

<p>请你实现&nbsp;<code>SeatManager</code>&nbsp;类：</p>

<ul> 
 <li><code>SeatManager(int n)</code>&nbsp;初始化一个&nbsp;<code>SeatManager</code>&nbsp;对象，它管理从 <code>1</code>&nbsp;到 <code>n</code>&nbsp;编号的&nbsp;<code>n</code>&nbsp;个座位。所有座位初始都是可预约的。</li> 
 <li><code>int reserve()</code>&nbsp;返回可以预约座位的&nbsp;<strong>最小编号</strong>&nbsp;，此座位变为不可预约。</li> 
 <li><code>void unreserve(int seatNumber)</code>&nbsp;将给定编号&nbsp;<code>seatNumber</code>&nbsp;对应的座位变成可以预约。</li> 
</ul>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>
["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
[[5], [], [], [2], [], [], [], [], [5]]
<strong>输出：</strong>
[null, 1, 2, null, 2, 3, 4, 5, null]

<strong>解释：</strong>
SeatManager seatManager = new SeatManager(5); // 初始化 SeatManager ，有 5 个座位。
seatManager.reserve();    // 所有座位都可以预约，所以返回最小编号的座位，也就是 1 。
seatManager.reserve();    // 可以预约的座位为 [2,3,4,5] ，返回最小编号的座位，也就是 2 。
seatManager.unreserve(2); // 将座位 2 变为可以预约，现在可预约的座位为 [2,3,4,5] 。
seatManager.reserve();    // 可以预约的座位为 [2,3,4,5] ，返回最小编号的座位，也就是 2 。
seatManager.reserve();    // 可以预约的座位为 [3,4,5] ，返回最小编号的座位，也就是 3 。
seatManager.reserve();    // 可以预约的座位为 [4,5] ，返回最小编号的座位，也就是 4 。
seatManager.reserve();    // 唯一可以预约的是座位 5 ，所以返回 5 。
seatManager.unreserve(5); // 将座位 5 变为可以预约，现在可预约的座位为 [5] 。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li> 
 <li><code>1 &lt;= seatNumber &lt;= n</code></li> 
 <li>每一次对&nbsp;<code>reserve</code>&nbsp;的调用，题目保证至少存在一个可以预约的座位。</li> 
 <li>每一次对&nbsp;<code>unreserve</code>&nbsp;的调用，题目保证&nbsp;<code>seatNumber</code>&nbsp;在调用函数前都是被预约状态。</li> 
 <li>对&nbsp;<code>reserve</code> 和&nbsp;<code>unreserve</code>&nbsp;的调用&nbsp;<strong>总共</strong>&nbsp;不超过&nbsp;<code>10<sup>5</sup></code>&nbsp;次。</li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>设计 | 堆（优先队列）</details><br>

<div>👍 40, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：已完成网站教程、网站习题、配套插件中所有多语言代码的校准，解决了之前 chatGPT 翻译可能出错的问题~**

<details><summary><strong>labuladong 思路</strong></summary>

<div id="labuladong_solution_zh">

## 基本思路

这题是 [379. 电话目录管理系统](/problems/design-phone-directory) 的进阶版，那一道题返回的空闲号码可以随意，而这道题要求返回**最小**的座位编号。

其实很思路是一样的，只是这里需要用到能够按照元素大小自动排序的数据结构 [优先级队列（二叉堆）](https://labuladong.online/algo/data-structure-basic/binary-heap-basic/)，直接看代码吧。

</div>

**标签：二叉堆，[数据结构](https://labuladong.online/algo/)，[设计](https://labuladong.online/algo/)**

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

#include <queue>

class SeatManager {
    // 利用优先级队列自动排序，队头的元素就是最小的
    std::priority_queue<int, std::vector<int>, std::greater<int>> pq;

public:
    SeatManager(int n) {
        // 初始化所有空闲座位
        for (int i = 1; i <= n; i++) {
            pq.push(i);
        }
    }

    int reserve() {
        // 拿出队头元素（最小）
        int seat = pq.top();
        pq.pop();
        return seat;
    }

    void unreserve(int i) {
        pq.push(i);
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译。
# 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

import heapq

class SeatManager:
    # 利用优先级队列自动排序，队头的元素就是最小的
    def __init__(self, n: int):
        # 初始化所有空闲座位
        self.pq = list(range(1, n + 1))
        heapq.heapify(self.pq)

    def reserve(self) -> int:
        # 拿出队头元素（最小）
        return heapq.heappop(self.pq)

    def unreserve(self, i: int) -> None:
        heapq.heappush(self.pq, i)
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class SeatManager {
    // 利用优先级队列自动排序，队头的元素就是最小的
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public SeatManager(int n) {
        // 初始化所有空闲座位
        for (int i = 1; i <= n; i++) {
            pq.offer(i);
        }
    }

    public int reserve() {
        // 拿出队头元素（最小）
        return pq.poll();
    }

    public void unreserve(int i) {
        pq.offer(i);
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

import (
	"container/heap"
)

// IntHeap is a min-heap of ints.
type IntHeap []int

func (h IntHeap) Len() int           { return len(h) }
func (h IntHeap) Less(i, j int) bool { return h[i] < h[j] }
func (h IntHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *IntHeap) Push(x interface{}) {
	*h = append(*h, x.(int))
}

func (h *IntHeap) Pop() interface{} {
	old := *h
	n := len(old)
	x := old[n-1]
	*h = old[0 : n-1]
	return x
}

// SeatManager definition
type SeatManager struct {
	// 利用优先级队列自动排序，队头的元素就是最小的
	pq IntHeap
}

// Constructor initializes a SeatManager
func Constructor(n int) SeatManager {
	// 初始化所有空闲座位
	pq := make(IntHeap, n)
	for i := 0; i < n; i++ {
		pq[i] = i + 1
	}
	heap.Init(&pq)
	return SeatManager{pq: pq}
}

// Reserve reserves the smallest available seat
func (this *SeatManager) Reserve() int {
	// 拿出队头元素（最小）
	smallest := heap.Pop(&this.pq).(int)
	return smallest
}

// Unreserve unreserves the given seat
func (this *SeatManager) Unreserve(i int) {
	heap.Push(&this.pq, i)
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译。
// 本代码的正确性已通过力扣验证，但可能缺失注释。必要时请对照我的 java 代码查看。

var SeatManager = function(n) {
    // 利用优先级队列自动排序，队头的元素就是最小的
    this.pq = new MinPriorityQueue();
    
    // 初始化所有空闲座位
    for (let i = 1; i <= n; i++) {
        this.pq.enqueue(i);
    }
};

SeatManager.prototype.reserve = function() {
    // 拿出队头元素（最小）
    return this.pq.dequeue().element;
};

SeatManager.prototype.unreserve = function(i) {
    this.pq.enqueue(i);
};
```

</div></div>
</div></div>

</div>

</details>
</div>

