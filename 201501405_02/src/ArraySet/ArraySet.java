package ArraySet;

public class ArraySet implements Set {

	private static final int MAX_SIZE = 100;	// set에 최대로 저장 가능한 원소 개수 제한
	private int maxSize;
	private Object[] objects; 	// set 원소를 저장할 배열 (object형의 배열 objects)
	private int size = 0;	// set에 저장된 원소들의 개수
	
	public ArraySet() {
		this.maxSize = MAX_SIZE;
		this.objects = new Object[maxSize];
		this.size = 0;
	}


	public boolean add(Object object) {
		//set에 object원소를 추가
		for(int k = 0; k < size; k++) {
			if((objects[k] == object) || (size == maxSize)) {	//입력한 값이 objects 안에 있으면 true
				return false;
			}
		}
		objects[size++] = object;
		return true;
	}
	
	public boolean contains(Object object) {
		//set이 object원소를 가지고 있으면 true 반환, 없으면 false 반환
		for(int k = 0; k < size; k++) {
			if(objects[k] == object) {	//입력한 값이 objects 안에 있으면 true
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		// set의 원소 개수를 반환
		return this.size;
	}
	
	public boolean isEmpty() {	// 스트링이 비었는 지 확인하는 isEmpty() 쓸 때 public boolean isEmpty()로 씀
		// set이 비어있으면 true 반환, 그렇지 않으면 false 반환
		if(size == 0)	// size는 배열에 저장된 원소 개수
			return true;
		return false;
	}
	
	public Object getFirst() {
		// set에 가장 첫 번째 원소를 반환
		return objects[0];
	}
	
	public boolean remove(Object object) {
		// set에 존재하는 object 원소를 삭제. 정상적으로 삭제될 시 true 반환, 그렇지 않으면 false 반환
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
		// set에 존재하는 첫 번째 원소 삭제. 정상적으로 삭제될 시 삭제된 원소 반환, 그렇지 않으면 null 반환
	
		
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
		// 배열에 있는 값을 다 출력해야 함
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(objects[i] + "  ");
		}

		
		System.out.println("");
		System.out.println("--------------------");
		
	
	}
	
}
