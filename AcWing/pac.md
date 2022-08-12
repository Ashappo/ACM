```
1.出现case num 时，cin>>n,不用while(需要单独计数更麻烦)，不如用for(t:1..n) cout<<".."<<t<<
Case #1: POSSIBLE
Case #2: POSSIBLE
```

```cpp
2.vector<int> ans;经常出问题(不初始化大小，直接插入可能有问题，并且初始化大小，如果用size，那么结果不一定正确)。
    不如根据数据量建造int ans[N];for(ans[cnt++] = ...) 用cnt记录数据量(也知道每次更改的数组下标是多少，每次插入相当于直接无视之前的数据，也不用向vec一样重置数组)，那么只需输出for(i:1..cnt) ans[i]即可
```

```cpp
考虑数据溢出的问题：
    sum = 5616545, a= 546545, b =894946
 (1)pac:sum *= a/(a+b)(结果为0)，(2)写成sum = (sum*a)/(a+b)(也不可以，ac数据大时，会溢出)
    应写为sum /= (a + b); sum *= a;
```

```cpp
int n, m;//在外面定义全局变量，会比main中定义好
int res; 
string s,c; 
int main()
{
    cin >> n;
}


int main()
{
    int n, m;
int res; 
string s,c; 
    cin >> n;
}
```

