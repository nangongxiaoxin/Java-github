
public class Zifuchuan {
	public static void main(String[] args) {
		String str="明日科技";
		switch(str) {
		case"明日":
			System.out.println("明日图书网 www.mingribook.com");
			break;
		case"明日科技":
			System.out.println("吉林省明日科技有限公司");
			break;
		default:
			System.out.println("以上条件都不是。");//jdk7及其以后，switch中的表达式可以是 整形、字符型、字符串型(新加)
		}
	}
}
