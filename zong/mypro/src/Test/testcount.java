package Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class testcount {
	@Test
	public  void testAdd(){
		count t = new count();
		int z=t.add(3, 4);
		assertEquals(z,12);
		
	}

}
