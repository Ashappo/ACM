```cpp
#include<bits/stdc++.h>
using namespace std;
vector<int> an;
int main() {
 int ai, n;
 int min, max;
 cin >> n >> min >> max;
 if (min > max)
  swap(min, max);
 for (int i = 0; i < n; i++) {
  cin >> ai;
  an.push_back(ai);
 }
 sort(an.begin(), an.end());
 if (2 * min > n || 2 * max < n) {
  cout << -1 << endl;
  return 0;
 }
 vector<int>::iterator itmin = an.begin() + min - 1;
 vector<int>::iterator itmax = an.begin() + max - 1;
 vector<int>::iterator itrmin = an.end() - min - 1;
 vector<int>::iterator itrmax = an.end() - max - 1;
 int result[4] = {*itmin, *itmax, *itrmin, *itrmax};
 sort(result, result + 4);
 cout << result[1] << endl;
 return 0;
}

/*网找答案得错误，但能牛客AC，无语子*/
// #include<iostream>
// #include<vector>
// #include<algorithm>
// using namespace std;
// int main()
// {
//     vector<int > v;
//     int n, x, y;
//     int tmp;
//     cin >> n >> x >> y;
//     if (x > y || 2 * y < n)
//     {
//         cout << -1;
//     }
//     else
//     {
//         for (int i = 0; i < n; i++)
//         {
//             cin >> tmp;
//             v.push_back(tmp);
//         }
//         sort(v.begin(), v.end());
//         for (int i = x; i <= y; i++)
//         {
//             if (n - x <= y && n - x >= x)
//             {
//                 cout << v[i - 1];
//                 break;
//             }
//         }
//     }
//     return 0;
// }
```