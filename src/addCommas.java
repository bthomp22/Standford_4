
public class addCommas {

	private String addCommasToNumericString(String digits) {
		String str = "";
		int numbers = 0;
		for (int i = digits.length() - 1; i >= 0; i--) {
		str = digits.charAt(i) + str;
		numbers++;
		if (((numbers % 3) == 0) && (i > 0)) {
		str = "," + str;
		}
		}
		return str;
		}
	
	private String removeAllOccurrences(String str, char ch) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) != ch) {
		newStr += str.charAt(i);
		}
		}
		return newStr;
		}

}
