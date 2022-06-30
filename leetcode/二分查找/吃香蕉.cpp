//头文件
#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int n = piles.size();
        int lower_bound = 1,upper_bound = 0; 
        for(auto& pile : piles)
        {
            upper_bound = max(upper_bound,pile);
        }
        while(lower_bound < upper_bound)
        {
            int speed = (lower_bound + upper_bound) >> 1;
            int t = 0;
            for(auto& pile : piles)
            {
                t += (pile + speed - 1) / speed;
            }
            if(t <= h) upper_bound = speed;
            else lower_bound = speed + 1;
        }

        return upper_bound;
    }
};

//主函数
int main() {
    //构造vector数组
    int a[] = {1,2,3,4,5};
    int h = 154;
    vector<int> nums(a, a + sizeof(a) / sizeof(int));
    Solution solution;

    //函数返回值是int 可直接输出
    // cout << solution.longestCommonSubsequence(nums) << endl;
    cout << solution.minEatingSpeed(nums, h) << endl;

    return 0;
}