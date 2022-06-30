<bits./stdc++.h>
using namespace std;
////给你一个整数数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。 
////
//// 你可以假设所有输入数组都可以得到满足题目要求的结果。 
////
//// 
////
//// 示例 1： 
////
//// 
////输入：nums = [1,5,1,1,6,4]
////输出：[1,6,1,5,1,4]
////解释：[1,4,1,5,1,6] 同样是符合题目要求的结果，可以被判题程序接受。
//// 
////
//// 示例 2： 
////
//// 
////输入：nums = [1,3,2,2,3,1]
////输出：[2,3,1,3,1,2]
//// 
////
//// 
////
//// 提示： 
////
//// 
//// 1 <= nums.length <= 5 * 10⁴ 
//// 0 <= nums[i] <= 5000 
//// 题目数据保证，对于给定的输入 nums ，总能产生满足题目要求的结果 
//// 
////
//// 
////
//// 进阶：你能用 O(n) 时间复杂度和 / 或原地 O(1) 额外空间来实现吗？ 
//// Related Topics 数组 分治 快速选择 排序 👍 404 👎 0
//

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
public:
    void wiggleSort(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<int> copy = nums;
        int  n = nums.size();
        if(n <= 2)
            return ;
        reverse(nums.begin(), nums.begin() + (n - 1)/2 + 1);//+1
        reverse(copy.begin() + (n - 1)/2 + 1, copy.end());
        for(int i = (n - 1)/2, j =(n - 1)/2+ (n - 1)/2; i > 0; i--){//前半部分赋值
            nums[j] = nums[i];
            j -=2;
        }
        if(!(n%2)){//偶数最后一位由后半部分赋值
            for(int i = n - 1, j = n - 1; i > (n - 1)/2; i--){
                nums[j] = copy[i];
                j -= 2;
            }
        }
        else {//奇数最后一位由前半部分赋值,此处不动
            for(int i = n - 1, j = n - 2; i > (n - 1)/2; i--){
                nums[j] = copy[i];
                j -= 2;
            }
        }
    }
};
//leetcode submit region end(Prohibit modification and deletion)


int main() {
    //构造vector数组
    int a[] = { 5,3,1,2,6,7,8,5,5};
    int h = 6;
    vector<int> nums(a, a + sizeof(a) / sizeof(int));
    Solution solution;
    solution.wiggleSort(nums);
    //函数返回值是int 可直接输出
    // cout << solution.wiggleSort(nums) << endl;
    // cout << solution.minEatingSpeed(num, h) << endl;
    //函数返回值是vector，不可用cout直接输出
//     vector<int> res = solution.wiggleSort(nums);

    // vector<int> res = solution.ts(nums,  h);
    for (int i = 0; i < nums.size(); ++i) {
        cout << nums[i] << " ";
    }
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