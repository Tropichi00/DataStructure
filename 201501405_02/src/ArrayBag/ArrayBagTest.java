package ArrayBag;

import java.util.*;
public class ArrayBagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayBag ab = new ArrayBag();
	
		
		System.out.println("* Hi ���� �߰�");
		System.out.println("--------------------");
		ab.add("Hi");
		ab.printAll();
		System.out.println("* Hi ���� ����");
		System.out.println("--------------------");
		ab.remove("Hi");
		ab.printAll();
		System.out.println("* ArrayBag�� �����?");
		System.out.println("--------------------");
		System.out.println(ab.isEmpty());
		System.out.println("--------------------");
		
		System.out.println("* �����߰�");
		System.out.println("--------------------");
		ab.add("�ֿ���");
		ab.add("�ֿ���");
		ab.add("201501405");
		ab.printAll();
		System.out.println("* ���� ���� ���");
		System.out.println("--------------------");
		System.out.println(ab.size());
		System.out.println("--------------------");
		
		System.out.println("* �й��� Bag�� �����ϴ°�?");
		System.out.println("--------------------");
		System.out.println(ab.contains("201501405"));
		System.out.println("--------------------");
		
		System.out.println("* ù ��° ���� ����");
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
		
		