
public class StartOrEnd {// 创建类
	public static void main(String[] args) {// 主方法
		String num1 = "22045612";
		String num2 = "21304578";
		boolean b = num1.startsWith("22");
		boolean b2 = num1.startsWith("78");
		boolean b3 = num2.startsWith("22");
		boolean b4 = num2.startsWith("78");
		System.out.println("字符串 num1 是以'22'开始的吗？" + b);
		System.out.println("字符串 num1 是以'78'开始的吗？" + b2);
		System.out.println("字符串 num2 是以'22'开始的吗？" + b3);
		System.out.println("字符串 num2 是以'78'开始的吗？" + b4);
	}
}
