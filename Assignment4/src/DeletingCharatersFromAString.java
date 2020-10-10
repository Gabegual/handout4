import acm.program.*;
import acm.util.*;

public class DeletingCharatersFromAString extends ConsoleProgram {

	public void run () {
		
		println (removeAllOccurrences(
				"The monitor, or forktongued lizard, which burrows in the earth, climbs and swims, is said to grow to a length of 8 to 9 f t.",'t'));
		
		
	}

	public String removeAllOccurrences(String str, char ch) {
		String oreo = "";
		
			
			for ( int i = 0; i < str.length(); i++) {
				
				if ( ch !=str.charAt(i)) {
					oreo += str.charAt(i); 
					
				}
				 
				 
				
				
			}
			return oreo;
	}
}
