package validar;

import java.util.regex.Pattern;

public class Validador {

	public static void main(String[] args) {
		// Cracteres literales
		String regex = "9";
		System.out.println(Pattern.matches(regex, "9"));
		System.out.println(Pattern.matches(regex, "a"));
		System.out.println(Pattern.matches(regex, "a9"));
		System.out.println(Pattern.matches(regex, " 9"));
		regex = "n";
		System.out.println(Pattern.matches(regex, "ñ"));
		System.out.println(Pattern.matches(regex, "N"));
		System.out.println(Pattern.matches(regex, "n"));
		regex = "c.s.";
		System.out.println(Pattern.matches(regex, "casa"));
		System.out.println(Pattern.matches(regex, "cosa"));
		System.out.println(Pattern.matches(regex, "cesa"));
		System.out.println(Pattern.matches(regex, "coso"));
		System.out.println(Pattern.matches(regex, "c;s7"));
		System.out.println(Pattern.matches(regex, "c s7"));
		System.out.println(Pattern.matches(regex, "casoplon"));
		regex = "[12][0-9]|[3][01]|[0][1-9]";
		System.out.println(Pattern.matches(regex, "56"));
		System.out.println(Pattern.matches(regex, "35"));
		System.out.println(Pattern.matches(regex, "00"));
		System.out.println(Pattern.matches(regex, "311"));
		for (int i = 10; i < 32; i++) {
			if (!Pattern.matches(regex, Integer.toString(i))) {
				System.out.println("error");
			}
		}
		regex="pa?n";
		System.out.println("con ?");
		System.out.println(Pattern.matches(regex, "paan"));
		System.out.println(Pattern.matches(regex, "pan"));
		System.out.println(Pattern.matches(regex, "pn"));
		regex="pa+n";
		System.out.println("con +");
		System.out.println(Pattern.matches(regex, "paan"));
		System.out.println(Pattern.matches(regex, "pan"));
		System.out.println(Pattern.matches(regex, "pn"));
		regex="pa*n";
		System.out.println("con *");
		System.out.println(Pattern.matches(regex, "paan"));
		System.out.println(Pattern.matches(regex, "pan"));
		System.out.println(Pattern.matches(regex, "pn"));
		regex="9\\d{8}";
		System.out.println("los tlefonos");
		System.out.println(Pattern.matches(regex, "987785565"));
		System.out.println(Pattern.matches(regex, "887785565"));
		System.out.println(Pattern.matches(regex, "98785565"));
		System.out.println(Pattern.matches(regex, "9878556500"));
		System.out.println(Pattern.matches(regex, "9878o56500"));
		System.out.println(Pattern.matches(regex, "9878o5650"));
		System.out.println("los moviles");
		regex="[67]\\d{8}";
		System.out.println("el dni");
		regex="\\d{8}[a-hA-H|j-nJ-N|p-zP-Z]";
		System.out.println(Pattern.matches(regex, "98786509p"));
		System.out.println(Pattern.matches(regex, "98786509P"));
		System.out.println(Pattern.matches(regex, "98786509i"));
		System.out.println(Pattern.matches(regex, "98786509o"));
		

	}

}
