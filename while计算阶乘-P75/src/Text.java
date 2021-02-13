
public class Text {
	public static void main(String[] args) {
		String str = "We are students";
		// 将空字符串在str中的索引位置赋值给变量size
		int size = str.lastIndexOf("e");// 返回指定字符串最后一次出现的位置
		int size1 = str.indexOf("a");// 返回指定字符串位置
		// 输出字符串str
		System.out.println("字符串为：" + str);
		// 将变量size输出
		System.out.println("空字符串在字符串str中的索引位置是：" + size);
		// 将字符串str的长度输出
		System.out.println("字符串str的长度是：" + str.length());
		// 将变量size1输出
		System.out.println("字符a的位置是：" + size1);
	}
}
