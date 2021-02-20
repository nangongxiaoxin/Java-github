
public class Blak {
	public static void main(String[] args) {
		String str = "  Java class  ";
		System.out.println("去掉空格前为：" + str);
		System.out.println("字符串原长度为：" + str.length());
		// 将str去掉前部和尾部的空格后输出
		str = str.trim();
		// System.out.println("去掉空格后的长度：" + str.trim().length());
		System.out.println("去掉空格后为：" + str);
		System.out.println("去掉空格后的长度：" + str.length());
	}
}
