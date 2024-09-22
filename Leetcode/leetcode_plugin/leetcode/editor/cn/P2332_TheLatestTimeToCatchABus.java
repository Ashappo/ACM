//给你一个下标从 0 开始长度为 n 的整数数组 buses ，其中 buses[i] 表示第 i 辆公交车的出发时间。同时给你一个下标从 0 开始长度为 
//m 的整数数组 passengers ，其中 passengers[j] 表示第 j 位乘客的到达时间。所有公交车出发的时间互不相同，所有乘客到达的时间也互不相同
//。 
//
// 给你一个整数 capacity ，表示每辆公交车 最多 能容纳的乘客数目。 
//
// 每位乘客都会搭乘下一辆有座位的公交车。如果你在 y 时刻到达，公交在 x 时刻出发，满足 y <= x 且公交没有满，那么你可以搭乘这一辆公交。最早 到达
//的乘客优先上车。 
//
// 返回你可以搭乘公交车的最晚到达公交站时间。你 不能 跟别的乘客同时刻到达。 
//
// 注意：数组 buses 和 passengers 不一定是有序的。 
//
// 
//
// 示例 1： 
//
// 输入：buses = [10,20], passengers = [2,17,18,19], capacity = 2
//输出：16
//解释：
//第 1 辆公交车载着第 1 位乘客。
//第 2 辆公交车载着你和第 2 位乘客。
//注意你不能跟其他乘客同一时间到达，所以你必须在第二位乘客之前到达。 
//
// 示例 2： 
//
// 输入：buses = [20,30,10], passengers = [19,13,26,4,25,11,21], capacity = 2
//输出：20
//解释：
//第 1 辆公交车载着第 4 位乘客。
//第 2 辆公交车载着第 6 位和第 2 位乘客。
//第 3 辆公交车载着第 1 位乘客和你。
// 
//
// 
//
// 提示： 
//
// 
// n == buses.length 
// m == passengers.length 
// 1 <= n, m, capacity <= 10⁵ 
// 2 <= buses[i], passengers[i] <= 10⁹ 
// buses 中的元素 互不相同 。 
// passengers 中的元素 互不相同 。 
// 
//
// Related Topics数组 | 双指针 | 二分查找 | 排序 
//
// 👍 68, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 坐上公交的最晚时间
 * @author ambrose
 * @date 2024-09-18 16:50:50
 */
public class P2332_TheLatestTimeToCatchABus{
	public static void main(String[] args) {
		 //测试代码
		 Solution solution = new P2332_TheLatestTimeToCatchABus().new Solution();
	 }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

	class Solution {
		public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
			// 排序公交车和乘客的到达时间
			Arrays.sort(buses);
			Arrays.sort(passengers);

			int n = buses.length; // 公交车数量
			int m = passengers.length; // 乘客数量
			int passengerIndex = 0; // 当前乘客指针
			int lastTime = 0; // 记录你最晚到达的时间

			// 模拟每辆公交车发车情况
			for (int i = 0; i < n; i++) {
				int busTime = buses[i];
				int count = 0; // 当前公交车上车的乘客数量

				// 在这辆公交车发车前，处理所有到达时间不迟于公交车出发时间的乘客
				while (passengerIndex < m && passengers[passengerIndex] <= busTime && count < capacity) {
					lastTime = passengers[passengerIndex]; // 记录最后一位乘客上车的时间
					passengerIndex++; // 移动到下一个乘客
					count++; // 上车人数加一
				}

				// 如果公交车满员，且有乘客是最后一位上车的
				if (count == capacity) {
					if (lastTime == busTime) {
						// 如果最后一位上车的乘客到达时间与公交车发车时间相同，调整你的到达时间
						lastTime--;
					}
				} else {
					// 如果公交车没有满员，可以尝试在这辆车发车之前的时间到达
					lastTime = busTime; // 最晚到达时间更新为公交车出发时间
				}
			}

			// 确保最后的到达时间不能与其他乘客重复
			// 对于最后的时间进行调整
			while (passengerIndex > 0 && lastTime == passengers[passengerIndex - 1]) {
				lastTime--; // 提前到达
				passengerIndex--; // 跳过最后一位乘客
			}

			return lastTime;
		}
	}

//leetcode submit region end(Prohibit modification and deletion)

}
