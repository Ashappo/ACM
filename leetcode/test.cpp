//头文件
#include<bits/stdc++.h>
// #include <algorithm>
// #include <bitset>
// #include <complex>
// #include <deque>
// #include <exception>
// #include <fstream>
// #include <functional>
// #include <iomanip>
// #include <ios>
// #include <iosfwd>
// #include <iostream>
// #include <istream>
// #include <iterator>
// #include <limits>
// #include <list>
// #include <locale>
// #include <map>
// #include <memory>
// #include <new>
// #include <numeric>
// #include <ostream>
// #include <queue>
// #include <set>
// #include <sstream>
// #include <stack>
// #include <stdexcept>
// #include <streambuf>
// #include <string>
// #include <typeinfo>
// #include <utility>
// #include <valarray>
// #include <vector>
 
// #if __cplusplus >= 201103L
// #include <array>
// #include <atomic>
// #include <chrono>
// #include <condition_variable>
// #include <forward_list>
// #include <future>
// #include <initializer_list>
// #include <mutex>
// #include <random>
// #include <ratio>
// #include <regex>
// #include <scoped_allocator>
// #include <system_error>
// #include <thread>
// #include <tuple>
// #include <typeindex>
// #include <type_traits>
// #include <unordered_map>
// #include <unordered_set>
// #endif

using namespace std;

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