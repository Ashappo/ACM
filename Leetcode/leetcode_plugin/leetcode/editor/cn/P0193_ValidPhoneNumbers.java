//给定一个包含电话号码列表（一行一个电话号码）的文本文件 file.txt，写一个单行 bash 脚本输出所有有效的电话号码。 
//
// 你可以假设一个有效的电话号码必须满足以下两种格式： (xxx) xxx-xxxx 或 xxx-xxx-xxxx。（x 表示一个数字） 
//
// 你也可以假设每行前后没有多余的空格字符。 
//
// 
//
// 示例： 
//
// 假设 file.txt 内容如下： 
//
// 
//987-123-4567
//123 456 7890
//(123) 456-7890
// 
//
// 你的脚本应当输出下列有效的电话号码： 
//
// 
//987-123-4567
//(123) 456-7890
// 
//
// Related TopicsShell 
//
// 👍 166, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 有效电话号码
 * @author ambrose
 * @date 2024-09-22 13:46:54
 */
public class P0193_ValidPhoneNumbers{

//力扣代码
//There is no code of Java type for this problem
//# Read from the file file.txt and output all valid phone numbers to stdout.
//	grep -E '^(\([0-9]{3}\) [0-9]{3}-[0-9]{4}|[0-9]{3}-[0-9]{3}-[0-9]{4})$' file.txt
//	or
//	grep -E '^(\([0-9]{3}\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$' file.txt
}
