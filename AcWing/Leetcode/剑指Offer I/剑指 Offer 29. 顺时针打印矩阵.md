> 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/
> 链接：https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof
>
> 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
>
>  
>
> 示例 1：
>
> 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
> 输出：[1,2,3,6,9,8,7,4,5]
> 示例 2：
>
> 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
> 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
>
>
> 限制：
>
> 0 <= matrix.length <= 100
> 0 <= matrix[i].length <= 100

#与[54. 螺旋矩阵](E:\笔记\Leetcode\二维数组\54. 螺旋矩阵.md)区别在于空数组的判断，

```cpp
 if(!matrix.size() || !matrix[0].size()) return vector<int>();//pac 空数组时matrix[0].size()错误
```

```cpp
#
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(!matrix.size() || !matrix[0].size())  return vector<int>();//pac 空数组时matrix[0].size()错误
        int m = matrix.size(), n = matrix[0].size(), left = 0 , right = n - 1, high = 0, low = m - 1, cnt = 0;
        vector<int> ans;
        while(cnt < m*n){
            for(int i = left; i <= right&&cnt < m*n; i++) {
                ans.push_back(matrix[high][i]);cnt++;
            }high++;
            for(int i = high; i <= low&&cnt < m*n; i++){
                ans.push_back(matrix[i][right]);cnt++;
            }right--;
            // if(left == right || high == low) break;//pac 为什么要在中间加一个个判断才行？或者再for中加cnt < m*n的判断
            for(int i = right; i >= left&&cnt < m*n; i--){
                ans.push_back(matrix[low][i]);cnt++;
            }low--;  
            for(int i = low; i >= high&&cnt < m*n; i--){
                ans.push_back(matrix[i][left]);cnt++;
            }left++; 
        }
        return ans;
    }
};
```

