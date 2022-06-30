//头文件
#include<bits/stdc++.h>
using namespace std;
 
//leetcode代码
class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        const int MAX = 1001;
        int dp[MAX][MAX] = {0};
        for (int i = 1; i <= len1; i++){
            for (int j = 1; j <= len2;j++){
                if(text1[i-1] == text2[j-1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[len1][len2];
    }
};

// class Solution {
// public:
//     int search(vector<int>& nums, int target) {
//         int low = 0;
//         int high = nums.size() -1;
//         while(low <= high){
//         int mid = (low + high)/2;
//         if(nums[mid ]== target){
//            return mid;
//         }
//         else if(nums[mid] < target){
//             low = mid+1;
//         }
//         else  high = mid;        
//         }
//         return -1;
//     }
// };



// struct ListNode {
//       int val;
//       ListNode *next;
//       ListNode() : val(0), next(nullptr) {}
//       ListNode(int x) : val(x), next(nullptr) {}
//       ListNode(int x, ListNode *next) : val(x), next(next) {}
//   };
// 
// class Solution {
// public:
//     ListNode* removeNthFromEnd(ListNode* head, int n) {
//         ListNode *dummy = new ListNode(0, head);    //使用哨兵节点（虚拟头节点）
//         ListNode *fast = head, *slow = dummy;       //慢指针起始位置在快指针前面

//         while (n -- ) fast = fast->next;            //快指针先走n步
//         while (fast)
//         {
//             fast = fast->next;                      //快慢指针齐步走，直到快指针走完链表
//             slow = slow->next;
//         }

//         slow->next = slow->next->next;              //慢指针跳过下一节点，即倒数第n个节点

//         return dummy->next;
//     }
// };



 
//主函数
int main() {
    //构造vector数组
    // int a[] = {1,2,3,4,5};
    // int h = 2;
    string string1 = "abcde";
    string string2 = "ace";

    // vector<int> nums(a, a + sizeof(a) / sizeof(int));
    Solution solution;

    //函数返回值是int 可直接输出
    // cout << solution.longestCommonSubsequence(nums) << endl;
    // cout << solution.removeNthFromEnd(nums, h) << endl;

    //字符串string格式
    cout << solution.longestCommonSubsequence(string1, string2) << endl;

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