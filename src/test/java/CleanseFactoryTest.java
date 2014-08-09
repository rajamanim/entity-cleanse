import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.entitycleanse.interfaces.CleanseFactory;

public class CleanseFactoryTest {
	@Test
	public void testAddressLine1Cleanse() {
		assertEquals("44 CENTER GROVE ROAD",
				CleanseFactory.cleanAddressLine1("44 center grove Road"));
	}
}
