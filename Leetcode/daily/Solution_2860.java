/*9.4*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_2860 {
    public int countWays(List<Integer> nums) {
        // 复制并排序列表
        List<Integer> sortedNums = new ArrayList<>(nums);
        Collections.sort(sortedNums);

        int n = sortedNums.size();
        int count = 0;

        // 检查不选中任何学生的情况
        if (sortedNums.get(0) > 0) {
            count++;
        }

        // 检查选中所有学生的情况
        if (sortedNums.get(n - 1) < n) {
            count++;
        }

        // 检查在中间选取某个学生的情况
        for (int i = 0; i < n - 1; i++) {
            if (sortedNums.get(i) < i + 1 && sortedNums.get(i + 1) > i + 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution_2860 solution = new Solution_2860();

        // 将 int[] 转换为 List<Integer>
        List<Integer> nums1 = new ArrayList<>();
        Collections.addAll(nums1, 1, 1);
        System.out.println(solution.countWays(nums1)); // 输出: 2

        List<Integer> nums2 = new ArrayList<>();
        Collections.addAll(nums2, 6, 0, 3, 3, 6, 7, 2, 7);
        System.out.println(solution.countWays(nums2)); // 输出: 3
    }
}
