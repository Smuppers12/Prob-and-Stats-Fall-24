import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TimeParserTest { //This is for full BRANCH coverage.
	private TimeParser tp = new TimeParser();;
	
	@Test //Test for negative 1 value 
	public void testNegativeValue() { 
		assertEquals(-1, tp.parseTimeToMinutes("-1"));
	}

	@Test //Testing to see if the Hours change with pm.
	public void testChangingHours() {
		assertEquals(825, tp.parseTimeToMinutes("1:45 pm"));
	}
	
	@Test //If hours is over 24 and minutes is over 60.
	public void testOverflowHours() {
		assertEquals(120, tp.parseTimeToMinutes("25:60 am"));
	}
}
