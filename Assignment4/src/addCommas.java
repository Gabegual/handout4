import acm.program.*;

public class addCommas extends ConsoleProgram {
	public void run() {
		while (true) {
			String digits = readLine("Line:Enter A Numeric String");

			if (digits.length() == 0) {
				break;
			}
			println(addCommasToNumericString(digits));

		}	
	}

	private String addCommasToNumericString(String digits) {
		String s1 = "";
		int letterSelector = digits.length();
		if (digits.length() >= 4) {
			for (int e = 0; e < digits.length(); e++) {
				letterSelector--;
				if (letterSelector < 0) {
					letterSelector = 0;
				}
				if (e % 3 == 0 && e != 0) {
					s1 += (",");
				}
				s1 += digits.charAt(letterSelector);
			}
			return (new StringBuilder(s1).reverse().toString());
		}
		else {
			return digits;
		}
		
	}
}
