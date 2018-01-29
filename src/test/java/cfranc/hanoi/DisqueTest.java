package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	//Cas Vrais
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(grand));
		assertEquals(-1, moyen.compareTo(petit));
		
		
	}
//Cas Faux
		public void testEmpilerFaux() {
			
			Tour T = new Tour();
			
			Disque petit = new Disque(2);
			Disque moyen = new Disque(3);
			Disque grand = new Disque(4);
			assertTrue("peut pas empiler",T.empiler(petit));
			assertTrue("peut empiler",T.empiler(grand) );
			
			
			
		}
	//Cas Test Hauteur
	public void testEmpilerHauteur() {
				
				Tour T = new Tour();
				
				Disque petit = new Disque(2);
				Disque moyen = new Disque(3);
				Disque grand = new Disque(4);
				assertTrue("peut pas empiler",T.empiler(grand));
				assertTrue("peut empiler",T.empiler(moyen) );
				assertTrue("peut empiler",T.empiler(petit) );
				
				
			}
	//Cas Test Hauteur Fausse
	public void testEmpilerHauteurFaux() {
				
				Tour T = new Tour();
				Disque pe = new Disque(1);
				Disque petit = new Disque(2);
				Disque moyen = new Disque(3);
				Disque grand = new Disque(4);
				assertTrue("peut pas empiler",T.empiler(grand));
				assertTrue("peut empiler",T.empiler(moyen) );
				assertTrue("peut empiler",T.empiler(petit) );
				assertTrue("peut empiler",T.empiler(pe) );
				
			}
}
