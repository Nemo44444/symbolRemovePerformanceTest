package hw.perfomance.strings;

import hw.strings.SymbolsRemove;
import telrans.perfomance.PerfomanceTest;

public class SymbolsRemovePerformanceTest extends PerfomanceTest {
	String str;
	SymbolsRemove symbolsRemove;
	char symbolToRemove;
	public SymbolsRemovePerformanceTest(String dispalyName, int nRuns,
			SymbolsRemove symbolsRemove,String str ,char symbolToRemove) {
		super(dispalyName, nRuns);
		this.symbolsRemove = symbolsRemove;
		this.str =str;
		this.symbolToRemove =symbolToRemove;
	}
	@Override
	protected void runTest() {
		symbolsRemove.removeSymbol(str, symbolToRemove);
	}
	
	

}
