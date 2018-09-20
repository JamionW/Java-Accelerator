package commaStripPackage;

public class CommaStrip {
	private String commaString;
	private int commaStringLength;
	private int delimiterIndex;
	private String firstSubstring;
	private String lastSubstring;
	private String noCommaNumber;
	
	// grab the main program's input
	public CommaStrip(String commaStr) {
		commaString = commaStr;
	}
	
	// grab the length of the input string
	public void stringLength(String commaString) {
		commaStringLength = commaString.length();
	}
	
	// grab the first occurrence of the comma within the input string
	public void grabDelimiterPrefix(String commaString, String delimiterString) {
		delimiterIndex = commaString.indexOf(delimiterString);
	}
	
	// use the delimiterIndex to carve out everything before and after the delimiter (comma)
	public void carveString(String commaString, int delimiterIndex) {
		firstSubstring = commaString.substring(0, delimiterIndex);
		lastSubstring = commaString.substring(delimiterIndex + 1, commaStringLength);
	}
	
	// and then re-attach the string from its component parts
	public void removeFirstDelimiter(String firstSubstring, String lastSubstring) {
		noCommaNumber = firstSubstring + lastSubstring;
	}
	
	// return length back to main
	public int getStringLength() {
		return commaStringLength;
	}
	
	// return delimiter position back to main
	public int getDelimiterIndex() {
		return delimiterIndex;
	}
	
	// return component piece one back to main
	public String getFirstSubstring() {
		return firstSubstring;
	}
	
	// return component piece two back to main
	public String getLastSubstring() {
		return lastSubstring;
	}
	
	// return sanitized string back to main
	public String getStringNoDelimiter() {
		return noCommaNumber;
	}
}
