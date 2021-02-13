
public class Blak {// 创建类
	public static void main(String[] args) {// 主方法
		String str = "  Java class  ";
		System.out.println("原字符串为：" + str);// 去掉前的结果
		System.out.println("原字符串长度：" + str.length());// 去掉前的长度
		// 将str中头部和尾部的空格去掉
		System.out.println("现字符串长度：" + str.trim().length());// 去掉后的长度
		// String str1 =str.trim();
		System.out.println(str.trim());// 去掉后的结果
	}
}
