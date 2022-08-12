> 
>
> 链接：https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
>
> 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
>
>  
>
> 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。
>
> 
>
>  
>
> 示例 1：
>
> 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
> 输出：true
> 示例 2：
>
> 输入：board = [["a","b"],["c","d"]], word = "abcd"
> 输出：false
>
>
> 提示：
>
> m == board.length
> n = board[i].length
> 1 <= m, n <= 6
> 1 <= word.length <= 15
> board 和 word 仅由大小写英文字母组成
>

```cpp
class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        m = board.size(), n = board.at(0).size();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(board, word, i, j, 0))   return true;
            }
        }
        return false;
    }
private:
    int  m, n;
    bool dfs(vector<vector<char>>& board, string word, int i, int j, int k){
        if(i >= m || i < 0 || j >= n || j < 0 || board[i][j] != word[k])  return false;//越界或不等返回
        if(k == word.size() - 1) return true;//pac 结束条件
        board[i][j] = '0';
        bool ans = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) || 
                    dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);//pac k + 1
        board[i][j] = word[k];
        return ans;
    } 
};
//通过
//492 ms	6.1 MB	
```

```cpp
class Solution {
public:
bool exist(vector<vector<char>>& board, string& word) {   
	 	vector<vector<bool>> b(board.size(), vector<bool>(board[0].size(), true));
	 	vector<vector<int>> xy({ {1,0},{0,-1},{-1,0},{0,1} });
	 	int index(1);
	 	for (int i(0); i < board.size(); i++)
	 		for (int j(0); j < board[0].size(); j++)
	 			if (board[i][j] == word[0] && BSF_back(board, word, xy, i, j, index, b))
	 				return true;
	 	return false;
	 }
	 bool BSF_back(vector<vector<char>>& board, string& word, vector<vector<int>>& xy, int i, int j, int index, vector<vector<bool>>& b) {
	 	if (index >= word.size()) return true;
	 	b[i][j] = false;
	 	bool ans(false);  //  加了个布尔变量
	 	for (int z(0); z < 4; z++) {
	 		int x = i + xy[z][0], y = j + xy[z][1];
	 		if (x >= 0 && x < board.size() && y >= 0 && y < board[0].size() && b[x][y] && board[x][y] == word[index] &&
	         BSF_back(board, word, xy, x, y, index + 1, b)) {
	 			ans = true; // 变量用于储存结果，可以不马上return
				break;
	 		}
	 	}
	 	b[i][j] = true;  // 在恢复 b 的开始状态后，再return，这样就能达到回溯效果，b也可以传入引用，大大降低复杂度
	 	return ans;
	}
};
//执行用时：336 ms, 在所有 C++ 提交中击败了21.47%的用户
//内存消耗：6.3 MB, 在所有 C++ 提交中击败了77.30%的用户
```

```cpp
#官方答案：效率极其垃圾
class Solution {
public:
    bool check(vector<vector<char>>& board, vector<vector<int>>& visited, int i, int j, string& s, int k) {
        if (board[i][j] != s[k]) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        vector<pair<int, int>> directions{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        bool result = false;
        for (const auto& dir: directions) {
            int newi = i + dir.first, newj = j + dir.second;
            if (newi >= 0 && newi < board.size() && newj >= 0 && newj < board[0].size()) {
                if (!visited[newi][newj]) {
                    bool flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }

    bool exist(vector<vector<char>>& board, string word) {
        int h = board.size(), w = board[0].size();
        vector<vector<int>> visited(h, vector<int>(w));
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                bool flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
};
//1468 ms	231.3 MB
```

