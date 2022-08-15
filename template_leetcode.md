Leetcode:

```cpp
// Created by Ashappo on 2022/8/15.
#include<bits/stdc++.h>
#define x first
#define y second
using namespace std;
typedef long long LL;
typedef unsigned long long ULL;
typedef pair<int, int> PII;
typedef pair<double, double> PDD;
//leetcode submit region begin(Prohibit modification and deletion)

//leetcode submit region end(Prohibit modification and deletion)

int main() {
    clock_t startTime,endTime;
    startTime = clock();//计时开始
    ios::sync_with_stdio(false); cin.tie(0);
    Solution solution;
    int n = 1, m = 0;
    /*构造vector数组*/
    int a[] = { 5,3,1,2,6,7,8,5,5};
    int num = 6;
    string s = "asd";
    vector<char> suits = {'a','b','c','d','e'};
    vector<int> nums(a, a + sizeof(a) / sizeof(int));
    /*二维数组*/
    /*int N = 10, M = 5;
    vector<vector<int> > obj(N, vector<int>(M));*/

    /*返回单值*/
//     cout << solution.wiggleSort(nums) << endl;
//     cout << solution.minEatingSpeed(num, h) << endl;

    /*返回数组*/
//    vector<int> res = solution.wiggleSort(nums);
//    vector<int> res = solution.ts(nums,  h);
    /*for (int i = 0; i < res.size(); ++i) {
        cout << res[i] << " ";
    }*/

    /* 返回二维数组及输出*/
     /*for(int i=0; i< obj.size(); i++)//输出二维动态数组
     {
         for(int j=0;j<obj[i].size();j++)
         {
             cout<<obj[i][j]<<" ";
         }
         cout<<"\n";
     }*/

    endTime = clock();//计时结束
    cout << "The run time is: " <<(double)(endTime - startTime) << "ms" << endl;
    system("pause");
    return 0;
}
```



