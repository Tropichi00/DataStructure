package ArraySet;

public class ArraySetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArraySet as = new ArraySet();
	
		System.out.println("* Hi ���� �߰�");
		System.out.println("--------------------");
		as.add("Hi");
		as.printAll();
		System.out.println("* Hi ���� ����");
		System.out.println("--------------------");
		as.remove("Hi");
		as.printAll();
		System.out.println("* ArraySet�� �����?");
		System.out.println("--------------------");
		System.out.println(as.isEmpty());
		System.out.println("--------------------");
		
		System.out.println("* �����߰�");
		System.out.println("--------------------");
		as.add("�ֿ���");
		as.add("�ֿ���");
		as.add("201501405");
		as.printAll();
		System.out.println("* ���� ���� ���");
		System.out.println("--------------------");
		System.out.println(as.size());
		System.out.println("--------------------");
		
		System.out.println("* �й��� Set�� �����ϴ°�?");
		System.out.println("--------------------");
		System.out.println(as.contains("201501405"));
		System.out.println("--------------------");
		
		System.out.println("* ù ��° ���� ����");
		System.out.println("--------------------");
		as.removeFirst();
		as.printAll();
		
	}

}
