// #include <iostream>
// #include <vector>
#include<bits/stdc++.h>
using namespace std;
int n;
vector<int> ai;
int MinRound(n, &ai)
{
    int round=0, attacknum = 1;
    if(n!=(ai.end()-ai.begin()))
        return false;
    else{
    sort(ai.begin(), ai.end());
    for (int i = 0; i < n; i++)
    {while(ai[i]!=0){
            ai[i] -= attacknum;
            round++;
    }
    attacknum++;
    }
    return round;
    }
}

int main(){
    cout<< MinRound(n,&ai);
    return 0;
}
