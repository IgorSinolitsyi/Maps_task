package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationInputString {

    public static boolean isStringMatches(String string,String StringPattern) {
        Pattern pattern = Pattern.compile(StringPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
