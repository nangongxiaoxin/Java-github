
public class BreakOutsideNested {
	public static void main(String[] args) {
		Loop:for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				if(j==4) {
					break Loop;//跳出上面带标签的整个循环体
				}
				System.out.println("i="+i+" j="+j);
			}
		}
	}
}
