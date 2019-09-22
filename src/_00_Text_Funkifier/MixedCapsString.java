package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
	String cap="";
		for (int i = 0; i < s.length(); i++) {
		if (i%2==1) {
			cap+=Character.toUpperCase(s.charAt(i));
		}
		if (i%2==0) {
			cap+=Character.toLowerCase(s.charAt(i));
		}
		}
		return cap;
	}

}
