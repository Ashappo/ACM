```cpp
#include<bits/stdc++.h>
using namespace std;
#define N 310
int ans[N][N][N];
int tree[N];
int dfs(int left, int right, int mid)
{
    int res = 1e9;
    if (left > right) return 0;
    if (ans[left][right][mid] != -1) return ans[left][right][mid];
    for (int i = left; i <= right; i++) {
        int l = dfs(left, i - 1, i);
        int r = dfs(i + 1, right, i);
        res = min(res, l + r + tree[mid] * tree[i]);
    }
    ans[left][right][mid] = res;
    return ans[left][right][mid];
}
int main()
{
    memset(ans, -1, sizeof ans);
    int n;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        int tmp;
        scanf("%d", &tree[i]);
    }
    printf("%d\n", dfs(1, n , 0));
    return 0;
}

```

