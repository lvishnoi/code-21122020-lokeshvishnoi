package com.vamstar.assesment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

	@Test
	public void testCsvParsing() {
		//"PPIQ.SQU900000","PPI output index - All industries ","2020.06",1183,1184
		
		String line = "\"PPIQ.SQU900000\",\"PPI output index - All industries \",\"2020.06\",1183,1184";
		String values[] = line.replace("\"", "").split(",");
		
		assertNotNull("Not null data", values);
		
		assertEquals("Column is same", values.length, 5);
		
		assertEquals("First Column data is same", values[0], "PPIQ.SQU900000");
		assertEquals("Second Column data is same", values[1].trim(), "PPI output index - All industries");
		
		assertEquals("Last Column data is same", values[4], "1184");
	}
}
