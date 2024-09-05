import java.util.Stack;

public class Solution_3174 {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        // 遍历字符串
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // 遇到数字，弹出最近的非数字字符
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 非数字字符压入栈
                stack.push(c);
            }
        }

        // 将栈中剩余字符拼接成结果
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()); // 从栈中弹出元素并放入结果中
//            result.insert(0,stack.pop()); // 从栈中弹出元素并放入结果中
        }

        return result.reverse().toString();
//        return result.toString();
    }

    public static void main(String[] args) {
        Solution_3174 solution = new Solution_3174();
        System.out.println(solution.clearDigits("abc")); // 输出: "abc"
        System.out.println(solution.clearDigits("cb34")); // 输出: ""
    }
}
