package hw.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hw.strings.SymbolsRemove;
import hw.strings.SymbolsRemoveStandard;

class SymbolsRemoveStandardTest {

	@Test
	void RemoveStandardTest() {
		SymbolsRemove symbolsRemove = new SymbolsRemoveStandard();
		String str1 = "1234567";
		String str2 = "Hello World";
		String str3 = "Hello-World";
	    String expected1 = "134567";
	    String expected2 = "Hell Wrld";
	    String expected3 = "Hello World";
	    String actual1 = symbolsRemove.removeSymbol(str1, '2');
	    String actual2 = symbolsRemove.removeSymbol(str2, 'o');
	    String actual3 = symbolsRemove.removeSymbol(str3, '-');

	  
	    assertEquals(expected1, actual1);
	    assertEquals(expected2, actual2);
	    assertEquals(expected3, actual3);
	}

}
