//给定一个文本文件 file.txt，请只打印这个文件中的第十行。 
//
// 示例: 
//
// 假设 file.txt 有如下内容： 
//
// Line 1
//Line 2
//Line 3
//Line 4
//Line 5
//Line 6
//Line 7
//Line 8
//Line 9
//Line 10
// 
//
// 你的脚本应当显示第十行： 
//
// Line 10
// 
//
// 说明: 1. 如果文件少于十行，你应当输出什么？ 2. 至少有三种不同的解法，请尝试尽可能多的方法来解题。 
//
// Related TopicsShell 
//
// 👍 142, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 第十行
 * @author ambrose
 * @date 2024-09-22 13:57:27
 */
public class P195_TenthLine{

//力扣代码
//There is no code of Java type for this problem
//要打印文本文件 file.txt 中的第十行，可以使用多种方法。以下是三种不同的解决方案：

/*	sed -n '10p' file.txt
	awk 'NR==10' file.txt
	head -n 10 file.txt | tail -n 1*/

//
//	方法一：使用 sed
//	使用 sed 命令可以方便地提取特定行：
//
//	sed -n '10p' file.txt
//	说明：
//
//			-n 选项用于禁止默认输出。
//			'10p' 指示打印第十行。
//	如果文件少于十行： 不会有任何输出。
//
//	方法二：使用 awk
//	使用 awk 命令也可以实现这一功能：
//
//	awk 'NR==10' file.txt
//	说明：
//
//	NR 是 awk 的内置变量，表示当前行号。
//	如果文件少于十行： 不会有任何输出。
//
//	方法三：使用 head 和 tail
//	结合 head 和 tail 命令也可以实现：
//
//	head -n 10 file.txt | tail -n 1
//	说明：
//
//	head -n 10 提取前十行。
//	tail -n 1 从这十行中提取最后一行，即第十行。
//	如果文件少于十行： 不会有任何输出。
//
//	额外提示
//	在以上所有方法中，如果文件少于十行，都会默默地不输出任何内容。如果希望在这种情况下输出提示信息，可以用条件判断来实现。比如，使用 wc -l 检查行数：
//
//	bash
//	Copy code
//if [ $(wc -l < file.txt) -lt 10 ]; then
//	echo "文件少于十行"
//			else
//	sed -n '10p' file.txt
//			fi
//	这个脚本会先检查行数，如果少于十行则输出提示信息。

}
