package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void testEmpiler() {
		
		Tour T = new Tour();
		
		Disque pe = new Disque(1);
		Disque petit = new Disque(2);
		Disque moyen = new Disque(3);
		Disque grand = new Disque(4);
		assertTrue("peut pas empiler",T.empiler(petit));
		assertTrue("peut empiler",T.empiler(grand) );
		assertTrue("peut  empiler",T.empiler(moyen) );
		assertTrue("peut empiler",T.empiler(petit));
		
		
	}
}
