package phoneTester;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.MinQueue;

public class MinQueueTester {

	@Test
	public void test() {
		MinQueue tester=new MinQueue();
		tester.offer(5);
		assertTrue(tester.findMin()==5);
		tester.offer(2);
		assertTrue(tester.findMin()==2);
		tester.offer(4);
		assertTrue(tester.findMin()==2);
		tester.offer(7);
		assertTrue(tester.findMin()==2);
		assertTrue(tester.poll()==5);
		assertTrue(tester.findMin()==2);
		assertTrue(tester.poll()==2);
		assertTrue(tester.findMin()==4);
		tester.offer(4);
		assertTrue(tester.findMin()==4);
		assertTrue(tester.poll()==4);
		tester.offer(5);
		assertTrue(tester.findMin()==4);
	}

}
