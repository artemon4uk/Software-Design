import junit.framework.TestCase;

public class test_square extends TestCase {
	public final square item1 = new square(5);
	public final square item2 = new square(6);
	public final square item3 = new square(3);
	public final square item4 = new square(10);
	
	public void testGetArea() {
		assertEquals(item1.getArea(), 25.0);
		assertEquals(item2.getArea(), 36.0);
		assertEquals(item3.getArea(), 9.0);
		assertEquals(item4.getArea(), 100.0);
	}
}
