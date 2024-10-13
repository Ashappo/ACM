//给你两个数组，arr1 和 arr2，arr2 中的元素各不相同，arr2 中的每个元素都出现在 arr1 中。 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 示例 2: 
//
// 
//输入：arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//输出：[22,28,8,6,17,44]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
//
// Related Topics数组 | 哈希表 | 计数排序 | 排序 
//
// 👍 298, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

/**
 * 数组的相对排序
 * @author ambrose
 * @date 2024-10-13 19:53:54
 */

public class P1122_RelativeSortArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1122_RelativeSortArray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
		}
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i])){
				int cnt = map.get(arr2[i]);
				while(cnt-- > 0){
					ans.add(arr2[i]);
				}
				map.remove(arr2[i]);
			}
		}
		List<Integer> temp = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int cnt = entry.getValue();
			while(cnt-- > 0){
				temp.add(entry.getKey());
			}
		}
		Collections.sort(temp);
		ans.addAll(temp);
		return ans.stream().mapToInt(i -> i).toArray();
	}
}
//自定义比较器
//class Solution {
//    public int[] relativeSortArray(int[] arr1, int[] arr2) {
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < arr2.length; i++) {
//			map.put(arr2[i], i);
//		}
//		// 将 int[] 转换为 Integer[]，这样可以使用 Comparator
//		Integer[] arr1Integer = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
//		Arrays.sort(arr1Integer, (a, b) ->{
//			if(map.containsKey(a)){
//				return map.containsKey(b) ? map.get(a) - map.get(b) : -1;
//			}
//			else {
//				return map.containsKey(b) ? 1 : a - b;
//			}
//		});
//
//		// 将 Integer[] 转回 int[]
//		return Arrays.stream(arr1Integer).mapToInt(Integer::intValue).toArray();
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}