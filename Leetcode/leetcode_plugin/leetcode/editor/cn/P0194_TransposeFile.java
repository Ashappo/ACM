//给定一个文件 file.txt，转置它的内容。 
//
// 你可以假设每行列数相同，并且每个字段由 ' ' 分隔。 
//
// 
//
// 示例： 
//
// 假设 file.txt 文件内容如下： 
//
// 
//name age
//alice 21
//ryan 30
// 
//
// 应当输出： 
//
// 
//name alice ryan
//age 21 30
// 
//
// Related TopicsShell 
//
// 👍 78, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 转置文件
 * @author ambrose
 * @date 2024-09-22 14:13:40
 */
public class P0194_TransposeFile{
	 
//力扣代码
//There is no code of Java type for this problem
//	注意awk中print和printf的区别，print会自动换行
//	awk '{for (i=1; i<=NF; i++) arr[i][NR] = $i} END {for (i=1; i<=NF; i++) {for (j=1; j<=NR; j++) {printf "%s", arr[i][j]; if (j < NR) printf " ";} print ""}}' file.txt
}
