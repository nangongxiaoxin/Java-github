
public class Circulate {
	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=100;i+=2) {//i每次自增2
			sum=sum+i;//break可以跳出当前循环
		}
		System.out.println("2到100之间所有偶数的和为："+sum);//输出sum的值
	}
}
