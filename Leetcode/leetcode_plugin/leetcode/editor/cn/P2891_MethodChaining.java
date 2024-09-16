////
////DataFrame animals
////+-------------+--------+
////| Column Name | Type   |
////+-------------+--------+
////| name        | object |
////| species     | object |
////| age         | int    |
////| weight      | int    |
////+-------------+--------+
////
////
//// 编写一个解决方案来列出体重 严格超过 100 千克的动物的名称。
////
//// 按体重 降序 返回动物。
////
//// 返回结果格式如下示例所示。
////
////
////
//// 示例 1:
////
////
////输入：
////DataFrame animals:
////+----------+---------+-----+--------+
////| name     | species | age | weight |
////+----------+---------+-----+--------+
////| Tatiana  | Snake   | 98  | 464    |
////| Khaled   | Giraffe | 50  | 41     |
////| Alex     | Leopard | 6   | 328    |
////| Jonathan | Monkey  | 45  | 463    |
////| Stefan   | Bear    | 100 | 50     |
////| Tommy    | Panda   | 26  | 349    |
////+----------+---------+-----+--------+
////输出：
////+----------+
////| name     |
////+----------+
////| Tatiana  |
////| Jonathan |
////| Tommy    |
////| Alex     |
////+----------+
////解释：
////所有体重超过 100 的动物都应包含在结果表中。
////Tatiana 的体重为 464，Jonathan 的体重为 463，Tommy 的体重为 349，Alex 的体重为 328。
////结果应按体重降序排序。
////
////
////
//// 在 Pandas 中，方法链 允许我们在 DataFrame 上执行操作，而无需将每个操作拆分成单独的行或创建多个临时变量。
////
//// 你能用 一行 代码的方法链完成这个任务吗？
////
//// 👍 1, 👎 0bug 反馈 | 使用指南 | 更多配套插件
////
////
////
////
//
//
//package leetcode.editor.cn;
//
///**
// * 方法链
// * @author ambrose
// * @date 2024-09-16 21:28:58
// */
//public class P2891_MethodChaining{
//	 public static void main(String[] args) {
//	 	 //测试代码
//	 	 Solution solution = new P2891_MethodChaining().new Solution();
//	 }
//
////力扣代码
////There is no code of Java type for this problem
//}
