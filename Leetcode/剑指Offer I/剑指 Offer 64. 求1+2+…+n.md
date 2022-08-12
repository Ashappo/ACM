> 链接：https://leetcode.cn/problems/qiu-12n-lcof
>
> 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
>
>  
>
> 示例 1：
>
> 输入: n = 3
> 输出: 6
> 示例 2：
>
> 输入: n = 9
> 输出: 45
>
>
> 限制：
>
> 1 <= n <= 10000

```cpp
#a?a:b是不能用的，所以下解不可行。考虑如何用特殊方法，打到判断递归结束
class Solution {
public:
    int sumNums(int n) {
        return n == 0 ? 0 : n + sumNums(n - 1);
    }
};
```

```cpp
#以逻辑运算符 && 为例，对于 A && B 这个表达式，如果 A 表达式返回1，b才执行，A返回0，那么B不执行，所以我们可以将A设为n，B设为递归体，如下
#直接用n判断是否到0，并且用n记录每一层循环的结果，作为返回值返回
class Solution {
public:
    int sumNums(int n) {
		n && ( n += sumNums(n - 1));
            return n;//sumNums(0)右侧不执行，直接返回n(0),向上累加 
        //s(1) return n( n+= s(0)-->n = 1+s(0)) s(2)) return n (n += s(1)-->n = 2 + s(1))
        //以此类推 s(n) return n = n + s(n - 1) 
    }
};
```

```cpp
#比上一版更容易理解一点，多用一个ans记录返回值。
class Solution {
public:
    int sumNums(int n) {
        int ans = 0;
		n && ( ans = n + sumNums(n - 1));
        return ans;//sumNums(0)右侧不执行，直接返回n(0),向上累加 
    }
};
```

```cpp
#考虑用||
class Solution {
public:
    int sumNums(int n) {
		n && ( n += sumNums(n - 1))
            return n;//sumNums(0)右侧不执行，直接返回n(0),向上累加 
        //s(1) return n( n+= s(0)-->n = 1+s(0)) s(2)) return n (n += s(1)-->n = 2 + s(1))
        //以此类推 s(n) return n = n + s(n - 1) 
    }
};
```

```cpp
#秀儿，用数组/2表达结果
class Solution {
public:
    int sumNums(int n) {
        bool a[n][n+1];
        return sizeof(a)>>1;
    }
};
//ans=1+2+3+...+n
//   =(1+n)*n/2
//   =sizeof(bool a[n][n+1])/2
//   =sizeof(a)>>1
```

