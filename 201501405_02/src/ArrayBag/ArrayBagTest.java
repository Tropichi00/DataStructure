package ArrayBag;

import java.util.*;
public class ArrayBagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayBag ab = new ArrayBag();
	
		
		System.out.println("* Hi 원소 추가");
		System.out.println("--------------------");
		ab.add("Hi");
		ab.printAll();
		System.out.println("* Hi 원소 삭제");
		System.out.println("--------------------");
		ab.remove("Hi");
		ab.printAll();
		System.out.println("* ArrayBag이 비었나?");
		System.out.println("--------------------");
		System.out.println(ab.isEmpty());
		System.out.println("--------------------");
		
		System.out.println("* 원소추가");
		System.out.println("--------------------");
		ab.add("최예슬");
		ab.add("최예슬");
		ab.add("201501405");
		ab.printAll();
		System.out.println("* 원소 개수 출력");
		System.out.println("--------------------");
		System.out.println(ab.size());
		System.out.println("--------------------");
		
		System.out.println("* 학번이 Bag에 존재하는가?");
		System.out.println("--------------------");
		System.out.println(ab.contains("201501405"));
		System.out.println("--------------------");
		
		System.out.println("* 첫 번째 원소 삭제");
		System.out.println("--------------------");
		ab.removeFirst();
		ab.printAll();
		
	}

}
	
		//System.out.println();
		//if(ab.removeFirst()==null)
		//	System.out.println("Error");
	//	else
		//	ab.printAll();
		
		