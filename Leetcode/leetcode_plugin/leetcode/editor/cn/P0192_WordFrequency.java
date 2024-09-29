//写一个 bash 脚本以统计一个文本文件 words.txt 中每个单词出现的频率。 
//
// 为了简单起见，你可以假设： 
//
// 
// words.txt只包括小写字母和 ' ' 。 
// 每个单词只由小写字母组成。 
// 单词间由一个或多个空格字符分隔。 
// 
//
// 示例: 
//
// 假设 words.txt 内容如下： 
//
// 
//the day is sunny the the
//the sunny is is
// 
//
// 你的脚本应当输出（以词频降序排列）： 
//
// 
//the 4
//is 3
//sunny 2
//day 1
// 
//
// 说明: 
//
// 
// 不要担心词频相同的单词的排序问题，每个单词出现的频率都是唯一的。 
// 你可以使用一行 Unix pipes 实现吗？ 
// 
//
// Related TopicsShell 
//
// 👍 231, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 统计词频
 * @author ambrose
 * @date 2024-09-22 14:10:31
 */
public class P0192_WordFrequency{

//力扣代码
//There is no code of Java type for this problem
/*
	tr ' ' '\n' < words.txt | grep -v '^$' | sort | uniq -c | sort -nr | awk '{print $2, $1}'
	说明：
	tr ' ' '\n' < words.txt: 将文件中的空格转换为换行符，将每个单词放在单独的一行。
	grep -v '^$': 过滤掉空行（如果有的话）。
	sort: 对单词进行排序，以便后续使用 uniq 统计。
	uniq -c: 统计每个单词的出现次数，输出格式为“次数 单词”。
	sort -nr: 按次数进行降序排序。
	awk '{print $2, $1}': 调整输出格式，输出为“单词 次数”。
*/


}
