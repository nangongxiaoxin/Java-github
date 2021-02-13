//计算1+1/2!+1/3!+...+1/20!的和
public class Jiecheng {
	public static void main(String[] args) {
		double sum = 0;
		double i = 0;
		double pro = 1;
		while (i <= 20) {
			i++;
			pro = pro * i;
			sum = sum + 1 / pro;
		}
		System.out.println(pro);
		System.out.printf("%.8f", sum);// 使用printf加入参数控制小数位数
	}
}
