
public class Print {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){//行数
			for (int k = 4;k > i;k -- ){					
				System.out.print(" ");//每一行空格数量，第一行4个
			}
			for (int j=0;j<2*i+1;j++) {
				System.out.print("*");//每一行*号数量，第一行1个
			}
				System.out.println();
		}
		for(int i=0;i<5;i++) {//行数
			for(int k=0;k<i;k++) {
				System.out.print(" ");//下部第一行空格为0，第二行为1
			}
			for(int j=10;j>2*i+1;j--) {
				System.out.print("*");//输出9个*号
			}
			System.out.println();
		}
	}
}
