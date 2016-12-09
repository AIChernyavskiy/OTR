package otr;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String IPADDRESS_PATTERN =
            "^([1][9][2])\\." +
                    "([1][6][8])\\." +
                    "([0])\\." +
                    "([1-9]|[1][0-9][0-9]?|[2][0-9]|[2][0-4][0-9]|[2][5][0-6])$";

    public IPAddressValidator() {
        this.pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

    public boolean validate(final String ip) {
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
