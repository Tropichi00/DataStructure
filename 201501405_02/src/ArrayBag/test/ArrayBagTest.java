package ArrayBag.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ArrayBag.ArrayBag;

class ArrayBagTest {

	@Test
	void testSize() {
		ArrayBag ab = new ArrayBag();
		ab.add("Hi");
		assertEquals(1,ab.size());
		// asserEquals(a,b) : ��ü a�� b�� ���� ������ Ȯ��
	}

	@Test
	void testGetFirst() {
		ArrayBag ab = new ArrayBag();
		ab.add("Hi");
		assertTrue(ab.remove("Hi"));
		// asserTrue(a) : a�� ������ Ȯ��
	}

	@Test
	void testRemove() {
		ArrayBag ab = new ArrayBag();
		ab.add("1");
		assertSame("1", ab.getFirst());
		// asserSame(a,b) : ��ü a�� b�� ���� ��ü���� Ȯ��
	}
}
