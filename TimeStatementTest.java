import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TimeStatementTest { //This is for full STATEMENT coverage.

private TimeParser tp = new TimeParser();;
	
	@Test //Test for negative 1 value 
	public void testNegativeValue() { 
		assertEquals(-1, tp.parseTimeToMinutes("-1"));
	}
	
	@Test //If hours is over 24 and minutes is over 60.
	public void testOverflowHours() {
		assertEquals(840, tp.parseTimeToMinutes("25:60 pm"));
	}

}
