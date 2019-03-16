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
		// asserEquals(a,b) : 객체 a와 b의 값이 같은지 확인
		
	}

	@Test
	void testGetFirst() {
		ArraySet as = new ArraySet();
		as.add("Hi");
		assertTrue(as.remove("Hi"));
		// asserTrue(a) : a가 참인지 확인
	}

	@Test
	void testRemove() {
		ArraySet as = new ArraySet();
		as.add("1");
		assertSame("1", as.getFirst());
		// asserSame(a,b) : 객체 a와 b가 같은 객체임을 확인
	}

}
