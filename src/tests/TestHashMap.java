package tests;
/**
 * Map测试，为什么报错
 * @author cifengwang
 *
 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		Map<Integer,String> student=new HashMap<Integer, String>();//不能是int，但是可以是Integer
		Map<Integer,int[][]> map2=new HashMap<Integer,int[][]>();
		
		Map<Integer,ArrayList> map3=new HashMap<Integer,ArrayList>();
		int[][] d=new int[2][2];
		d[0][0]=1;d[0][1]=2;d[1][0]=3;d[1][1]=4;
		//map2.put(1, );
		
		ArrayList arr=new ArrayList();
		arr.add(1);arr.add(2);arr.add(3);
		System.out.println(arr.get(0));
		
		ArrayList a=new ArrayList();
		for(int i=0;i<2;i++) {
			
			a.add(d[0][i]);
			
		}
		map3.put(1, a);
		
		ArrayList b=new ArrayList();
		for(int i=0;i<2;i++) {
			
			b.add(d[1][i]);
			
		}
		map3.put(2, b);
		
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("e", "5");
		map.put("f", "6");
		for (Entry<Integer, ArrayList> s : map3.entrySet()) {
		System.out.println("键值对:" + s);
		}
		for (ArrayList s : map3.values()) {
		System.out.println("values:" + s);
		}
		for (Integer s : map3.keySet()) {
		System.out.println("key:" + s);
		System.out.println("values:" + map3.get(s));
		}
		
		for(ArrayList s:map3.values()) {
			System.out.println(s.get(0));
		}
	}
	
		
	
}
