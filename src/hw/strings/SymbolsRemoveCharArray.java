package hw.strings;

public class SymbolsRemoveCharArray implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		char[] array =str.toCharArray();
		int newIndex=0;
		for(char c:array) {
			if(c!= symbol) {
				array[newIndex++]=c;
			}
		}
		return new String(array,0,newIndex);
	}

}
