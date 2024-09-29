//表: Orders 
//
// 
//+-----------------+----------+
//| Column Name     | Type     |
//+-----------------+----------+
//| order_number    | int      |
//| customer_number | int      |
//+-----------------+----------+
//在 SQL 中，Order_number是该表的主键。
//此表包含关于订单ID和客户ID的信息。
// 
//
// 
//
// 查找下了 最多订单 的客户的 customer_number 。 
//
// 测试用例生成后， 恰好有一个客户 比任何其他客户下了更多的订单。 
//
// 查询结果格式如下所示。 
//
// 
//
// 示例 1: 
//
// 
//输入: 
//Orders 表:
//+--------------+-----------------+
//| order_number | customer_number |
//+--------------+-----------------+
//| 1            | 1               |
//| 2            | 2               |
//| 3            | 3               |
//| 4            | 3               |
//+--------------+-----------------+
//输出: 
//+-----------------+
//| customer_number |
//+-----------------+
//| 3               |
//+-----------------+
//解释: 
//customer_number 为 '3' 的顾客有两个订单，比顾客 '1' 或者 '2' 都要多，因为他们只有一个订单。
//所以结果是该顾客的 customer_number ，也就是 3 。
// 
//
// 
//
// 进阶： 如果有多位顾客订单数并列最多，你能找到他们所有的 customer_number 吗？ 
//
// Related Topics数据库 
//
// 👍 173, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 订单最多的客户
 * @author ambrose
 * @date 2024-09-29 15:43:13
 */
 
public class P586_CustomerPlacingTheLargestNumberOfOrders{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P586_CustomerPlacingTheLargestNumberOfOrders().new Solution();
	 }
	 
//力扣代码
//There is no code of Java type for this problem
}
