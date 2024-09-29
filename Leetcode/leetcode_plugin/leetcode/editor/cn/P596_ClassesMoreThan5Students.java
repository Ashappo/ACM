//表: Courses 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| student     | varchar |
//| class       | varchar |
//+-------------+---------+
//(student, class)是该表的主键（不同值的列的组合）。
//该表的每一行表示学生的名字和他们注册的班级。
// 
//
// 
//
// 查询 至少有 5 个学生 的所有班级。 
//
// 以 任意顺序 返回结果表。 
//
// 结果格式如下所示。 
//
// 
//
// 示例 1: 
//
// 
//输入: 
//Courses table:
//+---------+----------+
//| student | class    |
//+---------+----------+
//| A       | Math     |
//| B       | English  |
//| C       | Math     |
//| D       | Biology  |
//| E       | Math     |
//| F       | Computer |
//| G       | Math     |
//| H       | Math     |
//| I       | Math     |
//+---------+----------+
//输出: 
//+---------+ 
//| class   | 
//+---------+ 
//| Math    | 
//+---------+
//解释: 
//-数学课有 6 个学生，所以我们包括它。
//-英语课有 1 名学生，所以我们不包括它。
//-生物课有 1 名学生，所以我们不包括它。
//-计算机课有 1 个学生，所以我们不包括它。 
//
// Related Topics数据库 
//
// 👍 339, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 超过 5 名学生的课
 * @author ambrose
 * @date 2024-09-29 15:45:08
 */
 
public class P596_ClassesMoreThan5Students{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P596_ClassesMoreThan5Students().new Solution();
	 }
	 
//力扣代码
//There is no code of Java type for this problem
}
