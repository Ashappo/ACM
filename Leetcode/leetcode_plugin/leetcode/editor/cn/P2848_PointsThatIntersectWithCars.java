//给你一个下标从 0 开始的二维整数数组 nums 表示汽车停放在数轴上的坐标。对于任意下标 i，nums[i] = [starti, endi] ，其中 
//starti 是第 i 辆车的起点，endi 是第 i 辆车的终点。 
//
// 返回数轴上被车 任意部分 覆盖的整数点的数目。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [[3,6],[1,5],[4,7]]
//输出：7
//解释：从 1 到 7 的所有点都至少与一辆车相交，因此答案为 7 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [[1,3],[5,8]]
//输出：7
//解释：1、2、3、5、6、7、8 共计 7 个点满足至少与一辆车相交，因此答案为 7 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// nums[i].length == 2 
// 1 <= starti <= endi <= 100 
// 
//
// Related Topics数组 | 哈希表 | 前缀和 
//
// 👍 31, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;
import java.util.List;

/**
 * 与车相交的点
 * @author ambrose
 * @date 2024-09-15 13:31:41
 */
public class P2848_PointsThatIntersectWithCars{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2848_PointsThatIntersectWithCars().new Solution();
		  List<List<Integer>> temp1 = Arrays.asList(
				  Arrays.asList(3,6),
				  Arrays.asList(1,5),
				  Arrays.asList(4,7)
		  );
		  List<List<Integer>> temp2 = Arrays.asList(
				  Arrays.asList(1,3),
				  Arrays.asList(5,8)
		  );
		  System.out.println(solution.numberOfPoints(temp1));
		  System.out.println(solution.numberOfPoints(temp2));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
		int[][] intervals = new int[nums.size()][2];
		for(int i = 0; i < nums.size(); i++){
			intervals[i][0] = nums.get(i).get(0);
			intervals[i][1] = nums.get(i).get(1);
		}
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		int currentBegin = intervals[0][0], currentEnd = intervals[0][1], point = 0;
		for(int i = 1; i < intervals.length; i++){
			int begin = intervals[i][0], end = intervals[i][1];
			if(begin > currentEnd){
				point += currentEnd - currentBegin + 1;
				currentEnd = end; currentBegin = begin;
			}
			else{
//				currentEnd = end;//错误，不一定排序后a[1][1]大于a[0][1],应为最大
				currentEnd = Math.max(currentEnd, end);
			}
		}
		point += currentEnd - currentBegin + 1;
		return  point;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
