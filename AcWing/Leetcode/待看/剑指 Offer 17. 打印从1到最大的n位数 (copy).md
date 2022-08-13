> 链接：https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof
>
> 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
>
> 示例 1:
>
> 输入: n = 1
> 输出: [1,2,3,4,5,6,7,8,9]
>
>
> 说明：
>
> 用返回一个整数列表来代替打印
> n 为正整数
>

```cpp
#不考虑大数：假定都在int32数据范围内
class Solution {
public:
    vector<int> printNumbers(int n) {
        vector<int> ans;
        int up = pow(10, n);
        for(int i = 1; i < up; i++) ans.push_back(i);
        return ans;
    }
};
```

```cpp
#大数，超过int能表示的范围，用string，但是string怎么实现+1的功能呢，很麻烦。考虑用全排列，递归的方式构造字符串，来避免
例如 "999"+ 1 ="1000"的复杂操作。
    // 剑指Offer上是要求打印大数的，建议直接抛开提交代码的限制，假定题目的要求为返回 vector<string>。把dfs函数拆开。辅助函数 dfs(x, len) 的作用是：生成长度为len的数字，正在确定第 x 位。当 x=0 时表示左边第一位，不能为0，这样可以避免出现 0 开头的字符串。
class Solution {
    vector<string> res;
    string cur;
    char NUM[10] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    
    // 生成长度为 len 的数字，正在确定第x位（从左往右）
    void dfs(int x, int len) {
        if(x == len) {
            res.push_back(cur);
            return;
        }
        int start = x == 0 ? 1 : 0; // X=0表示左边第一位数字，不能为0
        for(int i = start; i < 10; i++) {
            cur.push_back(NUM[i]); // 确定本位数字
            dfs(x + 1, len); // 确定下一位数字
            cur.pop_back(); // 删除本位数字,进入下一次循环，插入下一个数cur.push_back(NUM[i]); 
        }
    }
public:
    vector<int> printNumbers(int n) {
        for(int i=1; i<=n; i++) // 数字长度：1~n
            dfs(0, i);
        vector<int> res_int;
        for(int i=0; i<res.size(); i++)
            res_int.push_back(stoi(res[i]));
        return res_int;
}
};
```

