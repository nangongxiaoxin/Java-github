
public class GetSum {
	public static void main(String[] args) {
		int x=1;
		int sum=0;
		while(x<=10) {//先判断再执行
			sum=sum+x;
			x++;//从1加到10
		}
		System.out.println(sum);
		int y=10,z=0;
		do {
			
			System.out.println("ok"+z++);
			y--;
		}while(y==9);//先执行一次，如果满足while就继续执行，不满足才退出
		System.out.println(y);
	}
}
