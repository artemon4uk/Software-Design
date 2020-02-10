import junit.framework.TestCase;

public class test_rectangle extends TestCase {
	public final rectangle item1 = new rectangle(5, 4);
	public final rectangle item2 = new rectangle(6, 3);
	public final rectangle item3 = new rectangle(3, 2);
	public final rectangle item4 = new rectangle(10, 13);
	
	public void testGetArea() {
		assertEquals(item1.getArea(), 20.0);
		assertEquals(item2.getArea(), 18.0);
		assertEquals(item3.getArea(), 6.0);
		assertEquals(item4.getArea(), 130.0);
	}
}
