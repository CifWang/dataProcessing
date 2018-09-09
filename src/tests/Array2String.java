package tests;
/**
 * 整型数组变成字符串
 * @author xcc
 *
 */
public class Array2String {
	public static void main(String[] args){
		int[] Int={1,2,3,4,5,6};
		String s="";
		for(int i=0;i<Int.length;i++){
			s+=String.valueOf(Int[i]);
		}
		System.out.println(s);
	}

}
