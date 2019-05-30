package sistemavalidacion;

public enum ExpresionesRegulares {

	dni("\\d{8}[a-hA-H|j-nJ-N|p-zP-Z]");
	private String regex;

	private ExpresionesRegulares(String regex) {
		this.regex = regex;
	}

	public String getRegex() {
		return regex;
	}

}
