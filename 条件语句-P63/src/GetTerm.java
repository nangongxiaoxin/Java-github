
public class GetTerm {
	public static void main(String[] args) {
		int x=20;
		if(x>30) {
			System.out.println("a的值大于30");
		}else if(x>10){
			System.out.println("a的值大于10，小于30");
		}else if(x>0) {
			System.out.println("a的值大于0，小于10");
		}else {
			System.out.println("a的值小于0");//if语句只执行条件为真的语句
		}
	}
}
