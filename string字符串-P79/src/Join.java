
public class Join {
	public static void main(String[] args) {
		char a[]= {'h','e','l','l','o'};
		String s1=new String(a);
		//String s=new String(a,2,4);//意为提取字符数组a，从2开始，一共提取4位，并将其赋给字符串变量s
		String s2=new String("word!");//字符串s1和字符串s2的赋值效果一致
		
		String s3=s1+" "+s2;//对字符串进行拼接
		System.out.println(s3);//输出字符串s3
	}
}
