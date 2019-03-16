package ArraySet;

public class ArraySetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArraySet as = new ArraySet();
	
		System.out.println("* Hi 원소 추가");
		System.out.println("--------------------");
		as.add("Hi");
		as.printAll();
		System.out.println("* Hi 원소 삭제");
		System.out.println("--------------------");
		as.remove("Hi");
		as.printAll();
		System.out.println("* ArraySet이 비었나?");
		System.out.println("--------------------");
		System.out.println(as.isEmpty());
		System.out.println("--------------------");
		
		System.out.println("* 원소추가");
		System.out.println("--------------------");
		as.add("최예슬");
		as.add("최예슬");
		as.add("201501405");
		as.printAll();
		System.out.println("* 원소 개수 출력");
		System.out.println("--------------------");
		System.out.println(as.size());
		System.out.println("--------------------");
		
		System.out.println("* 학번이 Set에 존재하는가?");
		System.out.println("--------------------");
		System.out.println(as.contains("201501405"));
		System.out.println("--------------------");
		
		System.out.println("* 첫 번째 원소 삭제");
		System.out.println("--------------------");
		as.removeFirst();
		as.printAll();
		
	}

}
