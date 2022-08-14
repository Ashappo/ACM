#include <iostream>
#include <unordered_map>
#include <string>
 
using namespace std;
 
void unordered_mapInit()
{
    //1.创建unordered_map
    unordered_map<int, string> map1;
    map1 = {};
    cout << "map1.size = " << map1.size() << " map1.empty = " << map1.empty() << " map1.max_size = " << map1.max_size() << endl;
    map1[2] = "狮泉河";
    map1[1] = "象泉河";
    map1[3] = "孔雀河";
 
    cout << "map1.size = " << map1.size() << " map1.empty = " << map1.empty() << " map1.max_size = " << map1.max_size() << endl;
    cout << "map1的值为：" << endl;
    unordered_map<int, string>::iterator iter1;
    for(iter1 = map1.begin(); iter1 != map1.end(); iter1++)
    {
        // std::string tempStr = iter1->second;//这样可以
        cout << iter1->first << ": " << iter1->second << endl;//为什么不能这样输出,加上头文件#include<string>才可以
        // cout << iter1->first << ": " << iter1->second.c_str() << endl;
 
    }
    //2.列表初始化
    unordered_map<int, string> map2 = {
       {2, "cherry"},
       {3, "peach"},
       {1, "melon"}
    };
    cout << "map2.size = " << map2.size() << " map2.empty = " << map2.empty() << " map2.max_size = " << map2.max_size() << endl;
    cout << "map2的值为：" << endl;
    for(auto &val: map2)
    {
        cout << val.first << ": " << val.second << endl;
    }
    //3.赋值初始化
    unordered_map<int, string> map3 = map2;
    unordered_map<int, string>::iterator iter3 = map3.begin();
    cout << "map3.size = " << map3.size() << " map3.empty = " << map3.empty() << " map3.max_size = " << map3.max_size() << endl;
    cout << "map3的值为：" << endl;
    while (iter3 != map3.end())
    {
        cout << iter3->first << ": " << iter3->second << endl;
        iter3++;
    }
    //4.拷贝初始化
    unordered_map<int, string> map4(map1);
    cout << "map4.size = " << map4.size() << " map4.empty = " << map4.empty() << " map4.max_size = " << map4.max_size() << endl;
    auto iter4 = map4.begin();
    cout << "map4的值为：" << endl;
    while (iter4 != map4.end())
    {
        cout << iter4->first << ": " << iter4->second << endl;
        iter4++;
    }
    //5.范围初始化
    unordered_map<int, string> map5(map2.begin(), map2.end());
    cout << "map5.size = " << map5.size() << " map5.empty = " << map5.empty() << " map5.max_size = " << map5.max_size() << endl;
    auto iter5 = map5.begin();
    cout << "map5的值为：" << endl;
    while (iter5 != map5.end())
    {
        cout << iter5->first << ": " << iter5->second << endl;
        iter5++;
    }
    //6.移动构造函数
    unordered_map<int, string> map6(std::move(map1));
    cout << "map6.size = " << map6.size() << " map6.empty = " << map6.empty() << " map6.max_size = " << map6.max_size() << endl;
    auto iter6 = map6.begin();
    cout << "map6的值为：" << endl;
    while (iter6 != map6.end())
    {
        cout << iter6->first << ": " << iter6->second << endl;
        iter6++;
    }
    //7.at(key)访问元素, 返回的是key对应的值
    cout << "map6.at(1) = " << map6.at(1) << endl;
    cout << "map6.at(2) = " << map6.at(2) << endl;
    map6.at(1) = "scott";//修改1对应的值
    map6.at(2) = "camle";//修改2对应的值
    //8.[key]访问元素
    cout << "map6[1] = " << map6[1] << endl;
    cout << "map6[2] = " << map6[2] << endl;
    cout << "map6的值为：" << endl;
    string str = map6[88];//若没有这个键，则会插入这个键，值为空
    cout << "str=======" << str << endl;
    for(auto &val: map6)
    {
        cout << val.first << ": " << val.second << endl;
    }
    cout << endl;
 
 
}
 
 
int main()
{
    unordered_mapInit();
 
    cout << "hello world" << endl;
    return 0;
}
 