package tests;
/**
 * �����ַ���ת��������
 * @author xcc
 *
 */
public class String2Integer {
	public static void main(String[] args){
		String s="123456";
		//ת���ַ�����
		char[] c=s.toCharArray();
		int[] Int=new int[c.length]; 
		for(int i=0;i<c.length;i++){
			String s1=c[i]+"";
			Int[i]=Integer.parseInt(s1);
			System.out.print(Int[i]+" ");
		}
	}

}
