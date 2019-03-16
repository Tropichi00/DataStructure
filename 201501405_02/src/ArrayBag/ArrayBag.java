package ArrayBag;

public class ArrayBag implements Bag {

	private static final int MAX_SIZE = 100;	// bag�� �ִ�� ���� ������ ���� ���� ����
	private int maxSize;
	private Object[] objects; 	// bag ���Ҹ� ������ �迭 (object���� �迭 objects)
	private int size = 0;	// bag�� ����� ���ҵ��� ����
	
	public ArrayBag() {
		this.maxSize = MAX_SIZE;
		this.objects = new Object[maxSize];
		this.size = 0;
	}


	public boolean add(Object object) {
		//bag�� object���Ҹ� �߰�
		if (size == maxSize) {	// bag�� ����� ���� �� == bag�� �ִ�� ���� ������ ���� ����
			return false;
		}
		objects[size++] = object;
		return true;
	}
	
	public boolean contains(Object object) {
		//bag�� object���Ҹ� ������ ������ true ��ȯ, ������ false ��ȯ
		for(int k = 0; k < size; k++) {
			if(objects[k] == object) {	//�Է��� ���� objects �ȿ� ������ true
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		// bag�� ���� ������ ��ȯ
		return this.size;
	}
	
	public boolean isEmpty() {	// ��Ʈ���� ����� �� Ȯ���ϴ� isEmpty() �� �� public boolean isEmpty()�� ��
		// bag�� ��������� true ��ȯ, �׷��� ������ false ��ȯ
		if(size == 0)	// size�� �迭�� ����� ���� ����
			return true;
		return false;
	}
	
	public Object getFirst() {
		// bag�� ���� ù ��° ���Ҹ� ��ȯ
		return objects[0];
	}
	
	public boolean remove(Object object) {
		// bag�� �����ϴ� object ���Ҹ� ����. ���������� ������ �� true ��ȯ, �׷��� ������ false ��ȯ
		if(isEmpty())	
		{	
			return false;	
		}
		
		for(int k = 0; k < size; k++) {
			if(objects[k] == object)
			{
				
				System.arraycopy(objects, k+1, objects, k, size-k-1);	
				objects[size-1] = null;
				size--;
				break;
			}
		}
		
		return true;
		}
	
	
	public Object removeFirst() {
		// bag�� �����ϴ� ù ��° ���� ����. ���������� ������ �� ������ ���� ��ȯ, �׷��� ������ null ��ȯ
	
		
		Object j = objects[0];
		int a = size;
		
		for(int i = 0; i < size; i++) {
			objects[i] = objects[i+1];
			if(i==size-1) {
				objects[size-1] = null;
				size--;
			}
		}	
		
		if(a == size)
			return null;
		else
		
			return j;
	}
	
	public void printAll() {
		// �迭�� �ִ� ���� �� ����ؾ� ��
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(objects[i] + "  ");
		}

		
		System.out.println("");
		System.out.println("--------------------");
		
	
	}
	
	// bag�� �����ϴ� ��� �Լ��� arraybag�� �� ������ �ؾ���
	
}
