import junit.framework.TestCase;

public class test_circle extends TestCase {

	public final circle round1 = new circle(5);
	public final circle round2 = new circle(6);
	public final circle round3 = new circle(3);
	public final circle round4 = new circle(10);
	
	public void testGetArea() {
		assertEquals(round1.getArea(), Math.PI * 25);
		assertEquals(round2.getArea(), Math.PI * 36);
		assertEquals(round3.getArea(), Math.PI * 9);
		assertEquals(round4.getArea(), Math.PI * 100);
	}
}
