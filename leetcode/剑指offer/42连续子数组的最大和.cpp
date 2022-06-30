//头文件
#include<bits/stdc++.h>
using namespace std;
 
//leetcode代码
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

 
//主函数
int main() {
    //构造vector数组
    int a[] = {0,0,0,-1};
    int h = 6;
    vector<int> nums(a, a + sizeof(a) / sizeof(int));
    Solution solution;

    //函数返回值是int 可直接输出
    cout << solution.maxSubArray(nums) << endl;

    // cout << solution.minEatingSpeed(num, h) << endl;

    //函数返回值是vector，不可用cout直接输出
    // vector<int> res = solution.ts(nums);

    // vector<int> res = solution.ts(nums,  h);
    // for (int i = 0; i < res.size(); ++i) {
    //     cout << res[i] << " ";
    // }
    // //二维数组定义及输出
    // int N=5, M=6; 
    // vector<vector<int> > obj(N, vector<int>(M)); //定义二维动态数组5行6列 
    // for(int i=0; i< obj.size(); i++)//输出二维动态数组 
    // {
    //     for(int j=0;j<obj[i].size();j++)
    //     {
    //         cout<<obj[i][j]<<" ";
    //     }
    //     cout<<"\n";
    // }
    return 0;
}