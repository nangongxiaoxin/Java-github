
public class ContinueTest {
	public static void main(String[] args) {
		loop:for(int i=1;i<20;i++) {//此处有无loop效果一致
			if(i%2==0) {
				continue loop;//跳过该次循环,执行下一次循环 loop同样在此处起到标签作用，跳出指定循环一次
			}
			System.out.println(i);
		}
	}
}
