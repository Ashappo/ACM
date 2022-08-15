ACM:

```c++
// Created by Ashappo on 2022/8/15.
#include<bits/stdc++.h>
#define x first
#define y second
using namespace std;
typedef long long LL;
typedef unsigned long long ULL;
typedef pair<int, int> PII;
typedef pair<double, double> PDD;
const int N = 1e5+10;
int main(){
    ios::sync_with_stdio(false);cin.tie(0);
    int a[N];
//    int a[N][M];
    int n, m;
    cin>>n>>m;
    /*int N = 10, M = 5;
   vector<vector<int> > obj(N, vector<int>(M));*/
    clock_t starttime, endtime;
    starttime = clock();//pac记得去掉!!
    memset(a, 0, sizeof(a));
//    vector<int> b(n, 0);
//    while(n--){}
    for(int i = 0; i < n; i++){
        cin>>a[i];
    }
    
    for(int i = 0; i < n; i++){
        cout<<a[i]<<' ';
    }

    /*for(int i=0; i< obj.size(); i++)//输出二维动态数组
    {
        for(int j=0;j<obj[i].size();j++)
        {
            cout<<obj[i][j]<<" ";
        }
        cout<<"\n";
    }*/

    endtime = clock();
    cout<<"time:"<<double(endtime -starttime)<<"ms";//pac记得去掉!!
    return 0;
}
```



