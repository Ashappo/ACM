//表: Customer 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| name        | varchar |
//| referee_id  | int     |
//+-------------+---------+
//在 SQL 中，id 是该表的主键列。
//该表的每一行表示一个客户的 id、姓名以及推荐他们的客户的 id。 
//
// 找出那些 没有被 id = 2 的客户 推荐 的客户的姓名。 
//
// 以 任意顺序 返回结果表。 
//
// 结果格式如下所示。 
//
// 
//
// 示例 1： 
//
// 
//输入： 
//Customer 表:
//+----+------+------------+
//| id | name | referee_id |
//+----+------+------------+
//| 1  | Will | null       |
//| 2  | Jane | null       |
//| 3  | Alex | 2          |
//| 4  | Bill | null       |
//| 5  | Zack | 1          |
//| 6  | Mark | 2          |
//+----+------+------------+
//输出：
//+------+
//| name |
//+------+
//| Will |
//| Jane |
//| Bill |
//| Zack |
//+------+ 
//
// Related Topics数据库 
//
// 👍 277, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 寻找用户推荐人
 * @author ambrose
 * @date 2024-09-29 15:43:10
 */
 
public class P584_FindCustomerReferee{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P584_FindCustomerReferee().new Solution();
	 }
	 
//力扣代码
//There is no code of Java type for this problem
}
