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
		// asserEquals(a,b) : 객체 a와 b의 값이 같은지 확인
	}

	@Test
	void testGetFirst() {
		ArrayBag ab = new ArrayBag();
		ab.add("Hi");
		assertTrue(ab.remove("Hi"));
		// asserTrue(a) : a가 참인지 확인
	}

	@Test
	void testRemove() {
		ArrayBag ab = new ArrayBag();
		ab.add("1");
		assertSame("1", ab.getFirst());
		// asserSame(a,b) : 객체 a와 b가 같은 객체임을 확인
	}
}
