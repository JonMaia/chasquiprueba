package email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionEmail {
	
	private static final String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
		      "[a-z0-9-]*(\\.[a-z]{2,4})$";
	private static Pattern pattern;
	private Matcher matcher;
	
	public ValidacionEmail(){
		pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
	}
	
	public boolean validateEmail(String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}


