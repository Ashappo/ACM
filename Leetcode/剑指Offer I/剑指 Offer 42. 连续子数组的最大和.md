> 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/
> 链接：https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
>
> 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
>
> 要求时间复杂度为O(n)。
>
>  
>
> 示例1:
>
> 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
> 输出: 6
> 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
>
>
> 提示：
>
> 1 <= arr.length <= 10^5
> -100 <= arr[i] <= 100
>

```cpp
#(1)较复杂，循环三次(l+r+accu)+两个数组，left数组存储从0到当前位置的最大连续和，如果left[i]左侧left[i-1]<0，left[i] = nums[i]，否则left[i] = left[i-1] + nums[i]。右侧同理，最后再循环一次计算max(l+r-nums[i])的最大值即为最大连续和。但是很复杂，可以简化为一次for循环。如下
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        vector<int> left = nums;
        vector<int> right = nums;
        int n = nums.size();
        left[0] = nums[0];
        for (int i = 1; i < n; i++){
            if(left[i-1] >= 0){
                left[i] = left[i - 1]+nums[i];
            }
            else
                left[i] = nums[i];
        }
        right[n - 1] = nums[n - 1];
        for (int j = n - 2; j >= 0;j--){
           
           if(right[j + 1]>=0){
               right[j] = right[j + 1] + nums[j];
           }
           else
               right[j] = nums[j];
        }
        int res = INT32_MIN;
        for (int k = 0; k < n;k++){
            res = max(res, left[k] + right[k] - nums[k]);
        }
        return res;
    }
};
```

```cpp
#(2)一次for循环。用dp。,在循环过程计算并存储当前max即可。
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
		vector<int>dp(n, 0);
        int ans = dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            dp[i] = max(dp[i - 1] + nums[i], nums[i]);//意味着如果dp[i-1]<0就可以舍弃重新开始计算
            ans = max(ans, dp[i]);
        }
        return ans;
    }
};
```

```cpp
#(3)用前缀和求,当前位置的sum总和减去前面最小的minnum，得到值为最大和，不断更新minnum和ans
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
		int n = nums.size(), ans = INT_MIN, sum = 0, minnum = 0;
		for(int i = 0; i < n; i++){
            sum += nums[i];
            ans = max(ans, sum - minnum);//pac
            minnum = min(minnum, sum);
        }
        return ans;
    }
};
```

