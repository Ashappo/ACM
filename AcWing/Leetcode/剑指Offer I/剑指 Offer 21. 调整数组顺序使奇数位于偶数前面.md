> 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
>
>  
>
> 示例：
>
> 输入：nums = [1,2,3,4]
> 输出：[1,3,2,4] 
> 注：[3,1,2,4] 也是正确的答案之一。
>
>
> 提示：
>
> 0 <= nums.length <= 50000
> 0 <= nums[i] <= 10000
> 链接：https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof

```cpp
#新建数组，双指针，一个从前插，一个从后插，如果不新建数组怎么做？
class Solution {
public:
    vector<int> exchange(vector<int>& nums) {
        int n = nums.size(), p1 = 0, p2 = n - 1;//pac前面(n+1)/2而不是n/2+1
        vector<int> ans(n);
        for(int i = 0 ; i < n; i++){
            if(nums[i] & 1) ans[p1++] = nums[i];
            else ans[p2--] = nums[i];
        }
        return ans;
    }
};
//20 ms	17.7 MB
```

```cpp
// #仍然双指针，但是前面扫描奇数，后面扫描偶数。不满足则将两者交换
class Solution {
public:
    vector<int> exchange(vector<int>& nums) {
		int n =nums.size();
        for(int i = 0, j = n - 1; i < j; i++){//pac i < j 不能是i<=j
            if(nums[i] & 1) continue;
            else {
                while(i < j && !(nums[j] & 1))	j--;//pac i < j
                swap(nums[i], nums[j]);
            }
        }
        return nums;
    }
};
```

