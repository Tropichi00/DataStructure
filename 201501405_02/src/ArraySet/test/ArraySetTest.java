package ArraySet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ArraySet.ArraySet;

class ArraySetTest {

	@Test
	void testSize() {
		ArraySet as = new ArraySet();
		as.add("Hi");
		assertEquals(1,as.size());
		// asserEquals(a,b) : ��ü a�� b�� ���� ������ Ȯ��
		
	}

	@Test
	void testGetFirst() {
		ArraySet as = new ArraySet();
		as.add("Hi");
		assertTrue(as.remove("Hi"));
		// asserTrue(a) : a�� ������ Ȯ��
	}

	@Test
	void testRemove() {
		ArraySet as = new ArraySet();
		as.add("1");
		assertSame("1", as.getFirst());
		// asserSame(a,b) : ��ü a�� b�� ���� ��ü���� Ȯ��
	}

}
