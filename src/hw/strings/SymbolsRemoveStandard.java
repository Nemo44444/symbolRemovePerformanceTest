package hw.strings;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		return str.replaceAll(String.valueOf(symbol), "");
	}

}
