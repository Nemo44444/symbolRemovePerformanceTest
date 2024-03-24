package hw.perfomance.strings;

import hw.strings.SymbolsRemoveCharArray;
import hw.strings.SymbolsRemoveStandard;

	public class SymbolsRemovePerformanceApp {

	    private static final int N_SYMBOLS = 10000;
		private static final int  N_RUNS = 10000;
	    public static void main(String[] args) {
	      
	        String testString = generateRandomString(N_SYMBOLS);
	        char symbolToRemove = getRandomAsciiChar();

	       
	        SymbolsRemovePerformanceTest charArrayTest = new SymbolsRemovePerformanceTest(
	                "SymbolsRemoveCharArray Performance", N_RUNS, 
	                new SymbolsRemoveCharArray(), testString, symbolToRemove);
	        SymbolsRemovePerformanceTest standardTest = new SymbolsRemovePerformanceTest(
	                "SymbolsRemoveStandard Performance", N_RUNS,
	                new SymbolsRemoveStandard(), testString, symbolToRemove);
	        charArrayTest.run();
	        standardTest.run();
	    }

	    private static String generateRandomString(int length) {
	        
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	        	stringBuilder.append((char) (Math.random() * (126 - 32) + 32));
	        }
	        return stringBuilder.toString();
	    }

	    private static char getRandomAsciiChar() {
	        return (char) (Math.random() * (126 - 32) + 32); 
	    }
	    
	
}
