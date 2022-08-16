> 链接：https://leetcode.cn/problems/que-shi-de-shu-zi-lcof
>
> 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
>
>  
>
> 示例 1:
>
> 输入: [0,1,3]
> 输出: 2
> 示例 2:
>
> 输入: [0,1,2,3,4,5,6,7,9]
> 输出: 8
>
>
> 限制：
>
> 1 <= 数组长度 <= 1000
>

```cpp
#将对应位置变负，超过的n用flag记录
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size(), ans = 0;
        bool flag = false;
        for(int i = 0; i < n; i++){
            if(abs(nums[i]) == n) flag = true;
            else{
                int pos = abs(nums[i]);
                nums[pos] = -nums[pos];
            }
        }
        if(!flag) ans = n;
        else{
            for(int i = 0; i < n; i++){
                if(nums[i] > 0){
                    ans = i;break;
                } 
            }
        }
        return ans;
    }
};
```

```cpp
#pac待看二分：
思路：初始化： 左边界 left = 0 ，右边界 right = len(nums)−1 ；代表闭区间 [left, right] 。
循环二分： 当 left ≤ right 时循环 （即当闭区间 [left, j] 为空时跳出） ；
计算中点 mid = (left + right)/2 ，
若 nums[mid] = mid ，说明mid前面的元素肯定都是完整的不少元素所以只需要继续二分右边的数组即可，则 “右子数组的首位元素” 一定在闭区间 [mid+1, right] 中，因此执行 left = mid+1；
若 nums[mid] != mid ，说明mid前面的元素就有少的所以只要继续二分左边的数组即可，则 “左子数组的末位元素” 一定在闭区间 [left, mid−1] 中，因此执行 right = mid−1；
返回值： 跳出时，变量 left 和 right 分别指向 “右子数组的首元素” 和 “左子数组的末元素” 。因此返回 i 即可。

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int left = 0;
        int right = nums.size() - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            /* 如果相等说明 left 到 mid 中间肯定不少元素 所以往右边二分查找 */
            if(nums[mid] == mid) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
};
```

